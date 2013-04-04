package gpacalculator;
import java.util.*;
/**
 *
 * @author Alif Jamaluddin
 */
public class GPACalculator {

   
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        text("Assalamualaikum\nThis is GPA Calculator\nHow to use it?\n1.Insert number of subject you take.\n2.Insert the credit hours and your grade\n3.Calculate begin. And your pointer will show up\n");
        
        
        text("\nInsert the number of subjects you take/= \n");
        
        int noS = input.nextInt();//number of subject
        
        int[] subjectCH = new int[noS];
        char[] grade = new char[noS];
        double[] gradePointer = new double[noS];
        for(int i=0; i<noS; i++){
            text("Insert credit hour for " + (i+1) + " subject\n");
            subjectCH[i] = input.nextInt();
            text("Insert grade for " + (i+1) + " subject(A/B/C/D/F)\n");
            grade[i] = input.next().charAt(0);
            
        }
        
        int i=noS;
        do{
            switch(grade[i-1]){
                case 'A' : 
                     case 'a' :gradePointer[i-1] = 4.0;
                            break;
                    case 'B' : 
                        case 'b' :gradePointer[i-1] = 3.0;
                                break;
                        case 'C' : 
                            case 'c' :gradePointer[i-1] = 2.0;
                                    break;
                            case 'D' : 
                                case 'd' :gradePointer[i-1] = 1.0;
                                        break;
                                case 'F' : 
                                    case 'f' :gradePointer[i-1] = 0.0;
                                        break;
                                default : System.out.println("Wrong Grade Input");
            }
        
            i--;
        }while(i>0);
        
        double GPA = 0.0;
        double sumCHGP = 0.0;
        double sumCH = 0.0;
        for(int x=0; x<noS; x++ ){
        sumCHGP = sumCHGP + gradePointer[x]*subjectCH[x];
        sumCH = sumCH + subjectCH[x];
        
        }  
        
        GPA = sumCHGP/sumCH;
        System.out.printf("Your pointer is %2.3f%n", GPA);
        
        
    }
    
    
    
    
    
    public static void text(String a){
    System.out.print(a);
    }
    
   
}
