import java.util.ArrayList;
import java.util.Random;

public class Puzzle {

    // Problem1: ==================================================================
    // getTenRolls
    public ArrayList<Integer> getTenRolls() {

        // create a new ArrayList
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        Random rand = new Random(); // call dependencies infjection - creating instance of this random class
        // generate / return an array w/ 10 rand num between 1 to 20 inclusive
        // get random number and add to ArrayList
        for (int i = 1; i <= 10; i++) {
            myArray.add(rand.nextInt(20) + 1);
        }
        return myArray;
    }
    // Problem2============================================
    // getRandomLetter - write a method that will:

    // Create an array within the method that contains all 26 letters of the
    // alphabet (this array must have 26 values).
    // Generate a random index between 0-25, and use it to pull a random letter out
    // of the array.
    // Return the random letter.

    // Solution 1- Get Random Letter with Array
    public String getRandomLetterWithArray() {
        Random rand = new Random();

        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];// static array that cann't be change in size
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }
        return alphabet[rand.nextInt(26)];
    }

    // Solution 2 without Array
    public String getRandomLetter() {

        Random rand = new Random();
        // String alphabetString = "abcdefghijk334@#&opqrstuvwxyz";
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        char randomChar = alphabetString.charAt(rand.nextInt(26));

        return String.valueOf(randomChar);
    }

    // Problem 3 =============================================
    // generatePassword -
    // write a method that uses the previos method to create a random
    // string of eight characters, and return that string.

    public String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    // Problem 4====================================================
    // getNewPasswordSet
    // write a method that takes an int length as an argument
    // and creates an array of random eight character words.
    // The array should be the length passed in as an int.
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

}