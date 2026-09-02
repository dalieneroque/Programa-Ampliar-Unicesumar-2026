public class Main {

    // O método main é o ponto de entrada da aplicação.
    // É a partir dele que o programa começa a ser executado.
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Passaro passaro = new Passaro();    
        
        //cachorro.emitirSom();
        //gato.emitirSom();
        //passaro.emitirSom();

        Animal[] animais = {
            new Cachorro(),
            new Gato(),
            new Passaro()
        };

        for (Animal animal : animais) {
            animal.emitirSom();
        }

    }

}