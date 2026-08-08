// Classe principal do programa.
// É nesta classe que o programa será executado.
// Ela contém o método main(), que é o ponto de entrada da aplicação Java.
public class MainAluno {

    // Método principal do programa.
    // A execução do programa começa aqui.
    //
    // public  → permite que o método seja acessado pela JVM.
    // static  → permite executar o método sem criar um objeto MainAluno.
    // void    → significa que o método não retorna nenhum valor.
    // main    → nome especial reconhecido pela JVM.
    // String[] args → recebe argumentos que podem ser passados
    //                 para o programa pela linha de comando.
    public static void main(String[] args) {

        // Criação de um objeto da classe Aluno.
        //
        // "Aluno" → é o tipo/classe do objeto.
        //
        // "alunoDevNicolas" → é a referência utilizada para
        //                     acessar o objeto criado.
        //
        // "new" → cria uma nova instância (objeto) da classe Aluno.
        //
        // "Aluno(...)" → chama o construtor da classe Aluno.
        //
        // Os valores enviados para o construtor são:
        // Nome:  "Dev Nicolas"
        // Curso: "Engenharia de Software"
        // Idade: 19
        Aluno alunoDevNicolas =
            new Aluno("Dev Nicolas", "Engenharia de Software", 19);


        // Chamada do método exibirDados().
        //
        // "alunoDevNicolas" → objeto que será utilizado.
        //
        // "." → operador utilizado para acessar um método
        //       ou atributo do objeto.
        //
        // "exibirDados()" → método responsável por exibir
        //                   as informações do aluno.
        alunoDevNicolas.exibirDados();

    }
}
