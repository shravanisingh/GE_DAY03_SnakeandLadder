import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game!");
        System.out.println("Single Player at Start Position 0");
        int dieRolled = (int) (Math.random() * 6 + 1);
        System.out.println("Player 1 rolled the die and got: " + dieRolled);
        System.out.println("Dice rolls by: " + dieRolled);
        Scanner sc = new Scanner(System.in);
        int Option = (int) (Math.random() * 2 + 1);
        int position = 0;
        switch(Option)
        {
            case 1:
                System.out.println("NO PLAY: " + position);
                System.out.println("Player stays at the same position");
                break;
            case 2:
                System.out.println("LADDER: " + (dieRolled + position));
                System.out.println("Player moves ahead by: " + dieRolled);
                break;
            case 3:
                System.out.println("SNAKE: " + (dieRolled + position));
                System.out.println("Player moves behind by: " + dieRolled);
        }
    }
}