package steam.teamb.socialNetwork.lup.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublicacionDTO {
    private String imagen;
    private String nick_name;
    private String titulo;
    private String contenido;
}
