//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Pedido pedido = new Pedido();

Hamburguer hamburguer = new Hamburguer("Hamburguer de Costela", 35, "Grande");

pedido.adicionarItem(hamburguer);
pedido.ExibirItensPedido();

    }
}
