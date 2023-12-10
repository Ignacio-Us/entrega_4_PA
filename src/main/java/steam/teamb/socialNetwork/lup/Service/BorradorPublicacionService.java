package steam.teamb.socialNetwork.lup.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import steam.teamb.socialNetwork.lup.Model.BorradorPublicacion;
import steam.teamb.socialNetwork.lup.Repository.BorradorPublicacionRepository;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BorradorPublicacionService {

    private final BorradorPublicacionRepository borradorPublicacionRepository;
    public void crearPublicacion(BorradorPublicacion borradorPublicacion){
        borradorPublicacionRepository.save(borradorPublicacion);
    }

    public ArrayList<BorradorPublicacion> mostrarBorradorPublicacionPorIdUsuario(Long idUsuario){
        return borradorPublicacionRepository.findByIdUsuario(idUsuario);
    }

    public void eliminarBorradorPublicacion(Long id) {
        borradorPublicacionRepository.deleteById(id);
    }

    public BorradorPublicacion buscarBorradorPublicacionPorId(Long id) {
        return borradorPublicacionRepository.findById(id).orElse(null);
    }

}
