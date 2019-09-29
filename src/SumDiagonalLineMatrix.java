import java.util.Scanner;

public class SumDiagonalLineMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = input.nextInt();
        System.out.print("Enter a colum: ");
        int colum = input.nextInt();

        int [][] array = createArray(row , colum);
        System.out.println("Show Matrix ");
        displayArray(array);
        int result = cal(array);

        System.out.println("\n Sum Diagonal Line Matrix: " + result);
    }

    public static int[][] createArray(int row, int colum) {
        int[][] array = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        return array;
    }

    public static int cal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i] == arr[j]) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void displayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
