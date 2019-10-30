package apap.tutorial.gopud.controller;

import apap.tutorial.gopud.model.MenuModel;
import apap.tutorial.gopud.model.RestoranModel;
import apap.tutorial.gopud.service.MenuService;
import apap.tutorial.gopud.service.RestoranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.ui.ModelMap;
=======
>>>>>>> 2dc6ba4e86071f3a821272fd97c500b57bb99f1c
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
=======

>>>>>>> 2dc6ba4e86071f3a821272fd97c500b57bb99f1c
import java.awt.*;
import java.util.List;

@Controller
public class MenuController {
    @Autowired
    MenuService menuService;

    @Qualifier("restoranServiceImpl")
    @Autowired
    RestoranService restoranService;
<<<<<<< HEAD
//
//    @RequestMapping(value = "menu/add/{idRestoran}", method = RequestMethod.GET)
//    private String addProductFormPage(@PathVariable(value = "idRestoran") Long idRestoran, Model model){
//        MenuModel menu = new MenuModel();
//        RestoranModel restoran = restoranService.getRestoranByIdRestoran(idRestoran).get();
//        menu.setRestoran(restoran);
//
//        model.addAttribute("menu", menu);
//        return "form-add-menu";
//    }
//
//    @RequestMapping(value = "menu/add", method = RequestMethod.POST)
//    private String addProductSubmit(@ModelAttribute MenuModel menu, Model model){
//        menuService.addMenu(menu);
//
//        model.addAttribute("nama", menu.getNama());
//
//        return "add-menu";
//    }
=======

    @RequestMapping(value = "menu/add/{idRestoran}", method = RequestMethod.GET)
    private String addProductFormPage(@PathVariable(value = "idRestoran") Long idRestoran, Model model){
        MenuModel menu = new MenuModel();
        RestoranModel restoran = restoranService.getRestoranByIdRestoran(idRestoran).get();
        menu.setRestoran(restoran);

        model.addAttribute("menu", menu);
        return "form-add-menu";
    }

    @RequestMapping(value = "menu/add", method = RequestMethod.POST)
    private String addProductSubmit(@ModelAttribute MenuModel menu, Model model){
        menuService.addMenu(menu);

        model.addAttribute("nama", menu.getNama());

        return "add-menu";
    }
>>>>>>> 2dc6ba4e86071f3a821272fd97c500b57bb99f1c

    //API yang digunakan untuk menuju halaman form change menu
    @RequestMapping(value = "menu/change/{id}", method = RequestMethod.GET)
    public String changeMenuFormPage(@PathVariable Long id, Model model){
        //mengambil existing data menu
        MenuModel existingMenu = menuService.getMenuById(id).get();
        model.addAttribute("menu", existingMenu);
        return "form-change-menu";
    }

    //API yang digunakan untuk submit form change menu
    @RequestMapping(value = "/menu/change/{id}", method = RequestMethod.POST)
    public String changeMenuFormSubmit(@PathVariable Long id, @ModelAttribute MenuModel menu, Model model){
        MenuModel newMenuData = menuService.changeMenu(menu);
        model.addAttribute("menu", newMenuData);
        return "change-menu";
    }

<<<<<<< HEAD

    @RequestMapping(value = "/menu/delete", method = RequestMethod.POST)
    public String delete(@ModelAttribute RestoranModel restoran, Model model){
        for (MenuModel menu : restoran.getListMenu()){
            menuService.deleteMenu(menu);
        }
        return "delete-menu";
    }

=======
>>>>>>> 2dc6ba4e86071f3a821272fd97c500b57bb99f1c
    @RequestMapping("/menu/delete/{id}")
    public String delete(@PathVariable(value = "id") Long id, @ModelAttribute MenuModel menu, Model model){
        MenuModel menuToDelete = menuService.getMenuById(id).get();
        menuService.deleteMenu(menuToDelete);
        return "delete-menu";
        }
<<<<<<< HEAD

    @RequestMapping(value = "/menu/add/{idRestoran}")
    private String addMenuFormPage(@PathVariable(value = "idRestoran") Long idRestoran, Model model){
        RestoranModel restoran = new RestoranModel();
        restoran.setListMenu((new ArrayList<MenuModel>()));
        restoran.getListMenu().add(new MenuModel());
        model.addAttribute("restoran", restoran);
        model.addAttribute("idRestoran", idRestoran);

        return "form-add-menu";
    }

    @RequestMapping(value = "/menu/add/{idRestoran}", method = RequestMethod.POST, params = {"addRow"})
    private String addRow(@PathVariable(value = "idRestoran") Long idRestoran, @ModelAttribute RestoranModel restoran, Model model){
        MenuModel menu = new MenuModel();
        restoran.getListMenu().add(menu);
        model.addAttribute("restoran", restoran);
        model.addAttribute("idRestoran", idRestoran);
        return "form-add-menu";
    }


    @RequestMapping(value = "/menu/add/{idRestoran}", method = RequestMethod.POST, params = {"removeRow"})
    private String removeRow(@PathVariable(value = "idRestoran") Long idRestoran, @ModelAttribute RestoranModel restoran, Model model, HttpServletRequest req){
        Integer rowId = Integer.valueOf(req.getParameter("removeRow"));
        restoran.getListMenu().remove(rowId.intValue());
        model.addAttribute("idRestoran", idRestoran);
        model.addAttribute("restoran", restoran);
        return "form-add-menu";
    }

    @RequestMapping(value = "/menu/add/{idRestoran}", method = RequestMethod.POST, params = {"save"})
    private String addMenuSubmit(@PathVariable(value = "idRestoran") Long idRestoran, @ModelAttribute RestoranModel restoran, ModelMap model){
        RestoranModel oldResto = restoranService.getRestoranByIdRestoran(idRestoran).get();
        model.addAttribute("idRestoran", idRestoran);
        for (MenuModel menu : restoran.getListMenu()){
            menu.setRestoran(oldResto);
            menuService.addMenu(menu);
        }
        model.clear();
        return "add-menu";
    }
=======
>>>>>>> 2dc6ba4e86071f3a821272fd97c500b57bb99f1c
}
