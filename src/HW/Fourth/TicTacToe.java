package HW.Fourth;

import java.util.Scanner;

public class TicTacToe {
    int counterOfFiguresPlacedByPlayer = 0;
    char field[] = new char[9];
    char figureOfPlayer;
    char figureOfProgram;
    int playerDecidesWhereToGo;

    boolean allFieldsAreFilled = false;
    boolean ifYouWin = false;
    boolean ifProgramWin = false;
    boolean ifGameEnds = false;
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

        if (figureOfPlayer == 'X') {
            initializeField();
            System.out.println("You will go first");
            figureOfProgram = 'O';
        } else if (figureOfPlayer == 'O') {
            initializeField();
            System.out.println("\nThe program will play for X.");
            System.out.println("You will go after it.");
            figureOfProgram = 'X';
        } else {
            System.out.println("You may write here only X or O, try again\n");
            choiceOfFigure();
        }
    }

    void Game() {
        do {
            if (figureOfPlayer == 'X') {
                playersMove();
                counterOfFiguresPlacedByPlayer++;
                System.out.println("Counter " + counterOfFiguresPlacedByPlayer);
            } else if (figureOfPlayer == 'O') {
                programsMove();
            }
            if (CheckIfGameEnds()) {
                counterOfFiguresPlacedByPlayer = 0;
                break;
            }
            if (figureOfPlayer == 'X') {
                programsMove();
            } else if (figureOfPlayer == 'O') {
                playersMove();
                counterOfFiguresPlacedByPlayer++;
                System.out.println("Counter " + counterOfFiguresPlacedByPlayer);
            }
            if (CheckIfGameEnds()) {
                counterOfFiguresPlacedByPlayer = 0;
                break;
            }
        } while (!CheckIfGameEnds());
    }

    void playersMove() {
        showField();
        System.out.println("Your turn");
        Scanner PlayerMove = new Scanner(System.in);
        playerDecidesWhereToGo = PlayerMove.nextInt();

        for (int i = 0; i <= field.length; i++) {
            if (playerDecidesWhereToGo == i & isFieldEmpty[i]) {
                field[i] = figureOfPlayer;
                isFieldEmpty[i] = false;
                break;
            } else if (!isFieldEmpty[playerDecidesWhereToGo]) {
                System.out.println("You can't put your figure here. Try another.");
                playersMove();
            }
        }
    }

    void programsMove() {
        //сперва рассматривается игра program за 'X'
        if (figureOfProgram == 'X') {
            switch (counterOfFiguresPlacedByPlayer) {
                case 0:
                    prMakesMove(0);
                    break;
                case 1:
                    if (playerDecidesWhereToGo == 3 | playerDecidesWhereToGo == 6) {
                        prMakesMove(2);
                        break;
                    } else if (playerDecidesWhereToGo == 1 | playerDecidesWhereToGo == 2 | playerDecidesWhereToGo == 5 |
                            playerDecidesWhereToGo == 7 | playerDecidesWhereToGo == 8) {
                        prMakesMove(6);
                        break;
                    } else if (playerDecidesWhereToGo == 4) {
                        prMakesMove(8);
                        break;
                    }
                case 2:
                    if (isFieldEmpty[3] & field[6] == figureOfProgram) {
                        prMakesMove(3);
                        break;
                    } else if (isFieldEmpty[1] & field[2] == figureOfProgram) {
                        prMakesMove(1);
                        break;
                    } else if (field[3] == figureOfPlayer & (field[1] == figureOfPlayer | field[5] == figureOfPlayer | field[7] == figureOfPlayer)) {
                        prMakesMove(4);
                        break;
                    } else if ((field[2] == figureOfPlayer | field[6] == figureOfPlayer) & isFieldEmpty[8]) {
                        prMakesMove(8);
                        break;
                    } else if (field[8] == figureOfPlayer & isFieldEmpty[2]) {
                        prMakesMove(2);
                        break;
                    } else if (field[4] == figureOfPlayer) {
                        if (playerDecidesWhereToGo == 1) {
                            prMakesMove(7);
                            break;
                        } else if (playerDecidesWhereToGo == 2) {
                            prMakesMove(6);
                            break;
                        } else if (playerDecidesWhereToGo == 3) {
                            prMakesMove(5);
                            break;
                        } else if (playerDecidesWhereToGo == 5) {
                            prMakesMove(3);
                            break;
                        } else if (playerDecidesWhereToGo == 6) {
                            prMakesMove(2);
                            break;
                        } else if (playerDecidesWhereToGo == 7) {
                            prMakesMove(1);
                            break;
                        }
                    }
                case 3:
                    if (field[4] == figureOfPlayer & field[8] == figureOfProgram) { // проверка 4 первый ход
                        if (field[1] == figureOfPlayer & field[7] == figureOfProgram) {
                            if (playerDecidesWhereToGo == 6) {
                                prMakesMove(2);
                                break;
                            } else if (isFieldEmpty[6]) {
                                prMakesMove(6);
                                break;
                            }
                        } else if (field[2] == figureOfPlayer & field[6] == figureOfProgram) {
                            if (playerDecidesWhereToGo == 3) {
                                prMakesMove(7);
                                break;
                            } else if (playerDecidesWhereToGo == 7) {
                                prMakesMove(3);
                                break;
                            } else if (isFieldEmpty[3]) {
                                prMakesMove(3);
                                break;
                            } else if (isFieldEmpty[7]) {
                                prMakesMove(7);
                                break;
                            }
                        } else if (field[3] == figureOfPlayer & field[5] == figureOfProgram) {
                            if (playerDecidesWhereToGo == 2) {
                                prMakesMove(6);
                                break;
                            } else if (isFieldEmpty[2]) {
                                prMakesMove(2);
                                break;
                            }
                        } else if (field[5] == figureOfPlayer & field[3] == figureOfProgram) {
                            if (playerDecidesWhereToGo == 6) {
                                prMakesMove(2);
                                break;
                            } else if (isFieldEmpty[6]) {
                                prMakesMove(6);
                                break;
                            }
                        } else if (field[6] == figureOfPlayer & field[2] == figureOfProgram) {
                            if (playerDecidesWhereToGo == 1) {
                                prMakesMove(5);
                                break;
                            } else if (playerDecidesWhereToGo == 5) {
                                prMakesMove(1);
                                break;
                            } else if (isFieldEmpty[1]) {
                                prMakesMove(1);
                                break;
                            } else if (isFieldEmpty[5]) {
                                prMakesMove(5);
                            }
                        } else if (field[7] == figureOfPlayer & field[1] == figureOfProgram) {
                            if (playerDecidesWhereToGo == 2) {
                                prMakesMove(6);
                                break;
                            } else if (isFieldEmpty[2]) {
                                prMakesMove(2);
                                break;
                            }
                        }
                    } else if (field[1] == figureOfPlayer & field[6] == figureOfPlayer & field[2] == figureOfProgram & field[4] != figureOfProgram) { // проверка 6 первый ход
                        if (playerDecidesWhereToGo == 4) {
                            prMakesMove(5);
                            break;
                        } else if (playerDecidesWhereToGo == 5) {
                            prMakesMove(4);
                            break;
                        } else if (isFieldEmpty[5]) {
                            prMakesMove(5);
                            break;
                        } else if (isFieldEmpty[4]) {
                            prMakesMove(4);
                            break;
                        }
                    } else if (field[3] == figureOfPlayer) {
                        if (field[4] == figureOfProgram & (field[1] == figureOfPlayer | field[5] == figureOfPlayer | field[7] == figureOfPlayer)) {//проверка первый ход 1, 5 или 7
                            if (field[6] == figureOfProgram) {
                                if (playerDecidesWhereToGo == 2 & isFieldEmpty[8]) {
                                    prMakesMove(8);
                                    break;
                                } else if (playerDecidesWhereToGo == 8 & isFieldEmpty[2]) {
                                    prMakesMove(2);
                                    break;
                                } else if (isFieldEmpty[2] | isFieldEmpty[8]) {
                                    prMakesMove(2);
                                    break;
                                }
                            } else if (field[2] == figureOfProgram) { // проверка 3 первый ход
                                if (playerDecidesWhereToGo == 6 & isFieldEmpty[8]) {
                                    prMakesMove(8);
                                    break;
                                } else if (playerDecidesWhereToGo == 8) {
                                    prMakesMove(6);
                                    break;
                                } else if (isFieldEmpty[6] | isFieldEmpty[8]) {
                                    prMakesMove(8);
                                    break;
                                }
                            }
                        } else if (field[2] == figureOfPlayer & isFieldEmpty[4]) { // проверка 2 первый ход
                            if (playerDecidesWhereToGo == 4 & isFieldEmpty[7]) {
                                prMakesMove(7);
                                break;
                            } else if (playerDecidesWhereToGo == 7) {
                                prMakesMove(4);
                                break;
                            } else {
                                prMakesMove(4);
                                break;
                            }
                        } else if (field[8] == figureOfPlayer) { // проверка 8 первый ход
                            if (playerDecidesWhereToGo == 1 & isFieldEmpty[4]) {
                                prMakesMove(4);
                                break;
                            } else if (playerDecidesWhereToGo == 4 & isFieldEmpty[1]) {
                                prMakesMove(1);
                                break;
                            } else if (isFieldEmpty[1]) {
                                prMakesMove(1);
                                break;
                            } else if (isFieldEmpty[4]) {
                                prMakesMove(4);
                                break;
                            }
                        }
                    }
                case 4:
                    if (field[2] == figureOfProgram & field[8] == figureOfProgram) {
                        if (field[7] == figureOfProgram) {
                            if (isFieldEmpty[5]) {
                                prMakesMove(5);
                                break;
                            } else {
                                prMakesMove(3);
                                break;
                            }
                        } else if (field[3] == figureOfProgram) {
                            if (isFieldEmpty[1]) {
                                prMakesMove(1);
                                break;
                            } else {
                                prMakesMove(7);
                                break;
                            }
                        }
                    } else if (field[6] == figureOfProgram) {
                        if (field[5] == figureOfProgram) {
                            if (isFieldEmpty[7]) {
                                prMakesMove(7);
                                break;
                            } else {
                                prMakesMove(1);
                                break;
                            }
                        } else if (field[1] == figureOfProgram) {
                            if (isFieldEmpty[3]) {
                                prMakesMove(3);
                                break;
                            } else {
                                prMakesMove(5);
                                break;
                            }
                        }
                    }
            }
        } else if (figureOfProgram == 'O') {
            switch (counterOfFiguresPlacedByPlayer) {
                case 1:
                    if (playerDecidesWhereToGo == 4) {
                        prMakesMove(0);
                        break;
                    } else {
                        prMakesMove(4);
                        break;
                    }
                case 2:
                    if (field[0] == figureOfProgram & field[4] == figureOfPlayer) { // если первый ход игрока = 4, а мы 0

                    } else if (field[4] == figureOfProgram & field[0] == figureOfPlayer) { // если первый ход игрока = 0, а мы 4
                        if (playerDecidesWhereToGo == 1) {
                            prMakesMove(2);
                            break;
                        } else if (playerDecidesWhereToGo == 2 | playerDecidesWhereToGo == 5 | playerDecidesWhereToGo == 8) {
                            prMakesMove(1);
                            break;
                        } else if (playerDecidesWhereToGo == 3) {
                            prMakesMove(6);
                            break;
                        } else if (playerDecidesWhereToGo == 6 | playerDecidesWhereToGo == 7) {
                            prMakesMove(3);
                            break;
                        }
                    }
            }
        }
    }


    boolean IfPlayerWin() {
        if (field[0] == figureOfPlayer & field[1] == figureOfPlayer & field[2] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
            showField();
        } else if (field[3] == figureOfPlayer & field[4] == figureOfPlayer & field[5] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
            showField();
        } else if (field[6] == figureOfPlayer & field[7] == figureOfPlayer & field[8] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
            showField();
        } else if (field[0] == figureOfPlayer & field[3] == figureOfPlayer & field[6] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
            showField();
        } else if (field[1] == figureOfPlayer & field[4] == figureOfPlayer & field[7] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
            showField();
        } else if (field[2] == figureOfPlayer & field[5] == figureOfPlayer & field[8] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
            showField();
        } else if (field[0] == figureOfPlayer & field[4] == figureOfPlayer & field[8] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
            showField();
        } else if (field[2] == figureOfPlayer & field[4] == figureOfPlayer & field[6] == figureOfPlayer) {
            System.out.println("You win!");
            ifYouWin = true;
            showField();
        }
        return ifYouWin;
    }

    boolean IfProgWin() {
        if (field[0] == figureOfProgram & field[1] == figureOfProgram & field[2] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
            showField();
        } else if (field[3] == figureOfProgram & field[4] == figureOfProgram & field[5] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
            showField();
        } else if (field[6] == figureOfProgram & field[7] == figureOfProgram & field[8] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
            showField();
        } else if (field[0] == figureOfProgram & field[3] == figureOfProgram & field[6] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
            showField();
        } else if (field[1] == figureOfProgram & field[4] == figureOfProgram & field[7] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
            showField();
        } else if (field[2] == figureOfProgram & field[5] == figureOfProgram & field[8] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
            showField();
        } else if (field[0] == figureOfProgram & field[4] == figureOfProgram & field[8] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
            showField();
        } else if (field[2] == figureOfProgram & field[4] == figureOfProgram & field[6] == figureOfProgram) {
            System.out.println("Game over!");
            ifProgramWin = true;
            showField();
        }
        return ifProgramWin;
    }

    void prMakesMove(int i) {
        field[i] = figureOfProgram;
        isFieldEmpty[i] = false;
    }

    boolean IfTie() {
        if (!ifProgramWin & !ifYouWin & IfAllFieldsHaveFigures()) {
            System.out.println("Well, that's a tie!");
            showField();
            return true;
        } else return false;
    }

    boolean CheckIfGameEnds() {
        if (IfProgWin() | IfPlayerWin()) ifGameEnds = true;
        else ifGameEnds = IfTie();
        return ifGameEnds;
    }

    boolean IfAllFieldsHaveFigures() {
        allFieldsAreFilled = !isFieldEmpty[0] & !isFieldEmpty[1] & !isFieldEmpty[2]
                & !isFieldEmpty[3] & !isFieldEmpty[4] & !isFieldEmpty[5]
                & !isFieldEmpty[6] & !isFieldEmpty[7] & !isFieldEmpty[8];
        return allFieldsAreFilled;
    }
}