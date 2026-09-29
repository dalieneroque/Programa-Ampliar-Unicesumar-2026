public class Main {

    public static void main(String[] args) {

        // =========================================
        // PARTE 1 - INTERFACE E POLIMORFISMO
        // =========================================

        // A variável é do tipo Autenticavel,
        // mas o objeto criado é um Usuario.
        Autenticavel usuario = new Usuario();

        // Java executará o método autenticar()
        // da classe Usuario.
        usuario.autenticar();


        // A variável também é do tipo Autenticavel,
        // mas agora o objeto é um Administrador.
        Autenticavel administrador = new Administrador();

        // Java executará o método autenticar()
        // da classe Administrador.
        administrador.autenticar();


        // =========================================
        // PARTE 2 - CLASSE ABSTRATA E HERANÇA
        // =========================================

        // A variável é do tipo Funcionario,
        // mas o objeto criado é um Gerente.
        Funcionario gerente = new Gerente("Ana", 5000);

        // A variável também é do tipo Funcionario,
        // mas o objeto criado é um Desenvolvedor.
        Funcionario desenvolvedor = new Desenvolvedor(
            "Carlos",
            5000
        );


        // =========================================
        // CALCULANDO OS BÔNUS
        // =========================================

        // Calcula o bônus do gerente.
        double bonusGerente = gerente.calcularBonus();

        // Exibe o bônus do gerente.
        System.out.println(
            "Bônus do gerente: R$ " + bonusGerente
        );


        // Calcula o bônus do desenvolvedor.
        double bonusDesenvolvedor =
            desenvolvedor.calcularBonus();

        // Exibe o bônus do desenvolvedor.
        System.out.println(
            "Bônus do desenvolvedor: R$ " + bonusDesenvolvedor
        );
    }
}