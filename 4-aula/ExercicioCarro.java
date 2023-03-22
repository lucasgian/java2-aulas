class Carro {
    String marca;
    String modelo;
    int anoFabricacao;
    int velocidadeAtual;

    public void acelerar() {
        velocidadeAtual += 10;
    }

    public void frear() {
        velocidadeAtual -= 10;
    }

    public void imprimirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}

public class ExercicioCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.anoFabricacao = 2021;

        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.frear();

        meuCarro.imprimirInformacoes();
    }
}