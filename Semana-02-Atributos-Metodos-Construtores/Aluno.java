// Classe Aluno
// A classe é um modelo que representa um aluno.
// Ela define quais informações um aluno possui
// e quais ações ele pode realizar.
public class Aluno {

    // ============================
    // ATRIBUTOS
    // ============================

    // Armazena o nome do aluno.
    String nome;

    // Armazena o curso que o aluno está fazendo.
    String curso;

    // Armazena a idade do aluno.
    int idade;


    // ============================
    // CONSTRUTOR
    // ============================

    // O construtor é utilizado para criar e inicializar
    // um objeto da classe Aluno.
    //
    // Ele recebe três informações:
    // nome  → nome do aluno
    // curso → curso do aluno
    // idade → idade do aluno
    public Aluno(String nome, String curso, int idade) {

        // "this.nome" representa o atributo da classe.
        // "nome" representa o parâmetro recebido pelo construtor.
        //
        // Aqui estamos colocando o valor recebido no parâmetro
        // dentro do atributo do objeto.
        this.nome = nome;

        // Armazena o curso recebido no atributo curso.
        this.curso = curso;

        // Armazena a idade recebida no atributo idade.
        this.idade = idade;
    }


    // ============================
    // MÉTODO
    // ============================

    // Método responsável por exibir os dados do aluno.
    //
    // "public" → permite que o método seja chamado por outras classes.
    //
    // "void" → significa que o método não retorna nenhum valor.
    //
    // "exibirDados" → nome do método.
    //
    // "()" → indica que o método não recebe parâmetros.
    public void exibirDados() {

        // Exibe o nome do aluno no console.
        System.out.println("Nome: " + nome);

        // Exibe o curso do aluno no console.
        System.out.println("Curso: " + curso);

        // Exibe a idade do aluno no console.
        System.out.println("Idade: " + idade + " anos");
    }
}




