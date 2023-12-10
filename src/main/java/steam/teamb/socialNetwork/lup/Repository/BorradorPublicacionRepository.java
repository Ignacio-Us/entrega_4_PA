package steam.teamb.socialNetwork.lup.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import steam.teamb.socialNetwork.lup.Model.BorradorPublicacion;

import java.util.ArrayList;

@Repository
public interface BorradorPublicacionRepository extends JpaRepository<BorradorPublicacion, Long> {
    ArrayList<BorradorPublicacion> findByIdUsuario(Long idUsuario);
}
