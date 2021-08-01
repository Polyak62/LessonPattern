import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите 1, 2 или 3 режим");
        int num = sc.nextInt();
        System.out.println("Выполняется " + num + " режим............");
        service.execute(num);
    }
}
