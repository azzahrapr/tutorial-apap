package apap.tutorial.gopud.service;

import apap.tutorial.gopud.model.RestoranModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RestoranInMemoryService implements RestoranService{
    private List<RestoranModel> listRestoran;

    //Constructor
    public RestoranInMemoryService(){
        listRestoran = new ArrayList<>();
    }

    @Override
    public void addRestoran(RestoranModel restoran){
        listRestoran.add(restoran);
    }

    @Override
    public List<RestoranModel> getRestoranList(){
        return listRestoran;
    }

//    @Override
//    public Optional<RestoranModel> getRestoranByIdRestoran(long idRestoran) {
//        return Optional.empty();
//    }

    @Override
    public RestoranModel changeRestoran(RestoranModel restoranModel) {
        return null;
    }

    @Override
    public void deleteRestoran(RestoranModel restoranModel) { }

    @Override
    public Optional<RestoranModel> getRestoranByIdRestoran(Long idRestoran){
        RestoranModel restoran = null;
        for(int i=0; i < listRestoran.size(); i++){
            if(listRestoran.get(i).getIdRestoran() == idRestoran){
                restoran = listRestoran.get(i);

            }
        }
        return Optional.ofNullable(restoran);
    }
}
