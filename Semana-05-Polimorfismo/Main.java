// Declara a classe principal do nosso programa.
public class Main {

    // O método main é o ponto de entrada da aplicação.
    // É a partir dele que o programa começa a ser executado.
    public static void main(String[] args) {

        // Cria um objeto da classe Cachorro.
        // "Cachorro" é o tipo da variável.
        // "cachorro" é o nome da referência.
        // "new Cachorro()" cria um novo objeto Cachorro na memória.
        Cachorro cachorro = new Cachorro();

        // Cria um objeto da classe Gato.
        Gato gato = new Gato();

        // Cria um objeto da classe Passaro.
        Passaro passaro = new Passaro();


        // Essas três linhas estão comentadas.
        // Se fossem executadas, chamariam o método emitirSom()
        // de cada objeto individualmente.

        // cachorro.emitirSom();
        // gato.emitirSom();
        // passaro.emitirSom();


        // Cria um ARRAY de objetos do tipo Animal.
        //
        // O mais importante aqui é perceber que o array é
        // do tipo Animal, mas pode armazenar objetos das
        // classes Cachorro, Gato e Passaro.
        //
        // Isso é possível porque Cachorro, Gato e Passaro
        // HERDAM da classe Animal.

        Animal[] animais = {

            // Cria um objeto Cachorro e coloca no array.
            new Cachorro(),

            // Cria um objeto Gato e coloca no array.
            new Gato(),

            // Cria um objeto Passaro e coloca no array.
            new Passaro()
        };


        // Percorre todos os elementos do array "animais".
        //
        // "Animal animal" significa que a cada repetição
        // teremos uma referência do tipo Animal.
        //
        // O "animal" vai representar cada objeto do array
        // durante a repetição.
        for (Animal animal : animais) {

            // Chama o método emitirSom().
            //
            // Aqui acontece o POLIMORFISMO!
            //
            // Mesmo que a referência seja do tipo Animal,
            // o Java identifica qual é o objeto real:
            // Cachorro, Gato ou Passaro.
            //
            // Por isso cada animal executa sua própria
            // versão do método emitirSom().
            animal.emitirSom();
        }

    }
}