package steam.teamb.socialNetwork.lup.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import steam.teamb.socialNetwork.lup.Model.BorradorPublicacion;
import steam.teamb.socialNetwork.lup.Service.BorradorPublicacionService;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BorradorPublicacionController {

    private final BorradorPublicacionService borradorPublicacionService;

    @GetMapping("borradores-publicaciones/{idUsuario}")
    @ResponseBody
    public ArrayList<BorradorPublicacion> mostrarPublicacionPorIdUsuario(@PathVariable Long idUsuario){
        return borradorPublicacionService.mostrarBorradorPublicacionPorIdUsuario(idUsuario);
    }

    @GetMapping("borrador-publicacion/{id}")
    @ResponseBody
    public BorradorPublicacion buscarBorradorPublicacionPorId(@PathVariable Long id){
        return borradorPublicacionService.buscarBorradorPublicacionPorId(id);
    }

    @PostMapping("borrador-publicacion")
    @ResponseBody
    public String crearBorradorPublicacion(@RequestBody BorradorPublicacion borradorPublicacion){
        borradorPublicacionService.crearPublicacion(borradorPublicacion);
        return "Borrador Guardado";
    }

    @DeleteMapping("borrador-publicacion/{id}")
    public void borrarPublicacion(@PathVariable Long id){
        borradorPublicacionService.eliminarBorradorPublicacion(id);
    }
}
