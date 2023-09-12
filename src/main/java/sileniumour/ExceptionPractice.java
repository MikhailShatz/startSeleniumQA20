package sileniumour;
public class ExceptionPractice {
    public static void main(String[] args) throws InterruptedException, ArithmeticException {

        pause();
        pause2();
       // throwsEx(); // cant be used because division occurs before sout
       tryCatchFinally();
    }
    public static void pause() throws InterruptedException {
        Thread.sleep(2000);
    }
    public static void pause2()  {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Method pause 2 was completed");
        }
    }

    public static void throwsEx() throws ArithmeticException{
        int result = 9 / 0;
        System.out.println("Result: " + result);
    }
    public static void tryCatchFinally() throws ArithmeticException{
        try {
            int result = 9 / 0;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Arithmetic exception "+e.getMessage());

        }finally {
            System.out.println("Method tryCatchFinally was completed");
        }
    }



}

