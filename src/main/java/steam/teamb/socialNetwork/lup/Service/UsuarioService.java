package steam.teamb.socialNetwork.lup.Service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import steam.teamb.socialNetwork.lup.Model.Usuario;
import steam.teamb.socialNetwork.lup.Repository.UsuarioRepository;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepo;
    public void crearUsuario(Usuario usuario){

        usuarioRepo.save(usuario);
    }

}


