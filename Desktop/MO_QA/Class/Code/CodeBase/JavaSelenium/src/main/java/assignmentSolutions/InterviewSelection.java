package assignmentSolutions;

import java.util.Scanner;

public class InterviewSelection 
{
    public static void main(String[] args) 
    {
       
        int age = 22;
        
        char degree='N';
        
        double percentage=71;
        
        char offerStatus='N';

        if (age < 21) 
        {
            System.out.println("Sorry, minimum age to apply is 21.");
        } 
        else 
        {
            if (degree=='B') {
               
                if (percentage > 70) {
                    
                  
                    if (offerStatus=='Y') 
                    {
                        System.out.println("You are on hold. We have received your offer.");
                        
                    } else 
                    {
                        System.out.println("Congratulations! You are selected for an interview.");
                    }
                    
                } 
                else 
                {
                    System.out.println("Sorry, your percentage is below 70%. Application rejected.");
                }
            } else 
            {
                System.out.println("Sorry, we only accept BTech graduates.");
            }
        }

       
    }
}
