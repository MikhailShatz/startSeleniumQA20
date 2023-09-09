package sileniumour;

public class ExceptionPractice {
    public static void main(String[] args) {
        try {
            pause();
            pause2();
        } catch (InterruptedException e) {
            System.out.println("Caught Interrupted Exception: " + e.getMessage());
        } finally {
            System.out.println("Pause function execution completed.");
        }

        try {
           throwsEx();
           tryCatchFinally();
        } catch (Exception e) {
            System.out.println("Caught InterruptedException: " + e.getMessage());
        } finally {
            System.out.println("Divide by zero functions execution completed.");
        }
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
            System.out.println("finally");
        }
    }

    public static void throwsEx() throws ArithmeticException{
        int result = 9 / 0; // This will throw an ArithmeticException
        System.out.println("Result: " + result);
    }
    public static void tryCatchFinally(){
        try {
            int result = 9 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());
        }finally {
            System.out.println("finally");
        }
    }



}
