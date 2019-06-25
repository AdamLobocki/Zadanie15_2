import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CarQueue {
    void carsQueueEditing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe 0, 1 lub 2");
        int number = scanner.nextInt();


        Queue<Car> carList = new LinkedList<>();
        for (; number != 0; ) {
            switch (number) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Podaj dane samochodu");
                    carList.offer(new Car(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                    break;
                case 2:
                    carList.poll();
                    break;
            }
            System.out.println("Podaj liczbe 0, 1 lub 2");
            number = scanner.nextInt();
        }

    }
}
