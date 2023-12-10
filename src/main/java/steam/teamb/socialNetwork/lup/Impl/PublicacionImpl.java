package steam.teamb.socialNetwork.lup.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import steam.teamb.socialNetwork.lup.DTO.PublicacionDTO;
import steam.teamb.socialNetwork.lup.Model.Publicacion;
import steam.teamb.socialNetwork.lup.Model.Usuario;
import steam.teamb.socialNetwork.lup.Repository.PublicacionRepository;
import steam.teamb.socialNetwork.lup.Repository.UsuarioRepository;
import steam.teamb.socialNetwork.lup.Service.PublicacionService;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PublicacionImpl implements PublicacionService {

    private final PublicacionRepository publicacionRepository;
    private final UsuarioRepository usuarioRepository;

    @Override
    public void crearPublicacion(Publicacion publicacion){
        publicacionRepository.save(publicacion);
    }

    @Override
    public ArrayList<Publicacion> obtenerPublicacion(){
        return (ArrayList<Publicacion>) publicacionRepository.findAll();
    }

    @Override
    public void borrarPublicacion(Long id) {
        publicacionRepository.deleteById(id);
    }

    @Override
    public Publicacion buscarPublicacionPorId(Long id) {
        return publicacionRepository.findById(id).orElse(null);
    }

    @Override
    public void editarPublicacion(Publicacion publicacion) {
        publicacionRepository.save(publicacion);
    }

    @Override
    public ArrayList<PublicacionDTO> mostrarPublicacionPorIdUsuario(Long idUsuario){
        ArrayList <Publicacion> publicaciones= publicacionRepository.findByIdUsuario(idUsuario);
        ArrayList <PublicacionDTO> publicacionesDTO = new ArrayList<>();

        final Usuario usuario = usuarioRepository.findById(idUsuario).orElse(null);

        for (Publicacion publicacion: publicaciones) {
            publicacionesDTO.add(new PublicacionDTO(usuario != null ? usuario.getImagen() : "",
                    usuario != null ? usuario.getNick_name() : "Desconocido",
                    publicacion.getTitulo(), publicacion.getContenido()));
        }

        return publicacionesDTO;
    }
}
