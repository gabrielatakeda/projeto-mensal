package produtos;

public abstract class Produto {
    //a classe Produtos sera abstrata, para ser classe mae das outras categorias.

    //variaveis com uso protected para que seja acessado somente pelas classes filhas e nada mais
    protected String nomeProduto;
    protected int quantidade;
    protected double precoCompra;
    protected double precoVenda;

    //construtor default
    public Produto(){

    }

    public Produto(String nomeProduto, int quantidade, double precoCompra, double margemLucro){
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoCompra = precoCompra;
        this.precoVenda = calcularPrecoVenda(margemLucro);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    //vai puxar a categoria de cada produto
    public abstract String getCategoria();

    //calcula o preco de venda de cordo com a margem de lucro desejada
    public double calcularPrecoVenda(double margemLucro) {
        return precoCompra + (precoCompra * margemLucro / 100);
    }

    //vai printar as informacoes de cada produto
    public void print() {
        System.out.println(nomeProduto +
                            " - Categoria: " + getCategoria() +
                            " | Compra: R$" + precoCompra +
                            " | Venda: R$" + precoVenda +
                            " (" + quantidade + " disponíveis)");
    }
}
