package Lesson3;

public class SwitchDemo {
    public static void main(String[] args) {
//        switch () {
//            case constant1:
//                some code
//                break;
//            case constant2:
//                some code
//                break;
//            case constant3:
//                some code
//                break;
//            default:
//                some code
//        }

        int i;

        for (i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is equal to 0");
                    break;
                case 1:
                    System.out.println("i is equal to 1");
                    break;
                case 2:
                    System.out.println("i is equal to 2");
                    break;
                case 3:
                    System.out.println("i is equal to 3");
                    break;
                case 4:
                    System.out.println("i is equal to 4");
                    break;
                default:
                    System.out.println("i is equal or greater than 5");
            }
            switch (i) { //"enhanced" version - более сокращенная, без break
                case 0 -> System.out.println("i is equal to 0");
                case 1 -> System.out.println("i is equal to 1");
                case 2 -> System.out.println("i is equal to 2");
                case 3 -> System.out.println("i is equal to 3");
                case 4 -> System.out.println("i is equal to 4");
                default -> System.out.println("i is equal or greater than 5");
            }
        }
    }
}
