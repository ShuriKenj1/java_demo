package HW.Fourth;

public class TicTacToeDemo {
    public static void main(String[] args) {

        TicTacToe proba = new TicTacToe();

        System.out.println("Welcome to the TicTacToe Game!\n");

        proba.Rules();
        proba.choiceOfFigure();

        do {
           proba.Game();
        } while (!proba.ifProgramWin || !proba.ifYouWin);

    }
}
