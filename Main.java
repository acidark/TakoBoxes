
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox pedido1 = new TripleTacoBox();
        CustomTacoBox pedido2 = new CustomTacoBox(5);
        System.out.println(pedido1.tacosRemaining());
        pedido1.eat();
        System.out.println(pedido1.tacosRemaining());
        System.out.println(pedido2.tacosRemaining());
        pedido2.eat();
        System.out.println(pedido2.tacosRemaining());

    }
}
