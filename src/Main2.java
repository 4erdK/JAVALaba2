import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static int[][] Scanner1(int first, int second) {
        int[][] array = new int[first][second];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
        return array;
    }

    public static int MIN(int first, int second) throws Exception {
        int [][] array = Scanner1(first,second);
        int min = array[0][0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        if (min >= 0) {
            throw new Exception("Нет отрицательных чисел");
        }
        return min;
}
    public static void main(String [] args) {
        try{
            System.out.println(MIN(2,2));
        }
        catch (InputMismatchException e){
            System.out.println("Ошибка неправильного ввода ");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
