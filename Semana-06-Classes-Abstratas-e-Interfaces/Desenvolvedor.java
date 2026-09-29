// Desenvolvedor herda da classe Funcionario.
public class Desenvolvedor extends Funcionario {

    // Construtor do Desenvolvedor.
    public Desenvolvedor(String nome, double salario) {

        // Chama o construtor da classe Funcionario.
        super(nome, salario);
    }

    // Implementação do método abstrato.
    @Override
    public double calcularBonus() {

        // O desenvolvedor recebe 10% do salário como bônus.
        return salario * 0.10;
    }
}