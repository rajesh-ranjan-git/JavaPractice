import java.util.Scanner;

class Problem43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diceOutcome;
        
        System.out.print("Please roll your dice.");
        String input = sc.nextLine(); 

        do {       
            int randomInt = (int) (Math.random() * 10);
            if (randomInt > 6) {
                diceOutcome = randomInt - 6;
            } else if (randomInt == 0) {
                diceOutcome = randomInt + 1;
            } else {
                diceOutcome = randomInt;
            }

            System.out.println();
            System.out.println("Dice outcome : " + diceOutcome);
            System.out.println();
            System.out.print("Want another chance? Y/N : ");

            input = sc.nextLine();

            try {
                if (input.charAt(0) == 'n' || input.charAt(0) == 'N') {
                    System.out.println("Thank you for playing.");
                    break;
                }
            } catch (StringIndexOutOfBoundsException e) {
            }
        } while (true);
    }
}