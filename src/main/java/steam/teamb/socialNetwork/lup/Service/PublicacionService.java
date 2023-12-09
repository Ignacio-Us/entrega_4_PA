package steam.teamb.socialNetwork.lup.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import steam.teamb.socialNetwork.lup.Model.Publicacion;
import steam.teamb.socialNetwork.lup.Repository.PublicacionRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class PublicacionService {

    @Autowired
    PublicacionRepository publicacionRepository;

    public ArrayList<Publicacion> obtenerPublicacion(){
        return (ArrayList<Publicacion>) publicacionRepository.findAll();
    }

    public Publicacion guardarPublicacion(Publicacion publicacion){
        return publicacionRepository.save(publicacion);
    }
}
