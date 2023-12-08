package steam.teamb.socialNetwork.lup.Controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import steam.teamb.socialNetwork.lup.Model.Entity.Publicacion;

@Repository
public interface PublicacionController extends JpaRepository<Publicacion, Long> {
    
}
