
/**
 * @author ChrisHardingBrown
 * 
 */
import java.util.*;

public class Statistics {
    private int mean;
    // averarge
    private int mode;
    // number repeated the most
    private int median;
    private final int length;
    private int interger;
    // number in the middle or 2 middle numbers avg
    int [] userNumData = new int[length] ;
    int smaller;
    // n(n+1)/(2) = median
    // [(x to the n) + (x to the (n+1)] /(x to the n) = 
    
    Scanner input = new Scanner(system.in);
   
    input.nextline();
    numberCounter
    
    public Statistics(final int userData){
        length = userData;
        for(int i = 0 ; i< statistics.length; i++){
            system.out.println("Enter your data: ");
            interger= input.nextInt();
            input.nextLine();
        }
         System.out.println("Your number has been entered successfully");
         
                    
            
        }
        
    }
        public void sort (){
            for(int i =0 ; i < statistics.length; i ++){
                smaller = statistics[i];
                for(int j =i ; j < statistics.length; j ++){
                    if (statistics [j] < smaller){
                        smaller = statistics[j];
                    }
                   
                }
                statistics[i]= smaller;
                
            }
    
}
