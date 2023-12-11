package steam.teamb.socialNetwork.lup.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import steam.teamb.socialNetwork.lup.Impl.BorradorPublicacionImpl;
import steam.teamb.socialNetwork.lup.Model.BorradorPublicacion;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BorradorPublicacionController {

    private final BorradorPublicacionImpl borradorPublicacionService;

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
    public String crearBorradorPublicacion(@RequestParam("titulo") String titulo, @RequestParam("contenido") String contenido){
        BorradorPublicacion borradorPublicacion = new BorradorPublicacion();

        borradorPublicacion.setTitulo(titulo);
        borradorPublicacion.setContenido(contenido);
        borradorPublicacion.setIdUsuario(3L);

        borradorPublicacionService.crearBorradorPublicacion(borradorPublicacion);
        return "redirect:/home_social_network";
    }

    @DeleteMapping("borrador-publicacion/{id}")
    public void borrarPublicacion(@PathVariable Long id){
        borradorPublicacionService.eliminarBorradorPublicacion(id);
    }
}
