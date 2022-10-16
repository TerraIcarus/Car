import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите путь");
        car.path = scanner.nextInt();
        new Thread(car).start();
    }
}