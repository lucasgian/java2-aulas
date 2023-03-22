class Filme {
    private String urlVideo;
    private String nome;
    private String nomeCategoria;
    private String personagem;
    private int tempoFilme;
    private int classificacao;
    private int ano;

    public Filme(
        String urlVideo,
        String nome,
        String nomeCategoria,
        String personagem,
        int tempoFilme,
        int classificacao,
        int ano
    ) {
        this.urlVideo = urlVideo;
        this.nome = nome;
        this.nomeCategoria = nomeCategoria;
        this.personagem = personagem;
        this.tempoFilme = tempoFilme;
        this.classificacao = classificacao;
        this.ano = ano;
    }

    public String getPersonagem() {
        return this.personagem;
    }

    public String getNomeCategoria() {
        return this.nomeCategoria;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoFilme() {
        return tempoFilme;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getAno() {
        return ano;
    }
}


public class Netflix {
    private Filme[] filmes;
    private Serie[] series;
    private Categoria[] categorias;
    private ContaPerfil contaPerfil;

    public Netflix(
        Filme[] filmes,
        Serie[] series,
        Categoria[] categorias,
        ContaPerfil contaPerfil
    ) {
        this.filmes = filmes;
        this.series = series;
        this.categorias = categorias;
        this.contaPerfil = contaPerfil;
    }

    public Filme[] getFilmes() {
        return filmes;
    }

    public Serie[] getSeries() {
        return series;
    }

    public Filme[] melhoresFilmes() {

    }

    public Filme[] melhoresSeries() {

    }

    public void assitirFilme(String nome) {
        // assitir filme
    }

    public void assitirSerie(String nome) {
        // assitir serie
    }
}