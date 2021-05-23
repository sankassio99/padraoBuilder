import java.time.LocalDate;

public class ProdutoBuilder {
    private int id;
    private String titulo;
    private String descricao;
    private double preco;
    private String categoria;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private Vendedor vendedor;

    public ProdutoBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public ProdutoBuilder setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        return this;
    }

    public ProdutoBuilder setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public Produto createProduto() {
        return new Produto(id, titulo, descricao, preco, categoria, dataCadastro, dataUltimaAtualizacao, vendedor);
    }
}