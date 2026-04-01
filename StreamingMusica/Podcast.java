package StreamingMusica;

public class Podcast extends Midia
{
    int minutosOuvidos;
    public Podcast(String artista, String titulo, int minutosOuvidos)
    {
        super(artista, titulo);
        this.minutosOuvidos = minutosOuvidos;
    }
    public double calcularReceita()
    {
        return minutosOuvidos * 0.02;
    }
}
