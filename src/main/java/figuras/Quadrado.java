package figuras;

public class Quadrado extends Figura {

    private double lado;

    public Quadrado() {
        this("", 0);
    }

    public Quadrado(String cor, double lado) {
        super(cor);
        setLado(lado);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return ((getLado() * getLado()));
    }
}
