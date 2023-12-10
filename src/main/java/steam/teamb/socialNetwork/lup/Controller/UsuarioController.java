package steam.teamb.socialNetwork.lup.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import steam.teamb.socialNetwork.lup.DTO.UsuarioDTO;
import steam.teamb.socialNetwork.lup.Impl.UserImpl;
import steam.teamb.socialNetwork.lup.Model.Usuario;

import java.util.List;

@RestController
@RequestMapping("/api/v1/datos")
@RequiredArgsConstructor
public class UsuarioController {

    @Autowired
    UserImpl usuarioService;


    @GetMapping("usuario")
    @ResponseBody
    public List<Usuario> listarUsuario()
    {
        return usuarioService.listarUsuario();
    }

    @GetMapping("usuario/{id}")
    @ResponseBody
    public UsuarioDTO buscarUsuarioPorId(@PathVariable Long id)
    {
        return usuarioService.buscarUsuarioPorId(id);
    }


    @PostMapping("usuario")
    @ResponseBody
    public Usuario crearUsuario(@RequestBody Usuario usuario)
    {
        return  usuarioService.crearUsuario(usuario);
    }

    @PutMapping("usuario")
    public void modificarUsuario(@RequestBody Usuario usuario)
    {
        usuarioService.modificarUsuario(usuario);
    }

    @DeleteMapping("usuario/{id}")
    public void borrarUsuario(@PathVariable Long id)
    {
        usuarioService.borrarUsuario(id);
    }

}
