public class Hamburguer extends Lanches{
private String tipo;


    public Hamburguer(String nome,double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome() + "Valor: " + getPreco() + "Tipo: " + tipo);
    }
}
