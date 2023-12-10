package steam.teamb.socialNetwork.lup.Impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import steam.teamb.socialNetwork.lup.DTO.UsuarioDTO;
import steam.teamb.socialNetwork.lup.Model.Usuario;
import steam.teamb.socialNetwork.lup.Repository.UsuarioRepository;
import steam.teamb.socialNetwork.lup.Service.UsuarioService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserImpl implements UsuarioService {
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

    public UsuarioDTO buscarUsuarioPorId(Long id)
    {
        final Optional<Usuario> usuarioEncontrado = Optional.ofNullable(usuarioRepo.findById(id).orElse(null));
        if(usuarioEncontrado.isEmpty())
        {
            throw new EntityNotFoundException("Usuario con id "+id+" no encontrado");
        }
        final Usuario usuarioBD = usuarioEncontrado.get();

        return new UsuarioDTO(usuarioBD.getNick_name(), usuarioBD.getImagen());

    }

    public void modificarUsuario(Usuario usuario)
    {
        usuarioRepo.save(usuario);
    }
}
