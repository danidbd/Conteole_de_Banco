public class Conta {

        String nome;
        int numConta;
        double saldo;
        public Conta( String nome, int numConta, double saldo) {
            this.nome = nome;
            this.numConta = numConta;
            this.saldo = saldo;
        }

        public String getNome() {
            return nome;
        }

        public double getSaldo() {
            return saldo;
        }

        public int getNumConta() {
            return numConta;
        }

        public void depositar (double valor){
            saldo += valor;
        }
        public void sacar (double valor){
            saldo -= valor;
        }
        public void transferir(Conta destino, double valor) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }


