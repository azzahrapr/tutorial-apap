package apap.tutorial.gopud.service;

import apap.tutorial.gopud.model.MenuModel;
import apap.tutorial.gopud.model.RestoranModel;

<<<<<<< HEAD
import java.math.BigInteger;
=======
import java.awt.*;
>>>>>>> 2dc6ba4e86071f3a821272fd97c500b57bb99f1c
import java.util.List;
import java.util.Optional;

public interface MenuService {
    void addMenu(MenuModel menu);

    List<MenuModel> findAllMenuByIdRestoran(Long idRestoran);

    Optional<MenuModel> getMenuById(Long id);

    MenuModel changeMenu(MenuModel menuModel);

    void deleteMenu(MenuModel menuModel);
<<<<<<< HEAD

    List<MenuModel> getListMenuOrderByHargaAsc(Long idRestoran);

//    MenuModel getMenuByNamaAndHarga(String nama, BigInteger harga);
=======
>>>>>>> 2dc6ba4e86071f3a821272fd97c500b57bb99f1c
}
