import java.util.Scanner;

class Bar{
public static void Main (String args[]){
   Scanner s = new Scanner(System.in);
    System.out.print("Which character would you like your bar to be made of?");
    String character = s.next();
    System.out.print("How long would you like your bar?");
    int barLength = s.nextInt();
    
    for(int i = 0; i < barLength; i++){
        System.out.print(character);
        
    }
  }
}