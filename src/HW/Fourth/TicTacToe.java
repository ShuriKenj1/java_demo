package HW.Fourth;
//(!+ не забыть добавить ничью)

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
    boolean ifTie = false;
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

        do {
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
        } while (figureOfPlayer != 'X' && figureOfPlayer != 'O');
    }

    void Game() {
        if (figureOfPlayer == 'X') {
            do {
                playersMove();
                counterOfFiguresPlacedByPlayer++;
                if (CheckIfGameEnds()) break;
                programsMove();
                if (CheckIfGameEnds()) break;
            } while (!CheckIfGameEnds());
        } else if (figureOfPlayer == 'O') {
            do {
                programsMove();
                if (CheckIfGameEnds()) break;
                playersMove();
                counterOfFiguresPlacedByPlayer++;
                if (CheckIfGameEnds()) break;
                System.out.println("Counter " + counterOfFiguresPlacedByPlayer);
            } while (!CheckIfGameEnds());
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
        } else if (!isFieldEmpty[playerDecidesWhereToGo]) {
            System.out.println("You can't put your figure here. Try another.");
            playersMove();
        }
    }

    void programsMove() {
        //сперва рассматривается игра program за 'X'
        if (figureOfProgram == 'X') {
            switch (counterOfFiguresPlacedByPlayer) {
                case 0:
                    field[0] = figureOfProgram;
                    isFieldEmpty[0] = false;
                    break;
                case 1:
                    if (playerDecidesWhereToGo == 3 | playerDecidesWhereToGo == 6) {
                        field[2] = figureOfProgram;
                        isFieldEmpty[2] = false;
                        break;
                    } else if (playerDecidesWhereToGo == 1 | playerDecidesWhereToGo == 2 | playerDecidesWhereToGo == 5 |
                            playerDecidesWhereToGo == 7 | playerDecidesWhereToGo == 8) {
                        field[6] = figureOfProgram;
                        isFieldEmpty[6] = false;
                        break;
                    } else if (playerDecidesWhereToGo == 4) {
                        field[8] = figureOfProgram;
                        isFieldEmpty[8] = false;
                        break;
                    }
                case 2:
                    if (isFieldEmpty[3] & field[6] == figureOfProgram) {
                        field[3] = figureOfProgram;
                        isFieldEmpty[3] = false;
                        break;
                    } else if (isFieldEmpty[1] & field[2] == figureOfProgram) {
                        field[1] = figureOfProgram;
                        isFieldEmpty[1] = false;
                        break;
                    } else if (field[3] == figureOfPlayer & (field[1] == figureOfPlayer | field[5] == figureOfPlayer | field[7] == figureOfPlayer)) {
                        field[4] = figureOfProgram;
                        isFieldEmpty[4] = false;
                        break;
                    } else if ((field[2] == figureOfPlayer | field[6] == figureOfPlayer) & isFieldEmpty[8]) {
                        field[8] = figureOfProgram;
                        isFieldEmpty[8] = false;
                        break;
                    } else if (field[8] == figureOfPlayer & isFieldEmpty[2]) {
                        field[2] = figureOfProgram;
                        isFieldEmpty[2] = false;
                        break;
                    } else if (field[4] == figureOfPlayer) {
                        if (playerDecidesWhereToGo == 1) {
                            field[7] = figureOfProgram;
                            isFieldEmpty[7] = false;
                            break;
                        } else if (playerDecidesWhereToGo == 2) {
                            field[6] = figureOfProgram;
                            isFieldEmpty[6] = false;
                            break;
                        } else if (playerDecidesWhereToGo == 3) {
                            field[5] = figureOfProgram;
                            isFieldEmpty[5] = false;
                            break;
                        } else if (playerDecidesWhereToGo == 5) {
                            field[3] = figureOfProgram;
                            isFieldEmpty[3] = false;
                            break;
                        } else if (playerDecidesWhereToGo == 6) {
                            field[2] = figureOfProgram;
                            isFieldEmpty[2] = false;
                            break;
                        } else if (playerDecidesWhereToGo == 7) {
                            field[1] = figureOfProgram;
                            isFieldEmpty[1] = false;
                            break;
                        }
                    }
                case 3:
                    if (field[4] == figureOfPlayer) { // проверка 4 первый ход
                        if (field[1] == figureOfPlayer & playerDecidesWhereToGo == 6) {
                            field[2] = figureOfProgram;
                            isFieldEmpty[2] = false;
                            break;
                        } else if (isFieldEmpty[6]) {
                            field[6] = figureOfProgram;
                            isFieldEmpty[6] = false;
                            break;
                        }
                        if (field[2] == figureOfPlayer) {
                            if (playerDecidesWhereToGo == 3) {
                                field[7] = figureOfProgram;
                                isFieldEmpty[7] = false;
                                break;
                            } else if (playerDecidesWhereToGo == 7) {
                                field[3] = figureOfProgram;
                                isFieldEmpty[3] = false;
                                break;
                            } else if (isFieldEmpty[3]) {
                                field[3] = figureOfProgram;
                                isFieldEmpty[3] = false;
                                break;
                            }
                        }
                        if (field[3] == figureOfPlayer & playerDecidesWhereToGo == 2) {
                                field[6] = figureOfProgram;
                                isFieldEmpty[6] = false;
                                break;
                            } else if (isFieldEmpty[2]){
                                field[2] = figureOfProgram;
                                isFieldEmpty[2] = false;
                                break;
                            }
                        if (field[5] == figureOfPlayer & playerDecidesWhereToGo == 6) {
                                field[2] = figureOfProgram;
                                isFieldEmpty[2] = false;
                                break;
                            } else if (isFieldEmpty[6]){
                                field[6] = figureOfProgram;
                                isFieldEmpty[6] = false;
                                break;
                            }
                        if (field[2] == figureOfProgram) {
                            if (playerDecidesWhereToGo == 1) {
                                field[5] = figureOfProgram;
                                isFieldEmpty[5] = false;
                                break;
                            } else if (playerDecidesWhereToGo == 5) {
                                field[1] = figureOfProgram;
                                isFieldEmpty[1] = false;
                                break;
                            } else {
                                field[1] = figureOfProgram;
                                isFieldEmpty[1] = false;
                                break;
                            }
                        } else if (field[1] == figureOfProgram) {
                            if (playerDecidesWhereToGo == 2) {
                                field[6] = figureOfProgram;
                                isFieldEmpty[6] = false;
                                break;
                            } else {
                                field[2] = figureOfProgram;
                                isFieldEmpty[2] = false;
                                break;
                            }
                        }
                    } else if (field[1] == figureOfPlayer & field[6] == figureOfPlayer & field[2] == figureOfProgram) { // проверка 6 первый ход
                            if (playerDecidesWhereToGo == 4) {
                                field[5] = figureOfProgram;
                                isFieldEmpty[5] = false;
                                break;
                            } else if (playerDecidesWhereToGo == 5) {
                                field[4] = figureOfProgram;
                                isFieldEmpty[4] = false;
                                break;
                            } else {
                                field[4] = figureOfProgram;
                                isFieldEmpty[4] = false;
                                break;
                            }
                        } else if (field[3] == figureOfPlayer) {
                            if (field[4] == figureOfProgram & (field[1] == figureOfPlayer | field[5] == figureOfPlayer | field[7] == figureOfPlayer)) { //проверка первый ход 1, 5 или 7
                                if (field[6] == figureOfProgram) {
                                    if (playerDecidesWhereToGo == 2 & isFieldEmpty[8]) {
                                        field[8] = figureOfProgram;
                                        isFieldEmpty[8] = false;
                                        break;
                                    } else if (playerDecidesWhereToGo == 8) {
                                        field[2] = figureOfProgram;
                                        isFieldEmpty[2] = false;
                                        break;
                                    } else if (isFieldEmpty[2] | isFieldEmpty[8]) {
                                        field[2] = figureOfProgram;
                                        isFieldEmpty[2] = false;
                                        break;
                                    }
                                } else if (field[2] == figureOfProgram) { // проверка 3 первый ход
                                    if (playerDecidesWhereToGo == 6 & isFieldEmpty[8]) {
                                        field[8] = figureOfProgram;
                                        isFieldEmpty[8] = false;
                                        break;
                                    } else if (playerDecidesWhereToGo == 8) {
                                        field[6] = figureOfProgram;
                                        isFieldEmpty[6] = false;
                                        break;
                                    } else if (isFieldEmpty[6] | isFieldEmpty[8]) {
                                        field[8] = figureOfProgram;
                                        isFieldEmpty[8] = false;
                                        break;
                                    }
                                }
                            } else if (field[2] == figureOfPlayer & isFieldEmpty[4]) { // проверка 2 первый ход
                                if (playerDecidesWhereToGo == 4 & isFieldEmpty[7]) {
                                    field[7] = figureOfProgram;
                                    isFieldEmpty[7] = false;
                                    break;
                                } else if (playerDecidesWhereToGo == 7) {
                                    field[4] = figureOfProgram;
                                    isFieldEmpty[4] = false;
                                    break;
                                } else {
                                    field[4] = figureOfProgram;
                                    isFieldEmpty[4] = false;
                                    break;
                                }
                            } else if (field[8] == figureOfPlayer) { // проверка 8 первый ход
                                if (playerDecidesWhereToGo == 1 & isFieldEmpty[4]) {
                                    field[4] = figureOfProgram;
                                    isFieldEmpty[4] = false;
                                    break;
                                } else if (playerDecidesWhereToGo == 4 & isFieldEmpty[1]) {
                                    field[1] = figureOfProgram;
                                    isFieldEmpty[1] = false;
                                    break;
                                } else if (isFieldEmpty[1] | isFieldEmpty[4]) {
                                    field[1] = figureOfProgram;
                                    isFieldEmpty[1] = false;
                                    break;
                                }
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

    boolean IfTie() {
        if (!ifProgramWin & !ifYouWin & allFieldsAreFilled) {
            System.out.println("Well, that's a tie!");
            ifTie = true;
        } else ifTie = false;
        return ifTie;
    }

    boolean CheckIfGameEnds() {
        if (IfProgWin()) ifGameEnds = true;
        else if (IfPlayerWin()) ifGameEnds = true;
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