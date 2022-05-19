package figuras;

public class Circulo extends Figura {

    private double raio;

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

    public double getArea() {
        double PI = 3.1415;
        return ((PI * getRaio() * getRaio()));
    }
}
