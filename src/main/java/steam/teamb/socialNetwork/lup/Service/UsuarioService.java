package steam.teamb.socialNetwork.lup.Service;

import steam.teamb.socialNetwork.lup.DTO.UsuarioDTO;
import steam.teamb.socialNetwork.lup.Model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario crearUsuario(Usuario usuario);
    void borrarUsuario(Long id);
    List<Usuario> listarUsuario();
    UsuarioDTO buscarUsuarioPorId(Long id);
    void modificarUsuario(Usuario usuario);

}


