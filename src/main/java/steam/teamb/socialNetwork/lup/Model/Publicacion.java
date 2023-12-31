package steam.teamb.socialNetwork.lup.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    private String titulo;
    private String contenido;
    private Long idUsuario;

    public Publicacion(String titulo, String contenido, Long idUsuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.idUsuario = idUsuario;
    }
}
