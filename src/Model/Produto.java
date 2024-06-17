package Model;

public interface Produto {
    String getTipo();
    String getNome();
    double getPreco();
    void setNome(String nome);
    void setPreco(double preco);
    void setQuantidade(int quantidade);
    int getQuantidade();
    String exibirDetalhes();
}
