package delfinen;

import java.util.Scanner;

public class MenuMaker {
    Scanner choice = new Scanner(System.in);
    Menu mainMenu = new Menu("Main Menu:", pointsMainMenu());
    Menu chairmanMenu = new Menu("Chairman Menu:", pointsChairmanMenu());
    Menu coachMenu = new Menu("Coach Menu:", pointsCoachMenu());
    Menu cashierMenu = new Menu("Cashier Menu:", pointsCashierMenu());

    private void chooseFromMainMenu() {
        switch (choice) {
            case 0 -> exitProgram();
            case 1 -> enterChairmanMenu();
            case 2 -> enterCoachMenu();
            case 3 -> enterCashierMenu();
            default -> System.out.println("Invalid choice. Try again.");
        }
    }

    private String[] pointsMainMenu() {
        return new String[]{"1. Chairman menu.", "2. Coach menu.", "3. Cashier menu.", "0. Exit program."}
    }


}
