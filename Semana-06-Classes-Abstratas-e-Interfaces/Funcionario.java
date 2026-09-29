// Classe abstrata que servirá como base para os funcionários.
public abstract class Funcionario {

    // Nome do funcionário.
    protected String nome;

    // Salário do funcionário.
    protected double salario;

    // Construtor da classe Funcionario.
    public Funcionario(String nome, double salario) {

        // Guardamos o nome recebido no atributo nome.
        this.nome = nome;

        // Guardamos o salário recebido no atributo salario.
        this.salario = salario;
    }

    // Método abstrato.
    // Cada classe filha deverá definir sua própria regra.
    public abstract double calcularBonus();
}