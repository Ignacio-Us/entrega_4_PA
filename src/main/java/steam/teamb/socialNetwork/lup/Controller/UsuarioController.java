package steam.teamb.socialNetwork.lup.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import steam.teamb.socialNetwork.lup.Model.Usuario;
import steam.teamb.socialNetwork.lup.Service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/datos_usuario")
@RequiredArgsConstructor
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;


    @GetMapping("/usuario")
    @ResponseBody
    public List<Usuario> listarUsuario()
    {
        return usuarioService.listarUsuario();
    }

    @PostMapping("/usuario")
    @ResponseBody
    public Usuario crearUsuario(@RequestBody Usuario usuario)
    {
        return  usuarioService.crearUsuario(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public void borrarUsuario(@PathVariable Long id)
    {
        usuarioService.borrarUsuario(id);
    }

    @GetMapping("/usuario/{id}")
    @ResponseBody
    public Usuario buscarUsuarioPorId(@PathVariable Long id)
    {
        return usuarioService.buscarUsuarioPorId(id);
    }

    @PutMapping("/usuario")
    public void modificarUsuario(@RequestBody Usuario usuario)
    {
        usuarioService.modificarUsuario(usuario);
    }




}
