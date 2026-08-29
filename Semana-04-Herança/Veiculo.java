public class Veiculo {

    // Atributos da classe Veiculo
    // "protected" permite que esta classe e suas subclasses
    // tenham acesso a esses atributos.
    protected String marca;
    protected String modelo;
    protected int ano;


    // Construtor da classe Veiculo
    // Recebe a marca, o modelo e o ano do veículo
    // para inicializar seus atributos.
    public Veiculo(String marca, String modelo, int ano) {

        // "this" representa o objeto atual.
        // Aqui estamos atribuindo os valores recebidos
        // aos atributos da classe.
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    // ⭐ CONTRIBUIÇÃO DO ALUNO LUAN FERREIRA
    //
    // Luan participou ativamente da aula e compartilhou
    // este método com a turma, colocando em prática
    // os conceitos apresentados.
    //
    // P.S.: A Déborah disse que foi ela quem ensinou... 🤣
    // Mas, após uma investigação minuciosa, fica registrado:
    // o crédito é 100% do Luan! 😂👏
    //
    // Obrigada pela participação e contribuição, Luan!
    // Parabéns! 🚀
    public void exibirInformacoes() {

        // Exibe a marca do veículo no console.
        System.out.print("A marca do veiculo é: " + marca);

        // Exibe o modelo do veículo.
        System.out.print(", o modelo é " + modelo);

        // Exibe o ano de fabricação do veículo.
        System.out.println(", e o ano de fabricação é: " + ano);
    }


    // Método responsável por representar uma ação que o veículo pode realizar.
    public void acelerar() {

        // Exibe uma mensagem informando que o veículo está acelerando.
        System.out.println("O veiculo esta acelerando...");
    }
}