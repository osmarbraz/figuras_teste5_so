package principal;


import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;
import figuras.Triangulo;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String opcao = "";
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();
        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();
        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura Triângulo "
                    + "\n2 - Área Triângulo "
                    + "\n3 - Leitura Retângulo "
                    + "\n4 - Área Retangulo "
                    + "\n5 - Leitura Quadrado "
                    + "\n6 - Área Quadrado "
                    + "\n7 - Leitura Círculo "
                    + "\n8 - Área Círculo "
                    + "\n9 - Sair");

            switch (opcao) {
                case "1": {
                    triangulo.setCor(JOptionPane.showInputDialog("Digite a Cor do Triângulo"));
                    triangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Triângulo")));
                    triangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Triângulo")));
                    break;
                }
                case "2": {
                    JOptionPane.showMessageDialog(null, "Área Triangulo: " + triangulo.getArea());
                    break;
                }

                case "3": {
                    retangulo.setCor(JOptionPane.showInputDialog("Digite a Cor do Retângulo"));
                    retangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Retângulo")));
                    retangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Retângulo")));
                    break;
                }
                case "4": {
                    JOptionPane.showMessageDialog(null, "Área Retângulo: " + retangulo.getArea());
                    break;
                }

                case "5": {
                    quadrado.setCor(JOptionPane.showInputDialog("Digite a Cor do Quadrado"));
                    quadrado.setLado(Double.parseDouble(JOptionPane.showInputDialog("Digite o Lado do Quadrado")));
                    break;
                }
                case "6": {
                    JOptionPane.showMessageDialog(null, "Área Quadrado: " + quadrado.getArea());
                    break;
                }

                case "7": {
                    circulo.setCor(JOptionPane.showInputDialog("Digite a Cor do Circulo"));
                    circulo.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio do Circulo")));
                    break;
                }
                case "8": {
                    JOptionPane.showMessageDialog(null, "Área Circulo: " + circulo.getArea());
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Alternativa inválida!");
                    break;
            }
        }
    }
}
