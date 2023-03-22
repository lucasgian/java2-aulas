class Produto {
    String codigo;
    String nome;
    double preco;
    int quantidade;
    private int desconto = 30;

    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public double valorComDesconto() {
        return preco * quantidade * (1 - desconto / 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Produto novoProdutoCoca = new Produto("001", "Coca-Cola", 5.00);
        Produto novoProdutoArroz = new Produto("002", "Arroz", 10.00);
    }
}