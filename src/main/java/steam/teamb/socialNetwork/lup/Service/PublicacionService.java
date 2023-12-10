package steam.teamb.socialNetwork.lup.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import steam.teamb.socialNetwork.lup.DTO.PublicacionDTO;
import steam.teamb.socialNetwork.lup.Model.Publicacion;
import steam.teamb.socialNetwork.lup.Model.Usuario;
import steam.teamb.socialNetwork.lup.Repository.PublicacionRepository;
import steam.teamb.socialNetwork.lup.Repository.UsuarioRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PublicacionService {

    private final PublicacionRepository publicacionRepository;
    private final UsuarioRepository usuarioRepository;

    public void crearPublicacion(Publicacion publicacion){
        publicacionRepository.save(publicacion);
    }

    public ArrayList<Publicacion> obtenerPublicacion(){
        return (ArrayList<Publicacion>) publicacionRepository.findAll();
    }

    public void borrarPublicacion(Long id) {
        publicacionRepository.deleteById(id);
    }

    public Publicacion guardarPublicacion(Publicacion publicacion){
        return publicacionRepository.save(publicacion);
    }

    public Publicacion buscarPublicacionPorId(Long id) {
        return publicacionRepository.findById(id).orElse(null);
    }

    public void editarPublicacion(Publicacion publicacion) {
        publicacionRepository.save(publicacion);
    }

    public ArrayList<PublicacionDTO> mostrarPublicacionPorIdUsuario(Long idUsuario){
        ArrayList <Publicacion> publicaciones= publicacionRepository.findByIdUsuario(idUsuario);
        ArrayList <PublicacionDTO> publicacionesDTO = new ArrayList<>();

        Usuario usuario = usuarioRepository.findById(idUsuario).orElse(null);

        for (Publicacion publicacion: publicaciones) {
            publicacionesDTO.add(new PublicacionDTO(usuario != null ? usuario.getNick_name() : "Desconocido", publicacion.getTitulo(), publicacion.getContenido()));
        }
        
        return publicacionesDTO;
    }
}
