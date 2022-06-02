package figuras;

public class Circulo extends Figura {

    private double raio;
    
    private static final double PI = 3.1415;

    public Circulo() {
        this("", 0);
    }

    public Circulo(String cor, double lado) {
        super(cor);
        setRaio(lado);
    }

    public void setRaio(double lado) {
        this.raio = lado;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea() {        
        return (PI * getRaio() * getRaio());
    }
}
