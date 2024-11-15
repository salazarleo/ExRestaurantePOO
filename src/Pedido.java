import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();


    public void adicionarItem(ItemPedido item) {
        itens.add(item);
        System.out.println("Item adicionado: " + item.getNome());
    }

    public void ExibirItensPedido() {
        if (itens.isEmpty()) {
            System.out.println("Não existe pedidos feitos");
        } else {
            for (ItemPedido item : itens) {
                System.out.println(item.getNome());
                System.out.println(item.getPreco());
            }
        }

    }

    public void CalcularPreco() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getPreco();
        }
    }

}
