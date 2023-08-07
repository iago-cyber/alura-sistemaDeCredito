package Sistema.modelo;

public class Cartao {
    private double limite;

    public Cartao(double limite) {
        this.limite = limite;
    }
    public double getLimite() {
        return limite;
    }

    public void realizaCompra(double valor){
        this.limite -= valor;
    }

}
