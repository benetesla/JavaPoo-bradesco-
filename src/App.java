import br.com.meuprojeto.Conta;

public class App {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1, "João", 1000, 1000);
        Conta conta2 = new Conta(2, "Maria", 1000, 1000);

        conta1.transferir(conta2, 500);
        conta1.imprimir();

        conta2.transferir(conta1, 500);
        conta2.imprimir();

        
    }
}
