// Declara a classe Passaro.
// "extends Animal" significa que Passaro herda da classe Animal.
// Portanto, Passaro é uma subclasse (classe filha) de Animal.
public class Passaro extends Animal {

    // @Override indica que estamos sobrescrevendo
    // o método emitirSom() que foi herdado da classe Animal.
    @Override
    public void emitirSom() {

        // Exibe no console o som específico do pássaro.
        System.out.println("Passaro: Piu Piu...");

    }
}
