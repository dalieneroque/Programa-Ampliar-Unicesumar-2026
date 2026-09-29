// A classe Administrador também implementa Autenticavel.
public class Administrador implements Autenticavel {

    // Implementação do método autenticar().
    @Override
    public void autenticar() {

        // Comportamento específico do Administrador.
        System.out.println(
            "Administrador autenticado com acesso especial!"
        );
    }
}