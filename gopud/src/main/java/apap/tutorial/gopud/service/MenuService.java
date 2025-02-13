package apap.tutorial.gopud.service;

import apap.tutorial.gopud.model.MenuModel;
import apap.tutorial.gopud.model.RestoranModel;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface MenuService {
    void addMenu(MenuModel menu);

    List<MenuModel> findAllMenuByIdRestoran(Long idRestoran);

    Optional<MenuModel> getMenuById(Long id);

    MenuModel changeMenu(MenuModel menuModel);

    void deleteMenu(MenuModel menuModel);

    List<MenuModel> getListMenuOrderByHargaAsc(Long idRestoran);

//    MenuModel getMenuByNamaAndHarga(String nama, BigInteger harga);
}
