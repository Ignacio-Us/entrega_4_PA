package steam.teamb.socialNetwork.lup.DTO;

import steam.teamb.socialNetwork.lup.Model.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublicacionDTO {

    private String nick_name;
    private String titulo;
    private String contenido;

}
