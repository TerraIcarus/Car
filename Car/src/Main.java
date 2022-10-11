import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите путь");
        String path =scanner.nextLine();
        Car car = new Car(path);
    }
}