import java.util.Scanner;

public class IT26102558Lab7Q2C {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
