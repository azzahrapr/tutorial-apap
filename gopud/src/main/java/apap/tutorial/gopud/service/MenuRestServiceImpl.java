package apap.tutorial.gopud.service;


import apap.tutorial.gopud.model.MenuModel;
import apap.tutorial.gopud.repository.MenuDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Transactional
public class MenuRestServiceImpl implements MenuRestService {
    @Autowired
    private MenuDB menuDB;

    @Override
    public MenuModel addMenu(MenuModel menu) {
        return menuDB.save(menu);
    }

    @Override
    public MenuModel updateMenu(Long idMenu, MenuModel menuUpdate) {
        MenuModel menu = getMenuByIdMenu(idMenu);
        menu.setDeskripsi(menuUpdate.getDeskripsi());
        menu.setDurasiMasak(menuUpdate.getDurasiMasak());
        menu.setHarga(menuUpdate.getHarga());
        menu.setNama(menuUpdate.getNama());
        return menuDB.save(menu);
    }

    @Override
    public List<MenuModel> retrieveListMenu() {
        return menuDB.findAllByOrderByNamaAsc();
    }

    @Override
    public MenuModel getMenuByIdMenu(Long idMenu) {
        Optional<MenuModel> menu = menuDB.findById(idMenu);
        if(menu.isPresent()){
            return menu.get();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void deleteMenu(Long idMenu) {
        MenuModel menu = getMenuByIdMenu(idMenu);
        menuDB.delete(menu);
    }
}
