public class Principal {

    public static void main(String[] args) {

        Produto produto = new ProdutoBuilder()
                .setId(1)
                .setTitulo("TV LCD")
                .setPreco(2342.00)
                .createProduto();

        System.out.println(produto.getTitulo());
    }

}
