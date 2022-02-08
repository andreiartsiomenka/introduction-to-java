package by.basic.unit5_basics_of_oop.task4_dragon_and_treasure;

import by.basic.unit5_basics_of_oop.task4_dragon_and_treasure.entity.Cave;
import by.basic.unit5_basics_of_oop.task4_dragon_and_treasure.entity.ConsoleMenu;

public class DragonAndTreasureMain {
	public static Cave snakeGorynychcave = new Cave("Snake Gorynych");

    public static void main(String[] args) {
        ConsoleMenu consoleMenu = new ConsoleMenu();
        snakeGorynychcave.setNumberOfTreasure(100);
        consoleMenu.startConsoleMenu();
    }
}
