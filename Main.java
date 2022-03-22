public class Main {
    public static void main (String[] args){
        char lowerLetter, upperLetter, randomChar;
        int digit, primeNum;

        // Set constant to repeat 15 times
        final int REPEAT = 15;

        RandomCharacter rdm = new RandomCharacter();

        // Print 15 lowercase letters
        System.out.print("Random Lowercase Letter: ");
        for (int i = 0; i < REPEAT; i++){
            lowerLetter = rdm.getRandomLowerCaseLetter();
            System.out.print(lowerLetter + " ");
        }

        // Print 15 uppercase letters
        System.out.print("\nRandom Uppercase Letter: ");
        for (int i = 0; i < REPEAT; i++){
            upperLetter = rdm.getRandomUpperCaseLetter();
            System.out.print(upperLetter + " ");
        }

        // Print 15 digits between 0 and 9
        System.out.print("\nRandom Digit Number (0-9): ");
        for (int i = 0; i < REPEAT; i++){
            digit = rdm.getRandomDigitCharacter();
            System.out.print(digit + " ");
        }

        // Print 15 random characters
        System.out.print("\nRandom Character: ");
        for (int i = 0; i < REPEAT; i++){
            randomChar = rdm.getRandomCharacter();
            System.out.print(randomChar + " ");
        }

        // Print 15 prime numbers
        System.out.print("\nRandom Prime Number: ");
        for (int i = 0; i < REPEAT; i++){
            primeNum = rdm.getRandomPrimeNumbers();
            System.out.print(primeNum + " ");
        }
    }
}
