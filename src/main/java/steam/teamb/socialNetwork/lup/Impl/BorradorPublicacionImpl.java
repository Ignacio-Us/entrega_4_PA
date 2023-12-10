package steam.teamb.socialNetwork.lup.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import steam.teamb.socialNetwork.lup.Model.BorradorPublicacion;
import steam.teamb.socialNetwork.lup.Repository.BorradorPublicacionRepository;
import steam.teamb.socialNetwork.lup.Service.BorradorPublicacionService;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BorradorPublicacionImpl implements BorradorPublicacionService {

    private final BorradorPublicacionRepository borradorPublicacionRepository;

    @Override
    public void crearBorradorPublicacion(BorradorPublicacion borradorPublicacion) {
        borradorPublicacionRepository.save(borradorPublicacion);
    }

    @Override
    public ArrayList<BorradorPublicacion> mostrarBorradorPublicacionPorIdUsuario(Long idUsuario){
        return borradorPublicacionRepository.findByIdUsuario(idUsuario);
    }

    @Override
    public void eliminarBorradorPublicacion(Long id) {
        borradorPublicacionRepository.deleteById(id);
    }

    @Override
    public BorradorPublicacion buscarBorradorPublicacionPorId(Long id) {
        return borradorPublicacionRepository.findById(id).orElse(null);
    }
}
