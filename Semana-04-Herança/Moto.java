// A classe Moto herda da classe Veiculo.
// Isso significa que uma Moto também é um Veiculo
// e poderá utilizar seus atributos e métodos.
//
// "extends" representa a HERANÇA em Java.
public class Moto extends Veiculo {

    // Construtor da classe Moto.
    // Recebe a marca, o modelo e o ano da moto.
    public Moto(String marca, String modelo, int ano) {

        // "super" chama o construtor da classe pai (Veiculo).
        // Assim, aproveitamos o construtor que já foi criado
        // na classe Veiculo para inicializar os dados.
        super(marca, modelo, ano);
    }


    // @Override indica que estamos SOBRESCREVENDO
    // o método acelerar() que existe na classe Veiculo.
    //
    // A Moto possui sua própria implementação desse comportamento.
    @Override
    public void acelerar() {

        // Exibe uma mensagem específica para a moto.
        System.out.println("A moto esta acelerando...");
    }
}