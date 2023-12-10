package steam.teamb.socialNetwork.lup.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import steam.teamb.socialNetwork.lup.Model.BorradorPublicacion;
import steam.teamb.socialNetwork.lup.Service.BorradorPublicacionService;

import java.util.ArrayList;

@RestController
@RequestMapping("/manejo_borrador_publicacion")
@RequiredArgsConstructor
public class BorradorPublicacionController {

    private final BorradorPublicacionService borradorPublicacionService;

    @PostMapping("/borrador_publicacion")
    @ResponseBody
    public String crearBorradorPublicacion(@RequestBody BorradorPublicacion borradorPublicacion){
        borradorPublicacionService.crearPublicacion(borradorPublicacion);
        return "Borrador Guardado";
    }

    @GetMapping("/borrador_publicacion/de/{idUsuario}")
    @ResponseBody
    public ArrayList<BorradorPublicacion> mostrarPublicacionPorIdUsuario(@PathVariable Long idUsuario){
        return borradorPublicacionService.mostrarBorradorPublicacionPorIdUsuario(idUsuario);
    }

    @DeleteMapping("/borrador_publicacion/{id}")
    public void borrarPublicacion(@PathVariable Long id){
        borradorPublicacionService.eliminarBorradorPublicacion(id);
    }

    @GetMapping("/borrador_publicacion/{id}")
    @ResponseBody
    public BorradorPublicacion buscarBorradorPublicacionPorId(@PathVariable Long id){
        return borradorPublicacionService.buscarBorradorPublicacionPorId(id);
    }
}
