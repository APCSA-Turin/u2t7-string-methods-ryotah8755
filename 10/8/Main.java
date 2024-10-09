import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.print("Enter First String:");
        String previous = scan.nextLine();

        while(score < 50){
            System.out.print("Enter next String:");
            String next = scan.nextLine();
            int last = previous.length();
            if(next.substring(0,2).compareTo(previous.substring(last-2,last)) == 0){
                score +=5;
                System.out.println("last two letters of the previous word match the first two letters of the current word");
                System.out.println("score is " + score);
            }
            if(next.compareTo(previous) > 0){
                score += 2;
                System.out.println("current word is alphabetically after the previous word");
                System.out.println("score is " + score);
            }
            
            if(next.compareTo(previous) < 0 ){
                score -= 5;
                System.out.println("current word is alphabetically before the previous word");
                System.out.println("score is " + score);
            }
            
            if(next.compareTo(previous) == 0 ){
                score -= 10;
                System.out.println("current word is the exact same word as the previous word");
                System.out.println("score is " + score);
                
            }
            
            String firstLetter = previous.substring(0,1);
                if (next.contains(firstLetter)) {
                    score += 3;
                    System.out.println("first letter of the previous word is found somewhere in the current word");
                    System.out.println("score is " + score);
            
            }

            if(previous.length() == next.length()){
                score += 2;
                System.out.println("the first word and next word is the same length");
                System.out.println("score is " + score);
            }

            previous = next;
        }
        System.out.println("You win!");
        scan.close();
    }        
}