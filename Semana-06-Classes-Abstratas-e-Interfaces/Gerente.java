// Gerente herda da classe Funcionario.
public class Gerente extends Funcionario {

    // Construtor do Gerente.
    public Gerente(String nome, double salario) {

        // Chama o construtor da classe Funcionario.
        super(nome, salario);
    }

    // Implementação do método abstrato.
    @Override
    public double calcularBonus() {

        // O gerente recebe 20% do salário como bônus.
        return salario * 0.20;
    }
}