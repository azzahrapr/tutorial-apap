package apap.tutorial.gopud.service;

import apap.tutorial.gopud.model.MenuModel;
<<<<<<< HEAD
import apap.tutorial.gopud.model.RestoranModel;
import apap.tutorial.gopud.repository.MenuDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
=======
import apap.tutorial.gopud.repository.MenuDB;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
>>>>>>> 2dc6ba4e86071f3a821272fd97c500b57bb99f1c
import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDB menuDB;

    @Override
    public void addMenu(MenuModel menu) {
        menuDB.save(menu);
    }

    @Override
    public List<MenuModel> findAllMenuByIdRestoran(Long idRestoran) {
        return menuDB.findByRestoranIdRestoran(idRestoran);
    }

    @Override
    public Optional<MenuModel> getMenuById(Long id){
        return menuDB.findById(id);
    }

    @Override
    public MenuModel changeMenu(MenuModel menuModel) {
        MenuModel targetMenu = menuDB.findById(menuModel.getId()).get();

        try {
            targetMenu.setNama(menuModel.getNama());
            targetMenu.setDeskripsi(menuModel.getDeskripsi());
            targetMenu.setDurasiMasak(menuModel.getDurasiMasak());
            targetMenu.setHarga(menuModel.getHarga());
            menuDB.save(targetMenu);
            return targetMenu;
        } catch (NullPointerException nullException) {
            return null;
        }
    }

    @Override
    public void deleteMenu(MenuModel menuModel){
        menuDB.delete(menuModel);
    }
<<<<<<< HEAD

    @Override
    public List<MenuModel> getListMenuOrderByHargaAsc(Long idRestoran){
        return menuDB.findByRestoranIdRestoranOrderByHargaAsc(idRestoran);
    }
=======
>>>>>>> 2dc6ba4e86071f3a821272fd97c500b57bb99f1c
}
