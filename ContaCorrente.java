public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, Double saldo, Double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        limite = limite;
    }
    public double consultaSaldoTotal(){
        return getSaldo() + getLimite();
    }

}
