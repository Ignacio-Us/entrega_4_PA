package steam.teamb.socialNetwork.lup.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import steam.teamb.socialNetwork.lup.DTO.PublicacionDTO;
import steam.teamb.socialNetwork.lup.Impl.PublicacionImpl;
import steam.teamb.socialNetwork.lup.Model.Publicacion;

import java.util.ArrayList;
import java.util.List;

@RestController
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
    @ResponseBody
    public String crearPublicacion(@RequestBody Publicacion publicacion){
        publicacionService.crearPublicacion(publicacion);
        return "Publicacion creada";
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
