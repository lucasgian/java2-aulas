public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;
    private Capa capa;
    private Conteudo conteudo;

    public Livro(String titulo, String autor, String ISBN, Capa capa, Conteudo conteudo) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.capa = capa;
        this.conteudo = conteudo;
    }

    // Métodos para acessar e modificar os atributos do livro
}

public class Capa {
    private String imagem;
    public Capa(String imagem) {
        this.imagem = imagem;
    }

    // Métodos para acessar e modificar a imagem da capa
}

public class Conteudo {
    private List<String> paginas;

    public Conteudo(List<String> paginas) {
        this.paginas = paginas;
    }

    // Métodos para acessar e modificar as páginas do conteúdo
}