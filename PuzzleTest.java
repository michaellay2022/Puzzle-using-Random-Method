import java.util.Random;
import java.util.ArrayList;

public class PuzzleTest {
    public static void main(String[] args) {

        Puzzle generator = new Puzzle();

        // Get ten rolls
        ArrayList<Integer> randomRolls = generator.getTenRolls();

        System.out.println("=====Testing for getTenRolls=======");
        System.out.println(randomRolls);

        System.out.println("=====Testing for getRandomLetter with Array=======");
        System.out.println(generator.getRandomLetterWithArray());

        System.out.println("=====Testing for getRandomLetter=======");
        System.out.println(generator.getRandomLetter());

        System.out.println("=====Testing for generatePassword=======");
        System.out.println(generator.generatePassword());

        System.out.println("=====Testing for getNewPasswordSet=======");
        System.out.println(generator.getNewPasswordSet(7));
        System.out.println("==========The End=============");
    }

}
