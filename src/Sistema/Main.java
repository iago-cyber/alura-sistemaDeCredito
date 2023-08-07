package Sistema;

import Sistema.modelo.Cartao;
import Sistema.modelo.Compra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o limite do cartão:");
        Cartao cartao = new Cartao(scanner.nextDouble());

        ArrayList<Compra> listaDeCompras = new ArrayList<>();
        int i=1;
        while(i!=0){
            Compra compra = new Compra();
            System.out.println("Digite a descrição da compra:");
            compra.setDescricao(scanner.next());
            System.out.println("Digite o valor da compra:");
            compra.setValor(scanner.nextDouble());

            if (compra.getValor()<cartao.getLimite()){
                cartao.realizaCompra(compra.getValor());
                listaDeCompras.add(compra);
                System.out.println("Digite 0 para sair ou 1 para continuar.");
                i = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente.");
                i=0;
            }
        }

        listaDeCompras.sort(Comparator.comparing(Compra::getValor));

        System.out.println("**********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        for (Compra item:listaDeCompras) {
            System.out.println(item);
        }
        System.out.println("\n**********************\n");
        System.out.println("Saldo do cartão: "+cartao.getLimite());
    }
}