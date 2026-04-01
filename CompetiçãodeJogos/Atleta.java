package CompetiçãodeJogos;

public abstract class Atleta 
{
    protected String nome;
    public Atleta(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return nome;
    }
    public abstract double calcularResultado();
}
