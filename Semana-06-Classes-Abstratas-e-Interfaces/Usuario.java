// A classe Usuario implementa a interface Autenticavel.
public class Usuario implements Autenticavel {

    // Implementação do método definido na interface.
    @Override
    public void autenticar() {

        // Comportamento específico do Usuario.
        System.out.println("Usuário autenticado com sucesso!");
    }
}