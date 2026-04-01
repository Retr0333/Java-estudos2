package StreamingMusica;

public abstract class Midia 
{
    protected String artista;
    protected String titulo;

    public Midia(String artista, String titulo)
    {
        this.artista = artista;
        this.titulo = titulo;
    }
    public String getArtista()
    {
        return artista;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public abstract double calcularReceita();
}
