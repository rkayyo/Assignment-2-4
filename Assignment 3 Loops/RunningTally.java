import java.util.Scanner;

class RunningTally{
 public static void Main (String[] args){
     Scanner s = new Scanner (System.in);
     int num = 0;
     int runningTally = 0; 
     int lastNum = 0;
     
     System.out.println("Lets Add Some Numbers :D [Type a Negative Number to Quit]");
     
     
     while(num >= 0){
     System.out.print("Add: ");
     num = s.nextInt();
     lastNum = num;
     runningTally += num;
    }
    runningTally -= lastNum;
    System.out.println("Your total is " + runningTally);
 }
}