
package caechip;
import java.util.*;

/**
 *
 * @author Alif Jamaluddin
 */
public class Caechip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      //  System.out.println("Question");
      //  String text = input.nextLine();//Input for question text
    
        String text = "geiwevglmtiv";
        
     char[] textchar = new char [text.length()];//create array to store converted question text char from String 
    // char[] newtextchar = new char [text.length()];//create array to store converted question text char to encrypted char
      char[] guesschar = new char [text.length()];//create array to store converted guess text char from String 
     char[] newguesschar = new char [text.length()];//create array to store converted guest text char to encrypted char
    System.out.println("Your answer");
    String guessans = input.nextLine(); //input guess word
    
        if(guessans.length()!=text.length()){//check the length of input with the question test, if wrong, exit automatically 
            System.out.println("Wrong");
        System.exit(0);
        }
        
        for(int i=0; i<guessans.length();i++){//check the type of input with the question test, only word, no numbers, if wrong, exit automatically 
        char a = guessans.charAt(i);
            if(a == 'a' ^ a == 'b' ^ a == 'c' ^ a == 'd' ^ a == 'e' ^ a == 'f'^ a == 'g'^ a == 'h'^ a == 'i'^ a == 'j'^ a == 'k'^ a == 'l'^ a == 'm'^ a == 'n'^ a == 'o' ^ a == 'p'^ a == 'q'^ a == 'r'^ a == 's'^ a == 't'^ a == 'u'^ a == 'v'^ a == 'w'^ a == 'x'^ a == 'y'^ a == 'z' ){
            continue;}
            else {
                System.out.println("Wrong");
                System.exit(0);
                        }
        }
            
        
  
    for(int x=0; x<text.length(); x++){
   
    textchar[x] = text.charAt(x);//convert question text string to char
    //newtextchar[x] = converter(textchar, x);//encrypt question text 
    
    guesschar[x] = guessans.charAt(x);//convert guess text string to char
    newguesschar[x] = converter(guesschar, x);//encrypt guess text 
    //System.out.print(newtextchar[x]);
    System.out.print(newguesschar[x]);
    
    }
  
    
    
    //compare(newtextchar, newguesschar, text.length());
    compare(textchar, newguesschar, text.length());//compare question text and guess text
   
    
    }
    
    public static  char converter(char[] a, int x){//encryption key
    
        int b = x;
        switch(a[b]){
        case 'a' : a[b] = 'e'; break;
            case 'b' :a[b] = 'f'; break;
                case 'c' : a[b] = 'g'; break;
                    case 'd' : a[b] = 'h'; break;
                        case 'e' : a[b] = 'i'; break;
                            case 'f' : a[b] = 'j'; break;
                                case 'g' : a[b] = 'k'; break;
                                    case 'h' : a[b] = 'l'; break;
case 'i' : a[b] = 'm'; break;
    case 'j' : a[b] = 'n'; break;
        case 'k' : a[b] = 'o'; break;
            case 'l' : a[b] = 'p'; break;
                case 'm' : a[b] = 'q'; break;
                    case 'n' : a[b] = 'r'; break;
                        case 'o' : a[b] = 's'; break;
                            case 'p' : a[b] = 't'; break;
                                case 'q' : a[b] = 'u'; break;
                                    case 'r' : a[b] = 'v'; break;
case 's' : a[b] = 'w'; break;
    case 't' : a[b] = 'x'; break;
        case 'u' : a[b] = 'y'; break;
            case 'v' : a[b] = 'z'; break;
                case 'w' : a[b] = 'a'; break;
                    case 'x' : a[b] = 'b'; break;
                        case 'y' : a[b] = 'c'; break;
                            case 'z' : a[b] = 'd'; break;
                            default: System.out.println("error occured");break;
    }
        return a[b]; 
    }
    
    public static void compare(char[] a, char[] b, int c){
    
        
        for(int i=0; i<c;){
        if(a[i] == b[i]){
        i++;
        }
            else{
            System.out.println("\nWrong");
            System.exit(0);
            }
       }
        
            System.out.println("\nWelldone!");
            }
    }

