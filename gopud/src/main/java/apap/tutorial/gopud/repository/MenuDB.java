package apap.tutorial.gopud.repository;

import apap.tutorial.gopud.model.MenuModel;
import apap.tutorial.gopud.model.RestoranModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface MenuDB extends JpaRepository<MenuModel, Long> {
    List<MenuModel> findByRestoranIdRestoran(Long restoranId);

    List<MenuModel> findByRestoranIdRestoranOrderByHargaAsc(Long restoranId);

    List<MenuModel> findAllByOrderByNamaAsc();
}
