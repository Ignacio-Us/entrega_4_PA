package steam.teamb.socialNetwork.lup.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import steam.teamb.socialNetwork.lup.Model.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {

}
