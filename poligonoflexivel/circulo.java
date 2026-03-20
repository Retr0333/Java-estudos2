package poligonoflexivel;

public class circulo extends forma  
{
    double r;
    public circulo(double raio)
    {
        this.r = raio;
    }
    public double calcularArea()
    {
        return 3.141592 * r * r;
    }
}
