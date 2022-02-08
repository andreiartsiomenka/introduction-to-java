package by.basic.unit5_basics_of_oop.task4_dragon_and_treasure.entity;

import by.basic.unit5_basics_of_oop.task4_dragon_and_treasure.actoon.ConsoleMenuAction;

public class ConsoleMenu {
	private ConsoleMenuAction consoleMenuAction = new ConsoleMenuAction();

    public void startConsoleMenu(){
        int choice;
        boolean isStopped = false;
        consoleMenuAction.printOptions();
        while (!isStopped) {
            System.out.println("Please enter the number of the operation. \nYour choice: ");
            choice = consoleMenuAction.makeChoice();
            isStopped = consoleMenuAction.processingOperation(choice);
        }
    }
}
