package StreamingMusica;

import java.util.ArrayList;
import java.util.List;
//import StreamingMusica.RelatorioMidia;

public class CatalogoT <T extends Midia>
{
    private List<T> midia = new ArrayList<>();

    public void adicionar(T m)
    {
        midia.add(m);
    }
    public List<T> getMidia()
    {
        return this.midia;
    }
    public void mostrarRelatorio()
    {
        midia.forEach(m ->{RelatorioMidia r = new RelatorioMidia(m.getArtista(), m.getTitulo(), m.calcularReceita());
        System.out.println(r);
    });

    }
}
