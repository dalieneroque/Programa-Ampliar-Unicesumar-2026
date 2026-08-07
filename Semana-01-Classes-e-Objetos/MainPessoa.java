// Classe principal do programa.
// É nela que o programa começa a ser executado.
public class MainPessoa {

    // Método principal (main).
    // Todo programa Java inicia sua execução por este método.
    public static void main(String[] args) {

        // Criação de um objeto chamado pessoa1 a partir da classe Pessoa.
        Pessoa pessoa1 = new Pessoa();

        // Atribuindo valores aos atributos do objeto.
        pessoa1.nome = "Maria";
        pessoa1.idade = 20;

        // Exibindo os dados da pessoa no console.
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);

    }

}