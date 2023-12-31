package steam.teamb.socialNetwork.lup.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import steam.teamb.socialNetwork.lup.DTO.PublicacionDTO;
import steam.teamb.socialNetwork.lup.Impl.PublicacionImpl;
import steam.teamb.socialNetwork.lup.Model.Publicacion;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PublicacionController{

    private final PublicacionImpl publicacionService;

    @GetMapping("publicaciones")
    @ResponseBody
    public List<Publicacion> mostrarPublicacion(){
        return publicacionService.obtenerPublicacion();
    }

    @GetMapping("publicaciones/{idUsuario}")
    @ResponseBody
    public ArrayList<PublicacionDTO> mostrarPublicacionPorIdUsuario(@PathVariable Long idUsuario){
        return publicacionService.mostrarPublicacionPorIdUsuario(idUsuario);
    }

    @GetMapping("publicacion/{id}")
    @ResponseBody
    public Publicacion buscarPublicacionPorId(@PathVariable Long id){
        return publicacionService.buscarPublicacionPorId(id);
    }

    @PostMapping("publicacion")
    public String crearPublicacion(@RequestParam("titulo") String titulo, @RequestParam("contenido") String contenido){

        Publicacion publicacion = new Publicacion(titulo,contenido,3L);

        publicacionService.crearPublicacion(publicacion);
        return "home-social-network";
    }

    @PutMapping("publicacion")
    public void editarPublicacion(@RequestBody Publicacion publicacion){
        publicacionService.editarPublicacion(publicacion);
    }

    @DeleteMapping("publicacion/{id}")
    public void borrarPublicacion(@PathVariable Long id){
        publicacionService.borrarPublicacion(id);
    }
}
