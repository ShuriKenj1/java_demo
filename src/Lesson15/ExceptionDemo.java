package Lesson15;

public class ExceptionDemo {
//    try {
//        block of code with potential exceptions
//    }
//    catch (ExceptionType exceptionObj){
//        block of code which will be executed if the exception of this type will occur
//    }
//    finally {
//        block of code which will be executed no matter what
//    }

    public static void main(String[] args) {
        int[] arr1 = {4, 8, 6, 200, 7, 24, 5108, 43};
        int[] arr2 = {1, 4, 0, 31, 0, 9};

        for (int i = 0; i < arr1.length; i++){
            try {
                System.out.println("arr1[" + i + "]/arr2[" + i + "] = " + arr1[i]/arr2[i]);
            } catch (ArrayIndexOutOfBoundsException exc) { // нет смысла тут ловить ошибку, которая не произошла, (нужно перехватывать именно те ошибки, которые могут произойти)
                System.out.println("Out of bound Exception has occurred!");
//            exc.printStackTrace(); // отображает ошибку, но не завершает программу
//            throw exc; // выбрасывает ошибку обратно
            } catch (ArithmeticException exc){
                System.out.println("Arithmetic exception has occurred");
            }
        }

        for (int i = 0; i < arr1.length; i++){
            try {
                System.out.println("arr1[" + i + "]/arr2[" + i + "] = " + arr1[i]/arr2[i]);
            } catch (ArithmeticException exc){
                System.out.println("Arithmetic exception has occurred");
            } catch (Exception exc) { // родительский класс ошибок - ловит любые (но это считается не эффективным, так как потом сложнее обработать и понять причину ошибки)
                System.out.println("Out of bound Exception has occurred!");
            }
        }

        System.out.println("After catch");
    }
}
