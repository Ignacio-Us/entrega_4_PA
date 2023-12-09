package steam.teamb.socialNetwork.lup.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Publicacion {

    @Id
    private long id;

    private String titulo;

    private String contenido;
}
