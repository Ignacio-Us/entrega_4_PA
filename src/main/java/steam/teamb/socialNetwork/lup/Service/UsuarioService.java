package steam.teamb.socialNetwork.lup.Service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import steam.teamb.socialNetwork.lup.Model.Usuario;
import steam.teamb.socialNetwork.lup.Repository.UsuarioRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepo;
    public Usuario crearUsuario(Usuario usuario)
    {
        return  usuarioRepo.save(usuario);
    }

    public void borrarUsuario(Long id)
    {
        usuarioRepo.deleteById(id);
    }

    public List<Usuario> listarUsuario()
    {
        return usuarioRepo.findAll();
    }

    public Usuario buscarUsuarioPorId(Long id)
    {
        return usuarioRepo.findById(id).orElse(null);
    }


    public void modificarUsuario(Usuario usuario) {
    }
}


