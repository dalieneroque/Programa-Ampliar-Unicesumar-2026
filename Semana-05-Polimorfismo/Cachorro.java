// Declara a classe Cachorro.
// "extends Animal" significa que Cachorro HERDA da classe Animal.
// Portanto, Cachorro é uma subclasse (classe filha) de Animal.
public class Cachorro extends Animal {

    // @Override informa ao Java que estamos SOBRESCREVENDO
    // um método que foi herdado da classe Animal.
    @Override
    public void emitirSom() {

        // Exibe no console o som específico do cachorro.
        System.out.println("Cachorro: Au au...");
        
    }

}
