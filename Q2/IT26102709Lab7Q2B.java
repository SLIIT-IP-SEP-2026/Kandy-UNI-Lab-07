public class IT26102709Lab7Q2B {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            System.out.print(row + " - ");
            for (int star = 1; star <= row; star++) System.out.print("* ");
            System.out.println();
        }
    }
}