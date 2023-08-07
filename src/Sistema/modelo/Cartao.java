package Sistema.modelo;

public class Cartao {
    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getLimite() {
        return limite;
    }

    public void realizaCompra(double valor){
        this.limite -= valor;
    }

}
