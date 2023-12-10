package steam.teamb.socialNetwork.lup.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import steam.teamb.socialNetwork.lup.DTO.PublicacionDTO;
import steam.teamb.socialNetwork.lup.Model.Publicacion;
import steam.teamb.socialNetwork.lup.Service.PublicacionService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PublicacionController{

    private final PublicacionService publicacionService;

    @PostMapping("/publicacion")
    @ResponseBody
    public String crearPublicacion(@RequestBody Publicacion publicacion){
        publicacionService.crearPublicacion(publicacion);
        return "Publicacion creada";
    }

    @GetMapping("/publicacion")
    @ResponseBody
    public List<Publicacion> mostrarPublicacion(){
        return publicacionService.obtenerPublicacion();
    }

    @DeleteMapping("/publicacion/{id}")
    public void borrarPublicacion(@PathVariable Long id){
        publicacionService.borrarPublicacion(id);
    }

    @GetMapping("/persona/{id}")
    @ResponseBody
    public Publicacion buscarPublicacionPorId(@PathVariable Long id){
        return publicacionService.buscarPublicacionPorId(id);
    }

    @PutMapping("/editando-publicacion")
    public void editarPublicacion(@RequestBody Publicacion publicacion){
        publicacionService.editarPublicacion(publicacion);
    }

    @GetMapping("/publicacion/de/{idUsuario}")
    @ResponseBody
    public ArrayList<PublicacionDTO> mostrarPublicacionPorIdUsuario(@PathVariable Long idUsuario){
        return publicacionService.mostrarPublicacionPorIdUsuario(idUsuario);
    }
}
