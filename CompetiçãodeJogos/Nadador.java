package CompetiçãodeJogos;

public class Nadador extends Atleta 
{
    double tempo;
    public Nadador(String nome, double tempo)
    {
        super(nome);
        this.tempo = tempo;
    }
    public double calcularResultado()
    {
        return 1000 / tempo;
    }
}
