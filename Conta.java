public class Conta {

        private int numero;
        protected double saldo;

    public Conta(int numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void sacar (double valor){
    if (valor<=this.saldo)
        this.saldo = this.saldo - valor;
    }
    public void depositar (double valor){
        this.saldo = this.saldo + valor;

    }

}
