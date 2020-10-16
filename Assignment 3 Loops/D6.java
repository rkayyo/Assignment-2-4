import java.util.Scanner;

class D6{
 
    
 public static void Main (String[] args){
     
     Scanner s = new Scanner(System.in);
     int roll = 0;
     int total = 0;
     int prevRoll = 0;
     String repeat = "y";

     while(repeat.equals("y")){
     System.out.println("How many D6's would you like to roll");
     int rollNum = s.nextInt();
     System.out.println("you rolled: " );
     for(int i = 0; i < rollNum; i++){   
     roll = (int) (Math.random()*6) + 1;
     prevRoll = roll;
     total += roll;
     System.out.println(roll);
     
    }
    System.out.println("Total: "+ total);
    
    
    System.out.println("Would you like to roll again  [y,n] ");
     repeat = s.next();
     total = 0;
    }
     
    System.out.print("Bye");
    
     
     
    }
    
    
    
}