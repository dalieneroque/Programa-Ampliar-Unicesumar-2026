// A classe Carro herda da classe Veiculo.
// Isso significa que Carro recebe os atributos e métodos
// que foram definidos na classe Veiculo.
//
// "extends" representa a HERANÇA em Java.
public class Carro extends Veiculo {

    // Construtor da classe Carro.
    // Recebe os mesmos dados necessários para criar um veículo:
    // marca, modelo e ano.
    public Carro(String marca, String modelo, int ano) {

        // "super" chama o construtor da classe pai (Veiculo).
        // Dessa forma, estamos aproveitando o construtor
        // que já foi criado na classe Veiculo.
        super(marca, modelo, ano);
    }


    // Método específico da classe Carro.
    // Um carro possui o comportamento de abrir suas portas.
    public void abrirPorta() {

        // Aqui podemos adicionar posteriormente
        // uma mensagem ou outra ação.
    }


    // @Override indica que estamos SOBRESCREVENDO
    // um método que já existe na classe Veiculo.
    //
    // A classe Veiculo possui o método acelerar(),
    // mas o Carro possui uma implementação específica
    // para esse comportamento.
    @Override
    public void acelerar() {

        // Exibe uma mensagem específica para o carro.
        System.out.println("O carro esta acelerando...");
    }
}