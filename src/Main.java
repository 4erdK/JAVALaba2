import org.jetbrains.annotations.NotNull;

public class Main {
        /*public static int m () {
        try{
            System.out.println("0");
            throw new RuntimeException();
        }
        finally {
            System.out.println("1");
            }
        }*/
        /*public static int m() {
            try {
                System.out.println("0");
                return 55;
            } finally {
                System.out.println("1");
            }
        }*/
        /*public static int m() {
            try {
                System.out.println("0");
                return 15;
            } finally {
                System.out.println("1");
                return 20;
            }
        }*/
        /*public static void m (String str, double chislo) {
            if (str==null) {
            throw new IllegalArgumentException("Рядок введено неправильно");
        }
            if (chislo>0.001) {
                throw new IllegalArgumentException("Неправильне число");
            }	}*/
      /*  public static void m(int x) throws ArithmeticException{
            int h=10/x;
        }*/

    public static void main(String [] args) {
 /*       try{
            int l = args.length;
            System.out.println("Розмір масиву=" + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Помилка: Ділення на нуль");
        }*/


        /*m (null, 0.000001);*/
        /*System.out.println(m());*/

        /*try{
        System.out.println("0");
        throw new RuntimeException("Неперевірена помилка");
    }
    catch (RuntimeException e){
        System.out.println("1" + e);
    }
        System.out.println("2");
    }*/

       /* try {
            System.out.println("0");
            throw new RuntimeException("Неперевірена помилка");
            System.out.println("1");
        }catch (Exception e){
            System.out.println("2" + e);
        }
        System.out.println("3");*/

        /*try {
            System.out.println("0");
            throw new RuntimeException("Помилка");
        }
        catch (NullPointerException e)
        {
            System.out.println("1");
        }
        catch (RuntimeException e){
            System.out.println("2");
        }
        catch (Exception e){
            System.out.println("3");
        }
        System.out.println("4");*/

       /* try {
            System.out.println("0");
            throw new RuntimeException("Помилка");
        }
        catch (NullPointerException e)
        {
            System.out.println("1");
        }
        catch (Exception e){
            System.out.println("2");
        }
        catch (Error e){
            System.out.println("3");
        }
        System.out.println("4");*/

        /*try{
            System.out.println("0");
            throw new RuntimeException("Помилка");
        } catch (NullPointerException e) {
            System.out.println("1");
        }
        System.out.println("2");*/

        /*try{
            System.out.println("0");
            throw new NullPointerException("Помилка");
        } catch (ArithmeticException e) {
            System.out.println("1" );
        } catch (Exception e) {
            System.out.println("2" );
        } catch (RuntimeException e)
        { System.out.println("3" );
        }
        System.out.println("4");*/

        /*try{
            System.out.println("0");
            throw new NullPointerException("Помилка");
        } catch (NullPointerException e) {
            System.out.println("1" );
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("2" );
        }
        System.out.println("3");*/

               /* try{
                    System.out.println("0");
                    throw new NullPointerException("Помилка");
                } catch (NullPointerException e) {
                    System.out.println("1" );
                }finally {
                    System.out.println("2" );
                }
                System.out.println("3");*/

  /*      try{
            int l = args.length;
            System.out.println("розмір масиву=" + l);
            int h=10/l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Ділення на нуль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Індекс не існує");
        }*/


    }
}
