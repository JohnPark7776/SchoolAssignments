import java.util.*;

public class test3{

    public static void main(String []args){

        double[] answer = new double[10];

        boolean endLoop = false;
        int counter = 0;
        double grade = 0;

        for (int i = 0; i < 10; i++) {
        
        
            try {
               grade = theLoop();
               if (grade == 102) {
                  endLoop = true;
               }
                answer[i] = grade;

                if (counter == 9) {
                    endLoop = true;
                }
            }
            catch(InputMismatchException e) {
                System.out.println(e);
            }
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(answer[j]);
        }
    }
    

    public static double theLoop() {

        Scanner input = new Scanner(System.in);
        String sInput = "";
        double numInput = 0;
        boolean endLoop = false;

        while (!endLoop) {
            System.out.print("Enter an number: ");
           try {
            sInput = input.nextLine();
            if (sInput.isEmpty()); {
               endLoop = true;
               return 102;
            } else {
            
            numInput = Double.parseDouble(sInput);

            if (numInput >= 0 && numInput <= 100) {
                endLoop = true;
            }

            else if (numInput < 0 || numInput > 100){
                System.out.println("Enter a number between 0 - 100: ");
            }
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Enter a number between 0 - 100: ");
            endLoop = true;
            return 102;
        }

        

    }return numInput;
    
} 
}