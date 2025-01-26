package Proxy;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Image[] images = {
                new ProxyImage("E/helumelu_photo 1"),
                new ProxyImage("F/Honolulu 2"),
                new ProxyImage("G/UnggaBungga 3")
        };
        for (Image image : images) {
            System.out.println(image.toString());
        }
        int Order;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your Order: (Press 4 to exit)");
            Order = scanner.nextInt();
            if (Order == 1) {
                images[0].display();
            } else if (Order == 2) {
                images[1].display();
            } else if (Order == 3) {
                images[2].display();
            } else if (Order != 4) {
                System.out.println("Invalid Order");
            }
        }while(Order!=4);
    }
}
