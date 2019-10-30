package apap.tutorial.gopud.repository;

import apap.tutorial.gopud.model.MenuModel;
<<<<<<< HEAD
import apap.tutorial.gopud.model.RestoranModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
>>>>>>> 2dc6ba4e86071f3a821272fd97c500b57bb99f1c
import java.util.List;

@Repository
public interface MenuDB extends JpaRepository<MenuModel, Long> {
    List<MenuModel> findByRestoranIdRestoran(Long restoranId);
<<<<<<< HEAD

    List<MenuModel> findByRestoranIdRestoranOrderByHargaAsc(Long restoranId);
=======
>>>>>>> 2dc6ba4e86071f3a821272fd97c500b57bb99f1c
}
