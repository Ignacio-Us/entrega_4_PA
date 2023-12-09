package steam.teamb.socialNetwork.lup.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import steam.teamb.socialNetwork.lup.Model.Publicacion;
import steam.teamb.socialNetwork.lup.Service.PublicacionService;

import java.util.List;

@RestController
@RequestMapping("/publicacion")
@RequiredArgsConstructor
public class PublicacionController{

    private final PublicacionService publicacionService;

    @PostMapping("/creando-publicacion")
    public String crearPublicacion(@RequestBody Publicacion publicacion){
        publicacionService.crearPublicacion(publicacion);
        return "Publicacion creada";
    }

    @GetMapping("/mostrando-publicaciones")
    public List<Publicacion> mostrarPublicacion(){
        return publicacionService.obtenerPublicacion();
    }

    @PutMapping("/editando-publicacion")
    public String editarPublicacion(@RequestBody Publicacion publicacion){

        return "Publicacion editada";
    }
}
