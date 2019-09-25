package apap.tutorial.gopud.controller;

import apap.tutorial.gopud.service.RestoranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import apap.tutorial.gopud.model.RestoranModel;
import apap.tutorial.gopud.service.RestoranService;

import java.util.List;

@Controller
public class RestoranController {
    @Autowired
    private RestoranService restoranService;
    //URL mapping add
    @RequestMapping("/restoran/add")
    public String add(
            //Request parameter untuk dipass
            @RequestParam(value = "idRestoran", required = true) String idRestoran,
            @RequestParam(value = "nama", required = true) String nama,
            @RequestParam(value = "alamat", required = true) String alamat,
            @RequestParam(value = "nomorTelepon", required = true) Integer nomorTelepon,
            Model model
    ){
        //membuat objek RestoranModel
        RestoranModel restoran = new RestoranModel(idRestoran, nama, alamat, nomorTelepon);

        //memanggil service addRestoran
        restoranService.addRestoran(restoran);

        //add variable nama restoran ke "namaResto" untuk dirender
        model.addAttribute("namaResto", nama);

        //return view template
        return "add-restoran";
    }

    //URL mapping view
    @RequestMapping("/restoran/view")
    public String view(
            //request parameter untuk dipass
            @RequestParam(value = "idRestoran") String idRestoran, Model model
    ){
        //mengambil objek RestoranModel yang dituju
        RestoranModel restoran = restoranService.getRestoranByIdRestoran(idRestoran);

        //add model restoran ke "resto" untuk dirender
        model.addAttribute("resto", restoran);

        //return view template
        return "view-restoran";
    }

    //URL mapping viewAll
    @RequestMapping("/restoran/viewall")
    public String viewall(Model model){
        //mengambil semua objek RestoranModel yang ada
        List<RestoranModel> listRestoran = restoranService.getRestoranList();

        //add model restoran ke "resto" untuk dirender
        model.addAttribute("restoList", listRestoran);

        //return view template
        return "viewall-restoran";
    }

    @GetMapping(value = "/restoran/view/idRestoran/{idRestoran}")
    public String viewWithPathVariable(
            @PathVariable(value = "idRestoran") String idRestoran, Model model
    ){
        //mengambil objek RestoranModel yang dituju
        RestoranModel restoran = restoranService.getRestoranByIdRestoran(idRestoran);

        //add model restoran ke "resto" untuk dirender
        model.addAttribute("resto", restoran);
        return "view-restoran";
    }

    @GetMapping(value = "/restoran/update/id-restoran/{idRestoran}/nomor-telepon/{nomorTelepon}")
    public String update(
            @PathVariable(value = "idRestoran") String idRestoran,
            @PathVariable(value = "nomorTelepon") Integer nomorTelepon,
            Model model
    ){
        //mengambil objek RestoranModel yang dituju
        RestoranModel restoran = restoranService.getRestoranByIdRestoran(idRestoran);
        restoran.setNomorTelepon(nomorTelepon);

        model.addAttribute("resto", restoran);
        return "update-restoran";
    }

    @GetMapping(value = "/restoran/delete/id/{idRestoran}")
    public String delete(
            @PathVariable(value = "idRestoran") String idRestoran,
            Model model
    ){
        List<RestoranModel> restoran = restoranService.getRestoranList();
        RestoranModel resto = restoranService.getRestoranByIdRestoran(idRestoran);

        for (int i=0 ; i < restoran.size() ; i++){
            if (restoran.get(i).getIdRestoran().equals(idRestoran)) {
                restoran.remove(i);
            }
        }
        model.addAttribute("resto", restoran);
        return "delete-restoran";
    }
}