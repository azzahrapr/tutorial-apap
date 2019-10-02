package apap.tutorial.gopud.controller;

import apap.tutorial.gopud.model.MenuModel;
import apap.tutorial.gopud.service.MenuService;
import apap.tutorial.gopud.service.RestoranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import apap.tutorial.gopud.model.RestoranModel;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
public class RestoranController {
    @Qualifier("restoranServiceImpl")
    @Autowired
    private RestoranService restoranService;

    @Autowired
    private MenuService menuService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    //URL mapping untuk mengakses halaman add restoran
    @RequestMapping(value = "/restoran/add", method = RequestMethod.GET)
    public String addRestoranFormPage(Model model){
        RestoranModel newRestoran = new RestoranModel();
        model.addAttribute("restoran", newRestoran);
        return "form-add-restoran";
    }

    //URL mapping untuk submit form yang telah anda masuukan pada halaman add restoran
    @RequestMapping(value = "/restoran/add", method = RequestMethod.POST)
    public String addRestoranSubmit(@ModelAttribute RestoranModel restoran, Model model){
        restoranService.addRestoran(restoran);
        model.addAttribute("namaResto", restoran.getNama());
        return "add-restoran";
    }

    //URL mapping view
    @RequestMapping(path = "/restoran/view", method = RequestMethod.GET)
    public String view(
            //request parameter untuk dipass
            @RequestParam(value = "idRestoran") Long idRestoran, Model model)
    {
        //mengambil objek RestoranModel yang dituju
        RestoranModel restoran = restoranService.getRestoranByIdRestoran(idRestoran).get();

        List<MenuModel> menuList = menuService.getListMenuOrderByHargaAsc(restoran.getIdRestoran());
        restoran.setListMenu(menuList);

        //add model restoran ke "resto" untuk dirender
        model.addAttribute("resto", restoran);

        //return view template
        return "view-restoran";

//        List<MenuModel> menuList = menuService.findAllMenuByIdRestoran(restoran.getIdRestoran());
//        model.addAttribute("menuList", menuList);
    }

    //API yang digunakan untuk menuju halaman form change restoran
    @RequestMapping(value = "restoran/change/{idRestoran}", method = RequestMethod.GET)
    public String changeRestoranFormPage(@PathVariable Long idRestoran, Model model){
        //mengambil existing data restoran
        RestoranModel existingRestoran = restoranService.getRestoranByIdRestoran(idRestoran).get();
        model.addAttribute("restoran", existingRestoran);
        return "form-change-restoran";
    }

    //API yang digunakan untuk submit form change restoran
    @RequestMapping(value = "/restoran/change/{idRestoran}", method = RequestMethod.POST)
    public String changeRestoranFormSubmit(@PathVariable Long idRestoran, @ModelAttribute RestoranModel restoran, Model model){
        RestoranModel newRestoranData = restoranService.changeRestoran(restoran);
        model.addAttribute("restoran", newRestoranData);
        return "change-restoran";
    }

    //URL mapping viewAll
    @RequestMapping("/restoran/view-all")
    public String viewall(Model model){
        //mengambil semua objek RestoranModel yang ada
        List<RestoranModel> listRestoran = restoranService.getRestoranList();

        Collections.sort(listRestoran);

        //add model restoran ke "resto" untuk dirender
        model.addAttribute("restoList", listRestoran);

        //return view template
        return "viewall-restoran";
    }

    @RequestMapping("/restoran/delete/{idRestoran}")
    public String delete(@PathVariable(value = "idRestoran") Long idRestoran, @ModelAttribute RestoranModel restoran, Model model){
        List<RestoranModel> restoList = restoranService.getRestoranList();
        for (RestoranModel resto : restoList){
            if (resto.getIdRestoran() == idRestoran) {
                RestoranModel restoToDelete = resto;
                if (restoToDelete.getListMenu().isEmpty()){
                    restoranService.deleteRestoran(restoToDelete);
                    return "delete-restoran";
                }
            }

        }
        return "delete-error";
    }

//    @RequestMapping("restoran/view/{nama}/{harga}")
//    public String viewMenu(@PathVariable(value = "nama") String nama, @PathVariable(value = "harga") BigInteger harga, @ModelAttribute MenuModel menu, Model model){
//        Optional<MenuModel> menuList = menuService.getMenuByNamaAndHarga(nama, harga);
//        model.addAttribute("menuList", menuList);
//        return "view-menu";
//    }
}