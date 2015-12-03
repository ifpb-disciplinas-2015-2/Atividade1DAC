package dijalmasilva.core.sessionBean;

import com.mycompany.interfaces.MediaAritmetica;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Stateless
@Remote(MediaAritmetica.class)
public class MediaAritmeticaImp implements MediaAritmetica{

    @Override
    public float calculaMedia(float nota1, float nota2, float nota3){
        return (nota1 + nota2 + nota3)/ 3;
    }
}
