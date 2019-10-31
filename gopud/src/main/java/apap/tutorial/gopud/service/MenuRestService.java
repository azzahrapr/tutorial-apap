package apap.tutorial.gopud.service;

import apap.tutorial.gopud.model.MenuModel;

import java.util.List;

public interface MenuRestService {
    MenuModel addMenu(MenuModel menu);
    MenuModel updateMenu(Long idMenu, MenuModel menuUpdate);
    List<MenuModel> retrieveListMenu();
    MenuModel getMenuByIdMenu(Long idMenu);
    void deleteMenu(Long idMenu);

}
