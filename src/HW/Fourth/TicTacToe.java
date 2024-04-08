package HW.Fourth;
//(!+ не забыть добавить ничью)

import java.util.Scanner;

public class TicTacToe {
    int counterOfMoves;
    char field[] = new char[9];
    char figureOfPlayer;
    char figureOfProgram;
    int playerDecidesWhereToGo;
    boolean ifYouWin = false;
    boolean ifProgramWin = false;
    boolean isFieldEmpty[] = new boolean[9];

    void initializeField() {
        for (int f = 0; f < field.length; f++) {
            field[f] = ' ';
            isFieldEmpty[f] = true;
        }
    }

    void showField() {
        System.out.println("  " + field[0] + "\t||\t" + field[1] + "  || " + field[2]);
        System.out.println("====||=====||====");
        System.out.println("  " + field[3] + "\t||\t" + field[4] + "  || " + field[5]);
        System.out.println("====||=====||====");
        System.out.println("  " + field[6] + "\t||\t" + field[7] + "  || " + field[8]);
    }

    void Rules() {
        System.out.println("Rules:" +
                "\nDecide where to put your figure by printing number from 0 to 8.");
        System.out.println("""
                Structure:
                0, 1, 2 - first row
                3, 4, 5 - second row
                6, 7, 8 - third row""");
        System.out.println("Get three of your figures in a row, column or diagonal to win.");
    }

    void choiceOfFigure() {
        System.out.println("To start, please, choose with which" +
                " figure you will play: X or O");
        Scanner XorO = new Scanner(System.in);
        figureOfPlayer = XorO.nextLine().charAt(0);

        do {
            if (figureOfPlayer == 'X') {
                initializeField();
                System.out.println("You will go first");
                figureOfProgram = 'O';
            } else if (figureOfPlayer == 'O') {
                initializeField();
                System.out.println("The program will play for X." +
                        "\nYou will go after it.");
                figureOfProgram = 'X';
            } else {
                System.out.println("You may write here only X or O, try again\n");
                choiceOfFigure();
            }
        } while (figureOfPlayer != 'X' && figureOfPlayer != 'O');
    }

    void Game() {
        if (figureOfPlayer == 'X') {
            for (counterOfMoves = 0;!IfProgWin() | !IfPlayerWin(); ) {
                playersMove();
                IfPlayerWin();
                counterOfMoves++;
                programsMove();
                IfProgWin();
            }
        } else if (figureOfPlayer == 'O') {
            for (counterOfMoves = 0;!IfProgWin() | !IfPlayerWin(); ) {
                programsMove();
                IfProgWin();
                playersMove();
                IfPlayerWin();
                counterOfMoves++;
            }
        }
    }

    void playersMove() {
        showField();
        System.out.println("Your turn");
        Scanner PlayerMove = new Scanner(System.in);
        playerDecidesWhereToGo = PlayerMove.nextInt();

        if (playerDecidesWhereToGo == 0 & isFieldEmpty[0]) {
            field[0] = figureOfPlayer;
            isFieldEmpty[0] = false;
        } else if (playerDecidesWhereToGo == 1 & isFieldEmpty[1]) {
            field[1] = figureOfPlayer;
            isFieldEmpty[1] = false;
        } else if (playerDecidesWhereToGo == 2 & isFieldEmpty[2]) {
            field[2] = figureOfPlayer;
            isFieldEmpty[2] = false;
        } else if (playerDecidesWhereToGo == 3 & isFieldEmpty[3]) {
            field[3] = figureOfPlayer;
            isFieldEmpty[3] = false;
        } else if (playerDecidesWhereToGo == 4 & isFieldEmpty[4]) {
            field[4] = figureOfPlayer;
            isFieldEmpty[4] = false;
        } else if (playerDecidesWhereToGo == 5 & isFieldEmpty[5]) {
            field[5] = figureOfPlayer;
            isFieldEmpty[5] = false;
        } else if (playerDecidesWhereToGo == 6 & isFieldEmpty[6]) {
            field[6] = figureOfPlayer;
            isFieldEmpty[6] = false;
        } else if (playerDecidesWhereToGo == 7 & isFieldEmpty[7]) {
            field[7] = figureOfPlayer;
            isFieldEmpty[7] = false;
        } else if (playerDecidesWhereToGo == 8 & isFieldEmpty[8]) {
            field[8] = figureOfPlayer;
            isFieldEmpty[8] = false;
        } else {
            System.out.println("You can't put your figure here. Try another.");
            playersMove();
//            else (playerDecidesWhereToGo < '0' | playerDecidesWhereToGo > '8') {
//                System.out.println("Only numbers from 0 to 8 may be used, try again");
//                playersMove();
        }
    }

    void programsMove() {
        //сперва рассматривается игра program за 'X'
        if (figureOfProgram == 'X') {
            if (isFieldEmpty[0]) {
                field[0] = figureOfProgram;
                isFieldEmpty[0] = false;
            }
            if (playerDecidesWhereToGo == 6 & isFieldEmpty[2]) {
                field[2] = figureOfProgram;
                isFieldEmpty[2] = false;
            } else if (playerDecidesWhereToGo == 2 | playerDecidesWhereToGo == 8 & isFieldEmpty[6]) {
                field[6] = figureOfProgram;
                isFieldEmpty[6] = false;
            } else if (playerDecidesWhereToGo == 1 | playerDecidesWhereToGo == 3 | playerDecidesWhereToGo == 5 | playerDecidesWhereToGo == 7) {

            }
        }


//        попробую через такую структуру расписать (все варианты, ведущие к победе для робота)
        if (field[0] == figureOfProgram) {
            if (field[1] == figureOfProgram & isFieldEmpty[2]) {
                field[2] = figureOfProgram;
                isFieldEmpty[2] = false;
            } else if (field[2] == figureOfProgram & isFieldEmpty[1]) {
                field[1] = figureOfProgram;
                isFieldEmpty[1] = false;
            } else if (field[4] == figureOfProgram & isFieldEmpty[8]) {
                field[8] = figureOfProgram;
                isFieldEmpty[8] = false;
            } else if (field[8] == figureOfProgram & isFieldEmpty[4]) {
                field[4] = figureOfProgram;
                isFieldEmpty[4] = false;
            } else if (field[3] == figureOfProgram & isFieldEmpty[6]) {
                field[6] = figureOfProgram;
                isFieldEmpty[6] = false;
            } else if (field[6] == figureOfProgram & isFieldEmpty[3]) {
                field[3] = figureOfProgram;
                isFieldEmpty[3] = false;
            }
        }
        if (field[1] == figureOfProgram) {
            if (field[2] == figureOfProgram & isFieldEmpty[0]) {
                field[0] = figureOfProgram;
                isFieldEmpty[0] = false;
            } else if (field[4] == figureOfProgram & isFieldEmpty[7]) {
                field[7] = figureOfProgram;
                isFieldEmpty[7] = false;
            } else if (field[7] == figureOfProgram & isFieldEmpty[4]) {
                field[4] = figureOfProgram;
                isFieldEmpty[4] = false;
            }
        }
        if (field[2] == figureOfProgram) {
            if (field[1] == figureOfProgram & isFieldEmpty[0]) {
                field[0] = figureOfProgram;
                isFieldEmpty[0] = false;
            } else if (field[4] == figureOfProgram & isFieldEmpty[6]) {
                field[6] = figureOfProgram;
                isFieldEmpty[6] = false;
            } else if (field[6] == figureOfProgram & isFieldEmpty[4]) {
                field[4] = figureOfProgram;
                isFieldEmpty[4] = false;
            } else if (field[5] == figureOfProgram & isFieldEmpty[8]) {
                field[8] = figureOfProgram;
                isFieldEmpty[5] = false;
            } else if (field[8] == figureOfProgram & isFieldEmpty[5]) {
                field[5] = figureOfProgram;
                isFieldEmpty[5] = false;
            }
        }
        if (field[3] == figureOfProgram) {
            if (field[0] == figureOfProgram & isFieldEmpty[6]) {
                field[6] = figureOfProgram;
                isFieldEmpty[6] = false;
            } else if (field[6] == figureOfProgram & isFieldEmpty[0]) {
                field[0] = figureOfProgram;
                isFieldEmpty[0] = false;
            } else if (field[4] == figureOfProgram & isFieldEmpty[5]) {
                field[5] = figureOfProgram;
                isFieldEmpty[5] = false;
            } else if (field[5] == figureOfProgram & isFieldEmpty[4]) {
                field[4] = figureOfProgram;
                isFieldEmpty[4] = false;
            }
        }
        if (field[4] == figureOfProgram) {
            if (field[8] == figureOfProgram & isFieldEmpty[0]) {
                field[0] = figureOfProgram;
                isFieldEmpty[0] = false;
            } else if (field[7] == figureOfProgram & isFieldEmpty[1]) {
                field[1] = figureOfProgram;
                isFieldEmpty[1] = false;
            } else if (field[6] == figureOfProgram & isFieldEmpty[2]) {
                field[2] = figureOfProgram;
                isFieldEmpty[2] = false;
            } else if (field[5] == figureOfProgram & isFieldEmpty[3]) {
                field[3] = figureOfProgram;
                isFieldEmpty[3] = false;
            }
        }
        if (field[5] == figureOfProgram) {
            if (field[8] == figureOfProgram & isFieldEmpty[2]) {
                field[2] = figureOfProgram;
                isFieldEmpty[2] = false;
            }
        }
        if (field[6] == figureOfProgram) {
            if (field[3] == figureOfProgram & isFieldEmpty[0]) {
                field[0] = figureOfProgram;
                isFieldEmpty[0] = false;
            } else if (field[7] == figureOfProgram & isFieldEmpty[8]) {
                field[8] = figureOfProgram;
                isFieldEmpty[8] = false;
            } else if (field[8] == figureOfProgram & isFieldEmpty[7]) {
                field[7] = figureOfProgram;
                isFieldEmpty[7] = false;
            }
        }
        if (field[7] == figureOfProgram) {
            if (field[8] == figureOfProgram & isFieldEmpty[6]) {
                field[6] = figureOfProgram;
                isFieldEmpty[6] = false;
            }
        }

//        switch (playerDecidesWhereToGo) {
//            case 0:
//                if (field[1] == figureOfPlayer & isFieldEmpty[2]) {
//                    field[2] = figureOfProgram;
//                    isFieldEmpty[2] = false;
//                } else if (field[3] == figureOfPlayer & isFieldEmpty[6]) {
//                    field[6] = figureOfProgram;
//                    isFieldEmpty[6] = false;
//                } else if (field[4] == figureOfPlayer & isFieldEmpty[4]) {
//                    field[4] = figureOfProgram;
//                    isFieldEmpty[4] = false;
//                } else if () {
//
//                }
//                playersMove();
//            case 1:
//
//
//        }
    }

    boolean IfPlayerWin() {
        if (field[0] == figureOfPlayer & field[1] == figureOfPlayer & field[2] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
        } else if (field[3] == figureOfPlayer & field[4] == figureOfPlayer & field[5] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
        } else if (field[6] == figureOfPlayer & field[7] == figureOfPlayer & field[8] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
        } else if (field[0] == figureOfPlayer & field[3] == figureOfPlayer & field[6] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
        } else if (field[1] == figureOfPlayer & field[4] == figureOfPlayer & field[7] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
        } else if (field[2] == figureOfPlayer & field[5] == figureOfPlayer & field[8] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
        } else if (field[0] == figureOfPlayer & field[4] == figureOfPlayer & field[8] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
        } else if (field[2] == figureOfPlayer & field[4] == figureOfPlayer & field[6] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
        }
        return ifYouWin;
    }

    boolean IfProgWin() {
        if (field[0] == figureOfProgram & field[1] == figureOfProgram & field[2] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
        } else if (field[3] == figureOfProgram & field[4] == figureOfProgram & field[5] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
        } else if (field[6] == figureOfProgram & field[7] == figureOfProgram & field[8] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
        } else if (field[0] == figureOfProgram & field[3] == figureOfProgram & field[6] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
        } else if (field[1] == figureOfProgram & field[4] == figureOfProgram & field[7] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
        } else if (field[2] == figureOfProgram & field[5] == figureOfProgram & field[8] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
        } else if (field[0] == figureOfProgram & field[4] == figureOfProgram & field[8] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
        } else if (field[2] == figureOfProgram & field[4] == figureOfProgram & field[6] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
        }
        return ifProgramWin;
    }
}
