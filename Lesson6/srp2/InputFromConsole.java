import java.util.Scanner;

public class InputFromConsole {

    public Order inputFromConsole(){
        String clientName = prompt("Client name: ");
        String Product = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Quantity: "));
        int price = Integer.parseInt(prompt("Price: "));

        return new Order(clientName, Product, qnt, price);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
