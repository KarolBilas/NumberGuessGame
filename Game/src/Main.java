import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double random =  Math.random()*100+1;
        int target = (int) random;
        int tries = 10;
        boolean victory = false;


        while(tries != 0) {
            System.out.println("Try a number between 1-100, you have " + tries + " more chances");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if(input > target){
                System.out.println("Your number is higher");
            } else if(input < target){
                System.out.println("Your number is lower");
            } else if(input == target){
                 victory = true;
                 break;
            } else {
                victory = false;
            }


            tries--;
        }
        if(victory) {
            System.out.println("You have won! The number was " + target);
        } else {
            System.out.println("You lose! The number was " + target);
        }


    }
}