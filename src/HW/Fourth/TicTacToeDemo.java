package HW.Fourth;

import java.util.Scanner;

public class TicTacToeDemo {
    public static void main(String[] args) {
        char playAgain;

        TicTacToe proba = new TicTacToe();

        System.out.println("Welcome to the TicTacToe Game!\n");

        proba.Rules();
//        do {
            proba.choiceOfFigure();
            proba.Game();

//            System.out.println("-----------------------------------------");
//            System.out.println("\nThat was a great game! Wanna play again?");
//            System.out.println("Y - yes, N - no");
//
//            Scanner check = new Scanner(System.in);
//            playAgain = check.nextLine().charAt(0);
//            if (playAgain == 'n'){
//                System.out.println("Till next time!");
//            }
//        } while (playAgain != 'n');


    }
}

//            Все варианты расписанные для победы программы
//            if (field[0] == figureOfProgram) {
//                if (field[1] == figureOfProgram & isFieldEmpty[2]) {
//                    field[2] = figureOfProgram;
//                    isFieldEmpty[2] = false;
//                } else if (field[2] == figureOfProgram & isFieldEmpty[1]) {
//                    field[1] = figureOfProgram;
//                    isFieldEmpty[1] = false;
//                } else if (field[4] == figureOfProgram & isFieldEmpty[8]) {
//                    field[8] = figureOfProgram;
//                    isFieldEmpty[8] = false;
//                } else if (field[8] == figureOfProgram & isFieldEmpty[4]) {
//                    field[4] = figureOfProgram;
//                    isFieldEmpty[4] = false;
//                } else if (field[3] == figureOfProgram & isFieldEmpty[6]) {
//                    field[6] = figureOfProgram;
//                    isFieldEmpty[6] = false;
//                } else if (field[6] == figureOfProgram & isFieldEmpty[3]) {
//                    field[3] = figureOfProgram;
//                    isFieldEmpty[3] = false;
//                }
//            }
//            if (field[1] == figureOfProgram) {
//                if (field[2] == figureOfProgram & isFieldEmpty[0]) {
//                    field[0] = figureOfProgram;
//                    isFieldEmpty[0] = false;
//                } else if (field[4] == figureOfProgram & isFieldEmpty[7]) {
//                    field[7] = figureOfProgram;
//                    isFieldEmpty[7] = false;
//                } else if (field[7] == figureOfProgram & isFieldEmpty[4]) {
//                    field[4] = figureOfProgram;
//                    isFieldEmpty[4] = false;
//                }
//            }
//            if (field[2] == figureOfProgram) {
//                if (field[1] == figureOfProgram & isFieldEmpty[0]) {
//                    field[0] = figureOfProgram;
//                    isFieldEmpty[0] = false;
//                } else if (field[4] == figureOfProgram & isFieldEmpty[6]) {
//                    field[6] = figureOfProgram;
//                    isFieldEmpty[6] = false;
//                } else if (field[6] == figureOfProgram & isFieldEmpty[4]) {
//                    field[4] = figureOfProgram;
//                    isFieldEmpty[4] = false;
//                } else if (field[5] == figureOfProgram & isFieldEmpty[8]) {
//                    field[8] = figureOfProgram;
//                    isFieldEmpty[5] = false;
//                } else if (field[8] == figureOfProgram & isFieldEmpty[5]) {
//                    field[5] = figureOfProgram;
//                    isFieldEmpty[5] = false;
//                }
//            }
//            if (field[3] == figureOfProgram) {
//                if (field[0] == figureOfProgram & isFieldEmpty[6]) {
//                    field[6] = figureOfProgram;
//                    isFieldEmpty[6] = false;
//                } else if (field[6] == figureOfProgram & isFieldEmpty[0]) {
//                    field[0] = figureOfProgram;
//                    isFieldEmpty[0] = false;
//                } else if (field[4] == figureOfProgram & isFieldEmpty[5]) {
//                    field[5] = figureOfProgram;
//                    isFieldEmpty[5] = false;
//                } else if (field[5] == figureOfProgram & isFieldEmpty[4]) {
//                    field[4] = figureOfProgram;
//                    isFieldEmpty[4] = false;
//                }
//            }
//            if (field[4] == figureOfProgram) {
//                if (field[8] == figureOfProgram & isFieldEmpty[0]) {
//                    field[0] = figureOfProgram;
//                    isFieldEmpty[0] = false;
//                } else if (field[7] == figureOfProgram & isFieldEmpty[1]) {
//                    field[1] = figureOfProgram;
//                    isFieldEmpty[1] = false;
//                } else if (field[6] == figureOfProgram & isFieldEmpty[2]) {
//                    field[2] = figureOfProgram;
//                    isFieldEmpty[2] = false;
//                } else if (field[5] == figureOfProgram & isFieldEmpty[3]) {
//                    field[3] = figureOfProgram;
//                    isFieldEmpty[3] = false;
//                }
//            }
//            if (field[5] == figureOfProgram) {
//                if (field[8] == figureOfProgram & isFieldEmpty[2]) {
//                    field[2] = figureOfProgram;
//                    isFieldEmpty[2] = false;
//                }
//            }
//            if (field[6] == figureOfProgram) {
//                if (field[3] == figureOfProgram & isFieldEmpty[0]) {
//                    field[0] = figureOfProgram;
//                    isFieldEmpty[0] = false;
//                } else if (field[7] == figureOfProgram & isFieldEmpty[8]) {
//                    field[8] = figureOfProgram;
//                    isFieldEmpty[8] = false;
//                } else if (field[8] == figureOfProgram & isFieldEmpty[7]) {
//                    field[7] = figureOfProgram;
//                    isFieldEmpty[7] = false;
//                }
//            }
//            if (field[7] == figureOfProgram) {
//                if (field[8] == figureOfProgram & isFieldEmpty[6]) {
//                    field[6] = figureOfProgram;
//                    isFieldEmpty[6] = false;
//                }
//            }
