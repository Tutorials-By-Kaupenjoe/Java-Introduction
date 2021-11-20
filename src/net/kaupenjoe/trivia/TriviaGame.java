package net.kaupenjoe.trivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TriviaGame {
    public List<Trivia> trivias;
    private Scanner scanner = new Scanner(System.in);
    private int score = 0;
    private int maxScore;

    public void startGame() {
        populateTriviaList();
        gameLoop();
    }

    public void gameLoop() {
        while (true) {

            for(Trivia trivia : trivias) {
                trivia.printQuestion();
                if(trivia.validateAnswer(getUserInput())) {
                    score++;
                }

                printScore();
            }

            if(shouldEndGame()) {
                break;
            }
        }

        printScore();
    }

    public boolean shouldEndGame() {
        askForAbort();
        return endGame(getUserInput());
    }

    private String getUserInput() {
        return scanner.nextLine();
    }

    private boolean endGame(String input) {
        return !input.toLowerCase().equals("y");
    }

    private void askForAbort() {
        System.out.println("Do you want to play again? (Y/N)");
    }

    private void printScore() {
        System.out.println("Your Score is " + score);
    }

    private void resetScore() {
        score = 0;
    }

    private void populateTriviaList() {
        trivias = new ArrayList<>();

        trivias.add(new Trivia("How many states does the USA have?", "50"));
        trivias.add(new Trivia("What is the Capital of the United Kingdom?", "London"));
        trivias.add(new Trivia("What is the chemical symbol for Iron?", "Fe"));
        trivias.add(new Trivia("How High is Mount Everest? (Answer in km)", "8848"));

        trivias.add(new Trivia("What is the Answer to Life, the Universe and Everything?", "42"));
        trivias.add(new Trivia("What is the smallest country in the world?", "Vatican City"));
        trivias.add(new Trivia("Who was the first woman to win a Nobel Prize (1903)?", "Marie Curie"));
        trivias.add(new Trivia("What is the most prevalent cause of Power Outages in the US?", "Squirrels"));

        maxScore = trivias.size();
        Collections.shuffle(trivias);
    }
}
