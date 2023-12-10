package steam.teamb.socialNetwork.lup.Service;

import steam.teamb.socialNetwork.lup.DTO.PublicacionDTO;
import steam.teamb.socialNetwork.lup.Model.Publicacion;

import java.util.ArrayList;

public interface PublicacionService {

    void crearPublicacion(Publicacion publicacion);
    ArrayList<Publicacion> obtenerPublicacion();
    void borrarPublicacion(Long id);
    Publicacion buscarPublicacionPorId(Long id);
    void editarPublicacion(Publicacion publicacion);
    ArrayList<PublicacionDTO> mostrarPublicacionPorIdUsuario(Long idUsuario);

}
