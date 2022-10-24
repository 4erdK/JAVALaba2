import java.util.*;

public class Main1 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int [][] array = new int[2][2];
try {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array));
        int min = array[0][0];
    for (int i = 0; i < array.length - 1; i++) {
        for (int j = 0; j < array.length; j++) {
            if(array[i][j] < min)
            {
                min = array[i][j];
            }
        }
    }
    if(min>=0){throw new Exception("Нет отрицательных чисел");}

    System.out.println(min);

}
catch (InputMismatchException e){
    System.out.println("Ошибка неправильного ввода ");
}
catch (Exception e){
    System.out.println(e);
    }
}
}
