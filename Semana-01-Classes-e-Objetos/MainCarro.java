// Classe principal do programa.
// É nela que o programa começa a ser executado.
public class MainCarro {

    // Método principal (main).
    // Todo programa Java inicia sua execução por este método.
    public static void main(String[] args) {

        // Criação de um objeto chamado carro1 a partir da classe Carro.
        // O operador 'new' é utilizado para instanciar um novo objeto.
        Carro1 carro1 = new Carro1();

        // Atribuindo valores aos atributos do objeto carro1.
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2023;

        // Exibindo a marca do carro no console.
        System.out.println(carro1.marca);

        // Exibindo o modelo do carro no console.
        System.out.println(carro1.modelo);

        // Exibindo o ano de fabricação do carro no console.
        System.out.println(carro1.ano);

    }

}