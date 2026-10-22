import java.util.ArrayList;
import java.util.List;

public class MateriaisdeConstrucao {
    List<Produto> produtos = new ArrayList<>();

    //Esse metodo auxilia para ajudar a cadastrar os produtos na loja
    public void cadastrarProduto(Produto p);{
        produtos.add(p);
    }
    // 1 Aqui vai retornar o produto mais caro de uma determinada marca
    public Produto produtoMaisCaro(String marcaDesejada) {
        Produto maisCaro = null; //Aqui pega o produto mais caro que seje diferente de 0
        for (Produto p : produtos) { //Aqui passa produto por produto na lista
            if(p.marca.equalsIgnoreCase(marcaDesejada)); { //Aqui seleciona a marca desejada
                if(maisCaro == null || p.preco > maisCaro.preco); { //Aqui pega o maais caro
                    maisCaro = p;
                }
            }
        }
        return maisCaro;
    }
    // 2 Aqui vai retornar os produtos de uma marca com o preço entre X e Y
    public List<Produto> filtrarPorPrecoEMarca(String marcaDesejada, double x, double y) {
        List<Produto>  filtrados = new ArrayList<>();
        for (Produto p: produtos) {
            if (p.marca.equalsIgnoreCase(marcaDesejada) && p.preco >= x && p.preco <= y) {
        filtrados.add(p);
            }
        }
        return filtrados;
    }
}
