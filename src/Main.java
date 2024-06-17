import Service.CarrinhoDeCompra;
import Model.Alimento;
import Model.Eletronico;
import Model.Roupa;
import Service.CarrinhoDeCompra;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompra carrinho1 = new CarrinhoDeCompra();
        CarrinhoDeCompra carrinho2 = new CarrinhoDeCompra();

        Eletronico eletronico = new Eletronico("Samsung S23", 2999.0, 12, 3);
        Roupa roupa = new Roupa("Camiseta Basica", 89.99, "M", "Preta", 6);
        Alimento alimento = new Alimento("Pão", 9.99, "2023-12-31", 4);

        carrinho1.adicionarItem(eletronico);
        carrinho1.adicionarItem(roupa);
        carrinho1.adicionarItem(alimento);

        carrinho2.adicionarItem(new Eletronico("Notebook Acer", 4999.0, 24, 1));
        carrinho2.adicionarItem(new Roupa("Shorts", 149.99, "G", "Preta", 2));

        System.out.println("Carrinho 1:");
        carrinho1.listarItens();
        System.out.println("Total: " + carrinho1.calcularTotal());

        System.out.println("\nCarrinho 2:");
        carrinho2.listarItens();
        System.out.println("Total: " + carrinho2.calcularTotal());

        carrinho1.gerarArquivoTexto("carrinho1.txt");
        carrinho2.gerarArquivoTexto("carrinho2.txt");
    }
}