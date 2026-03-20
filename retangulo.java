package poligonoflexivel;

public class retangulo extends forma 
{
    double x;
    double y;
    public retangulo(double base, double altura)
    {
        this.x = base;
        this.y = altura;
    }
    public double calcularArea()
    {
        return x * y;
    }
}

