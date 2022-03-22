public class Main {
    public static void main (String[] args){
        char lowerLetter, upperLetter, randomChar;
        int digit, primeNum;

        final int REPEAT = 15;

        RandomCharacter rdm = new RandomCharacter();

        System.out.print("Random Lowercase Letter: ");
        for (int i = 0; i < REPEAT; i++){
            lowerLetter = rdm.getRandomLowerCaseLetter();
            System.out.print(lowerLetter + " ");
        }

        System.out.print("\nRandom Uppercase Letter: ");
        for (int i = 0; i < REPEAT; i++){
            upperLetter = rdm.getRandomUpperCaseLetter();
            System.out.print(upperLetter + " ");
        }

        System.out.print("\nRandom Digit Number (0-9): ");
        for (int i = 0; i < REPEAT; i++){
            digit = rdm.getRandomDigitCharacter();
            System.out.print(digit + " ");
        }
        
        System.out.print("\nRandom Character: ");
        for (int i = 0; i < REPEAT; i++){
            randomChar = rdm.getRandomCharacter();
            System.out.print(randomChar + " ");
        }

        System.out.print("\nRandom Prime Number: ");
        for (int i = 0; i < REPEAT; i++){
            primeNum = rdm.getRandomPrimeNumbers();
            System.out.print(primeNum + " ");
        }
    }
}
