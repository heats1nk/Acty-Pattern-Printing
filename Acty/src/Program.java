import java.util.*;

public class Program {
    public static void main(String[] args) {

        Program p1 = new Program();
        p1.pattern3(2);

    }

    public int setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pattern length: ");
        int input = Integer.valueOf(scanner.nextLine());
        return input;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        //loop for input
        do {
            System.out.println("Enter pattern choice: ");
            int choice = Integer.valueOf(scanner.nextLine());

            switch (choice) {
                case 1:
                    pattern1(setData());
                    break;
                case 2:
                    pattern2(setData());
                    break;
                case 3:
                    pattern3(setData());
                case 0:
                    System.out.println("--Fin--");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (true);
    }

    public void pattern1(int n) {
        for (int row = 1; row <= n * n; row++) {
            for (int col = 1; col <= n * n; col++) {

                if (row - col == 0) {
                    System.out.print("*");
                } else if ((col - row) % n == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public void pattern2(int n) {
        int temp = n * n;
        for (int row = 1; row <= temp; row++) {
            for (int col = 1; col <= temp; col++) {
                if (((col + row) - 1) % n == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*public void pattern3(int n){
        int temp = n * n;
        for (int row = 1; row <= temp; row++) {
            for (int col = 1; col <= temp; col++) {
                if(col <=n) {
                    if (row - col == 0 || (col - row) % 3 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }else if(col>n && col<=2*n){
                    if (((col + row) - 1) % n == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }*/

    public void pattern3(int n) {
        int temp = n * n;
        for (int row = 1; row <= temp; row++) {
            for (int col = 1; col <= temp; col++) {

            }
            System.out.println();
        }
    }

    //end of program
}
