package StreamingMusica;

public class Musica extends Midia
{
    int reproduções;
    public Musica(String artista, String titulo, int reproduções)
    {
        super(artista, titulo);
        this.reproduções = reproduções;    
    }
    public double calcularReceita()
    {
        return reproduções * 0.04;
    }
}
