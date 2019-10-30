package apap.tutorial.gopud.model;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="restoran")
public class RestoranModel implements Serializable, Comparable<RestoranModel> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRestoran;

    public long getIdRestoran() {
        return idRestoran;
    }

    public void setIdRestoran(long idRestoran) {
        this.idRestoran = idRestoran;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<MenuModel> getListMenu() {
        return listMenu;
    }

    public void setListMenu(List<MenuModel> listMenu) {
        this.listMenu = listMenu;
    }

    @NotNull
    @Size(max = 26)
    @Column(name = "nama", nullable = false)
    private String nama;

    @NotNull
    @Size(max = 30)
    @Column(name = "alamat", nullable = false)
    private String alamat;

    @NotNull
    @Column(name = "nomorTelepon", nullable = false)
    private Integer nomorTelepon;

    @NotNull
    @Column(name = "rating", nullable = false)
    private Integer rating = 0;

    @OneToMany(mappedBy = "restoran", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MenuModel> listMenu;


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(Integer nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

//    public RestoranModel(long idRestoran, String nama, String alamat, Integer nomorTelepon) {
//        this.idRestoran = idRestoran;
//        this.nama = nama;
//        this.alamat = alamat;
//        this.nomorTelepon = nomorTelepon;
//
//    }

    public int compareTo(RestoranModel restoLain) {
        return this.nama.compareTo(restoLain.nama);
    }
}
