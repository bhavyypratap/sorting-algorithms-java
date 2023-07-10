import java.util.Scanner;

public class insertionSORT {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int i, j, key;
        for (i = 1; i < n; i++) {
            key = numbers[i];
            for (j = i - 1; j >= 0; j--) {
                if (numbers[j] >= key) {
                    numbers[j + 1] = numbers[j];
                    if (j == 0) {
                        numbers[j] = key;
                    }
                } else {
                    numbers[j + 1] = key;
                    break;
                }
            }
        }
        System.out.println("ascending order:");
        for (i = 0; i < n; i++)
            System.out.print(numbers[i] + " ");

    }
}
