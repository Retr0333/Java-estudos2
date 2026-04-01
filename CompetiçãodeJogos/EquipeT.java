package CompetiçãodeJogos;
import java.util.ArrayList;
import java.util.List;
public class EquipeT <T extends Atleta>
{
   private List<T> equipe =  new ArrayList<>();
   public void adicionar(T e)
   {
    equipe.add(e);
   }
   public List<T> getEquipe()
   {
    return this.equipe;
   }
   public void mostrarResultado()
   {
    for( T atleta : equipe)
    {
        Resultado r = new Resultado(atleta.getNome(),atleta.calcularResultado());
        System.out.println(r);
    }
   }
}
