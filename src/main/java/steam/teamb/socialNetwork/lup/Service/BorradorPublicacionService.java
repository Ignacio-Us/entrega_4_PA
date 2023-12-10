package steam.teamb.socialNetwork.lup.Service;

import steam.teamb.socialNetwork.lup.Model.BorradorPublicacion;

import java.util.ArrayList;


public interface BorradorPublicacionService {

    void crearBorradorPublicacion(BorradorPublicacion borradorPublicacion);
    ArrayList<BorradorPublicacion> mostrarBorradorPublicacionPorIdUsuario(Long idUsuario);
    void eliminarBorradorPublicacion(Long id);
    BorradorPublicacion buscarBorradorPublicacionPorId(Long id);

}
