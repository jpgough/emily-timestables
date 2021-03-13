package com.emily.timestables;

import java.util.Scanner;

public class TimestablesConsole {

    private boolean finished = false;

    public void startConsole() {
        Scanner scanner = new Scanner(System.in);

        String userName = readUserName(scanner);

        while(!finished) {
            System.out.println("Choose a Times Table to play: ");
            String timestable = scanner.nextLine();

            try {
                Integer table = Integer.valueOf(timestable);
                if(table >= 2 && table <= 12) {
                    startGame(table, scanner, userName);
                } else {
                    System.err.println("You must choose a times table between 2 and 12");
                }
            } catch(NumberFormatException ex) {
                System.out.println("You must enter a number");
            }
        }
    }

    private void startGame(Integer table, Scanner scanner, String userName) {
        int score =0;
        for(int i=1; i < 13; i++) {
            System.out.print(i + " x " + table + " = ");
            int answer = scanner.nextInt();
            if(answer == i*table) {
                System.out.println("Correct");
                score = score + 1;
            } else {
                System.out.println("Incorrect, the answer was: " + i*table);
            }
        }
        System.out.println(userName + " your score was " + score + "/12");
    }

    private String readUserName(Scanner scanner) {
        System.out.println("***********************************");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + " to Emily's Times Table Challenge");
        return name;
    }
}
