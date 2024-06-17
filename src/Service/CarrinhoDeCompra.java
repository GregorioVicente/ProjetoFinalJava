package Service;

import Model.Produto;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Produto> itens;

    public CarrinhoDeCompra() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        this.itens.add(produto);
    }

    public void removerItem(Produto produto) {
        this.itens.remove(produto);
    }

    public void listarItens() {
        for (Produto item : itens) {
            System.out.println(item.exibirDetalhes());
        }
    }

    public List<Produto> exportarListaProdutos() {
        return new ArrayList<>(itens);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(item -> item.getPreco() * item.getQuantidade()).sum();
    }

    public void gerarArquivoTexto(String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write("item: Qtd: Nome: Preço: SubTotal:\n");
            int index = 1;
            for (Produto item : itens) {
                double subTotal = item.getPreco() * item.getQuantidade();
                writer.write(index++ + " " + item.getQuantidade() + " " + item.getNome() + " " + item.getPreco() + " " + subTotal + "\n");
            }
            writer.write("Total: " + calcularTotal());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}