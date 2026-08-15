public class MainContaBancaria {
    public static void main(String[] args) {
        // Criando contas
        ContaBancaria contaLucasHenrique = new ContaBancaria("001", "Lucas Henrique");
        ContaBancaria contaSilvio = new ContaBancaria("002", "Silvio");
        ContaBancaria contaBruno = new ContaBancaria("003", "Bruno");  
        ContaBancaria contaUriel = new ContaBancaria("004", "Uriel");
        ContaBancaria contaAna = new ContaBancaria("005", "Ana");
   
        // Tentando acessar diretamente (isso vai dar erro!)
        // contaJoao.saldo = 1000;  // ERRO! saldo é privado
        
        // Operações válidas
        contaLucasHenrique.depositar(1000);
        contaLucasHenrique.sacar(500);

        contaAna.depositar(5000);

        contaUriel.depositar(200);
        
        contaSilvio.depositar(10000);
        
        // Transferência entre contas
        contaSilvio.transferir(contaBruno, 1500);
        
        contaAna.transferir(contaUriel, 2000);
        
        // Consultando saldos
        System.out.println("Saldo do LucasHenrique: R$" + contaLucasHenrique.getSaldo());
        System.out.println("Saldo do Silvio: R$" + contaSilvio.getSaldo());
        System.out.println("Saldo do Bruno: R$" + contaBruno.getSaldo() );
        System.out.println("Saldo do Uriel: R$" + contaUriel.getSaldo());
        System.out.println("Saldo da Ana: R$" + contaAna.getSaldo());

        //Consultando Titular
        System.out.println("Primeiro titular " + contaUriel.getTitular());

        
        // Testando validações
        contaSilvio.sacar(10000);  // Deve falhar
        contaBruno.depositar(-50);  // Deve falhar
        contaUriel.sacar(4000); // Deve falhar

    }
}