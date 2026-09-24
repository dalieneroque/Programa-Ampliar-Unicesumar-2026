// Declara a classe Gato.
// "extends Animal" significa que Gato herda da classe Animal.
// Portanto, Gato é uma subclasse de Animal.
public class Gato extends Animal {

    // @Override indica que estamos sobrescrevendo
    // o método emitirSom() que existe na classe Animal.
    @Override
    public void emitirSom() {

        // Exibe no console o som específico do gato.
        System.out.println("Gato: Miau Miau...");
    }
}