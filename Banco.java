import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public List<Conta> listarContas() {
        List<Conta> contasListadas = new ArrayList<>();
        for (Conta conta : contas) {
            contasListadas.add(conta);
        }
        return contasListadas;
    }
}
