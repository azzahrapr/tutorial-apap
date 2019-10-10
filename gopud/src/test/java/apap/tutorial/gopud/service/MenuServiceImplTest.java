package apap.tutorial.gopud.service;

import apap.tutorial.gopud.model.MenuModel;
import apap.tutorial.gopud.repository.MenuDB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.Silent.class)
public class MenuServiceImplTest {
    @InjectMocks
    MenuService menuService = new MenuServiceImpl();
    @Mock
    MenuDB menuDB;

    @Test
    public void whenAddValidMenuItShouldCallMenuRepositorySave() {
        MenuModel newMenu = new MenuModel();
        newMenu.setNama("lele");
        newMenu.setHarga(BigInteger.valueOf(8000));
        newMenu.setDurasiMasak(5);
        newMenu.setDeskripsi("enak");
        menuService.addMenu(newMenu);
        verify(menuDB, times(1)).save(newMenu);
    }

    @Test
    public void whenGetMenuListCalledItShouldReturnAllMenu() {
        List<MenuModel> allMenuInDatabase = new ArrayList<>();
        for (int loopTimes = 3; loopTimes > 0; loopTimes--) {
            allMenuInDatabase.add(new MenuModel()); }
        when (menuService.getListMenuOrderByHargaAsc(1L)).thenReturn(allMenuInDatabase);
        List<MenuModel> dataFromServiceCall = menuService.getListMenuOrderByHargaAsc(1l);
        assertEquals(3, dataFromServiceCall.size());
        verify(menuDB, times(1)).findByRestoranIdRestoranOrderByHargaAsc(1l);
    }

    @Test
    public void whenGetMenuByIdCalledByExistingDataItShouldReturnCorrectData() {
        MenuModel returnedData = new MenuModel();
        returnedData.setNama("lele");
        returnedData.setHarga(BigInteger.valueOf(8000));
        returnedData.setDurasiMasak(5);
        returnedData.setDeskripsi("enak");

        when(menuService.getMenuById(1L)).thenReturn(Optional.of(returnedData ));

        Optional<MenuModel> dataFromServiceCall = menuService.getMenuById(1L);

        verify(menuDB, times(1)).findById(1L);
        assertTrue(dataFromServiceCall.isPresent());
        MenuModel dataFromOptional = dataFromServiceCall.get();
        assertEquals("lele", dataFromOptional.getNama());
        assertEquals(BigInteger.valueOf(8000), dataFromOptional.getHarga());
        assertEquals(Integer.valueOf(5), dataFromOptional.getDurasiMasak());
        assertEquals("enak", dataFromOptional.getDeskripsi());
    }

    @Test
    public void whenChangeMenuCalledItShouldChangeMenuData() {
        MenuModel updatedData = new MenuModel();
        updatedData.setNama("lele");
        updatedData.setHarga(BigInteger.valueOf(8000));
        updatedData.setDurasiMasak(5);
        updatedData.setDeskripsi("enak");
        updatedData.setId((long) 1);

        when(menuDB.findById(1L)).thenReturn(Optional.of(updatedData));
        when(menuService.changeMenu(updatedData)).thenReturn(updatedData);

        MenuModel dataFromServiceCall = menuService.changeMenu(updatedData);
        assertEquals("lele", dataFromServiceCall.getNama());
        assertEquals(BigInteger.valueOf(8000), dataFromServiceCall.getHarga());
        assertEquals(Integer.valueOf(5), dataFromServiceCall.getDurasiMasak());
        assertEquals("enak", dataFromServiceCall.getDeskripsi());
    }

    @Test
    public void whenGetMenuListByRestoranIdCalledItShouldReturnAllMenu() {
        List<MenuModel> allMenuInDatabase = new ArrayList<>();
        for (int loopTimes = 3; loopTimes > 0; loopTimes--) {
            allMenuInDatabase.add(new MenuModel()); }
        when (menuService.findAllMenuByIdRestoran(1L)).thenReturn(allMenuInDatabase);
        List<MenuModel> dataFromServiceCall = menuService.findAllMenuByIdRestoran(1l);
        assertEquals(3, dataFromServiceCall.size());
        verify(menuDB, times(1)).findByRestoranIdRestoran(1l);
    }

    @Test
    public void whenDeleteMenuCalledItShouldDeleteMenuData(){
        MenuModel menuModel = new MenuModel();
        menuModel.setId((long)1);

        when(menuDB.findById(1L)).thenReturn(Optional.of(menuModel));
        menuService.deleteMenu(menuModel);

        verify(menuDB, times(1)).delete(menuModel);
    }


}
