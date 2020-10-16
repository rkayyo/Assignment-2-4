import java.util.Scanner;

class Triangle{
    public static void Main (String[] args){
        Scanner s = new Scanner (System.in);
        System.out.print("What would you like your triangle to be made of?");
        String character = s.next();
        System.out.print("How tall would you like your triangle?");
        int triangleHeight = s.nextInt();

        
           for (int i = 1; i <= triangleHeight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println("");
        }
        
        
        
    }
    
}