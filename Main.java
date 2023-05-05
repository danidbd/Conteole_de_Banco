import java.util.List;
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco");

        Conta conta1 = new Conta("Fulano", 123, 1000);
        Conta conta2 = new Conta("Ciclano", 456, 500);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        Conta contaEncontrada = banco.buscarConta(123);
        if (contaEncontrada != null) {
            contaEncontrada.transferir(conta2, 500);
        }

        List<Conta> listaContas = banco.listarContas();
        for (Conta conta : listaContas) {
            System.out.println("Conta " + conta.getNumConta() + ": " + conta.getNome() + " - Saldo: " + conta.getSaldo());
        }
    }
    }
