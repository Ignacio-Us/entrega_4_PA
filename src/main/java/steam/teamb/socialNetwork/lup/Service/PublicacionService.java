package steam.teamb.socialNetwork.lup.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import steam.teamb.socialNetwork.lup.Model.Publicacion;
import steam.teamb.socialNetwork.lup.Repository.PublicacionRepository;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PublicacionService {

    private final PublicacionRepository publicacionRepository;

    public void crearPublicacion(Publicacion publicacion){
        publicacionRepository.save(publicacion);
    }

    public ArrayList<Publicacion> obtenerPublicacion(){
        return (ArrayList<Publicacion>) publicacionRepository.findAll();
    }

    public Publicacion guardarPublicacion(Publicacion publicacion){
        return publicacionRepository.save(publicacion);
    }
}
