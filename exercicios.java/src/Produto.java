public class Produto {

    String marca;
    String modelo;
    double preco;
    int quantidadeEmEstoque;

    // Construtor que cria o produto
    public Produto(String marca, String modelo, double preco, int quantidadeEmEstoque) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Aqui adiciona unidades no estoque
    public void adicionarEstoque(int qtd) {
        this.quantidadeEmEstoque += qtd;
    }

    // Aqui vende o produto (verifica se há estoque suficiente)
    public boolean vender(int qtd) {

        if (qtd <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= qtd;
            return true; // significa que deu certo a venda
        }

        return false; // caso o estoque esteja insuficiente
    }
}
}
