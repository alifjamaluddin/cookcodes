package dicgen;
import java.util.*;
import java.io.File;

/**
 *
 * @author Alif Jamaluddin
 */

public class DicGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
char[] letter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};

int number = 21;
int[] c = new int[21];//use to store letter' number 
String[] word = new String [number];
 java.io.File file = new java.io.File("radius.txt");
     if (file.exists()){
         System.out.println("file already exists!");
         System.exit(0);
     }
      // write to file
   java.io.PrintWriter outfile = new java.io.PrintWriter(file);
 
//for(int x = 0; x<number; x++){
for(int x = 0; x<36;)
    for(c[20] = 0; c[20]<36;c[20]++)
    for(c[19] = 0; c[19]<36;c[19]++)
    for(c[18] = 0; c[18]<36;c[18]++)
    for(c[17] = 0; c[17]<36;c[17]++)
    for(c[16] = 0; c[16]<36;c[16]++)
    for(c[15] = 0; c[15]<36;c[15]++)
    for(c[14] = 0; c[14]<36;c[14]++)
    for(c[13] = 0; c[13]<36;c[13]++)
    for(c[12] = 0; c[12]<36;c[12]++)
    for(c[11] = 0; c[11]<36;c[11]++)
    for(c[10] = 0; c[10]<36;c[10]++)
    for(c[9] = 0; c[9]<36;c[9]++)
    for(c[8] = 0; c[8]<36;c[8]++)
    for(c[7] = 0; c[7]<36;c[7]++)
    for(c[6] = 0; c[6]<36;c[6]++)
    for(c[5] = 0; c[5]<36;c[5]++)
    for(c[4] = 0; c[4]<36;c[4]++)
    for(c[3] = 0; c[3]<36;c[3]++)
    for(c[2] = 0; c[2]<36;c[2]++)
    for(c[1] = 0; c[1]<36;c[1]++)
    for(c[0] = 0; c[0]<36;c[0]++){
        
        word[0] = "" + letter[c[0]];
        word[1] = "" + letter[c[1]] + letter[c[0]];
        word[2] = "" + letter[c[2]] + letter[c[1]]+ letter[c[0]];
        word[3] = "" + letter[c[3]] + letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[4] = "" + letter[c[4]] + letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[5] = "" + letter[c[5]] + letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[6] = "" + letter[c[6]] + letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[7] = "" + letter[c[7]] + letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[8] = "" + letter[c[8]] + letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[9] = "" + letter[c[9]] + letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[10] = "" + letter[c[10]] + letter[c[9]]+ letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[11] = "" + letter[c[11]] + letter[c[10]]+ letter[c[9]]+ letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[12] = "" + letter[c[12]] + letter[c[11]]+ letter[c[10]]+ letter[c[9]]+ letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[13] = "" + letter[c[13]] + letter[c[12]]+ letter[c[11]]+ letter[c[10]]+ letter[c[9]]+ letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[14] = "" + letter[c[14]] + letter[c[13]]+ letter[c[12]]+ letter[c[11]]+ letter[c[10]]+ letter[c[9]]+ letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[15] = "" + letter[c[15]] + letter[c[14]]+ letter[c[13]]+ letter[c[12]]+ letter[c[11]]+ letter[c[10]]+ letter[c[9]]+ letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[16] = "" + letter[c[16]] + letter[c[15]]+ letter[c[14]]+ letter[c[13]]+ letter[c[12]]+ letter[c[11]]+ letter[c[10]]+ letter[c[9]]+ letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[17] = "" + letter[c[17]] + letter[c[16]]+ letter[c[15]]+ letter[c[14]]+ letter[c[13]]+ letter[c[12]]+ letter[c[11]]+ letter[c[10]]+ letter[c[9]]+ letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[18] = "" + letter[c[18]] + letter[c[17]]+ letter[c[16]]+ letter[c[15]]+ letter[c[14]]+ letter[c[13]]+ letter[c[12]]+ letter[c[11]]+ letter[c[10]]+ letter[c[9]]+ letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[19] = "" + letter[c[19]] + letter[c[18]]+ letter[c[17]]+ letter[c[16]]+ letter[c[15]]+ letter[c[14]]+ letter[c[13]]+ letter[c[12]]+ letter[c[11]]+ letter[c[10]]+ letter[c[9]]+ letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        word[20] = "" + letter[c[20]] + letter[c[19]]+ letter[c[18]]+ letter[c[17]]+ letter[c[16]]+ letter[c[15]]+ letter[c[14]]+ letter[c[13]]+ letter[c[12]]+ letter[c[11]]+ letter[c[10]]+ letter[c[9]]+ letter[c[8]]+ letter[c[7]]+ letter[c[6]]+ letter[c[5]]+ letter[c[4]]+ letter[c[3]]+ letter[c[2]]+ letter[c[1]]+ letter[c[0]];
        
        if(x==0&&c[0]==35){x++;}
        else if(x==1&&c[1]==35)x++;
        if(x==2&&c[0]==35&&c[1]==35&&c[2]==35)x++;
        if(x==3&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35)x++;
        if(x==4&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35)x++;
        if(x==5&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35)x++;
        if(x==6&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35)x++;
        if(x==7&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35)x++;
        if(x==8&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35)x++;
        if(x==9&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35)x++;
        if(x==10&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35&&c[10]==35)x++;
        if(x==11&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35&&c[10]==35&&c[11]==35)x++;
        if(x==12&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35&&c[10]==35&&c[11]==35&&c[12]==35)x++;
        if(x==13&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35&&c[10]==35&&c[11]==35&&c[12]==35&&c[13]==35)x++;
        if(x==14&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35&&c[10]==35&&c[11]==35&&c[12]==35&&c[13]==35&&c[14]==35)x++;
        if(x==15&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35&&c[10]==35&&c[11]==35&&c[12]==35&&c[13]==35&&c[14]==35&&c[15]==35)x++;
        if(x==16&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35&&c[10]==35&&c[11]==35&&c[12]==35&&c[13]==35&&c[14]==35&&c[15]==35&&c[16]==35)x++;
        if(x==17&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35&&c[10]==35&&c[11]==35&&c[12]==35&&c[13]==35&&c[14]==35&&c[15]==35&&c[16]==35&&c[17]==35)x++;
        if(x==18&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35&&c[10]==35&&c[11]==35&&c[12]==35&&c[13]==35&&c[14]==35&&c[15]==35&&c[16]==35&&c[17]==35&&c[18]==35)x++;
        if(x==19&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35&&c[10]==35&&c[11]==35&&c[12]==35&&c[13]==35&&c[14]==35&&c[15]==35&&c[16]==35&&c[17]==35&&c[18]==35&&c[19]==35)x++;
        if(x==20&&c[0]==35&&c[1]==35&&c[2]==35&&c[3]==35&&c[4]==35&&c[5]==35&&c[6]==35&&c[7]==35&&c[8]==35&&c[9]==35&&c[10]==35&&c[11]==35&&c[12]==35&&c[13]==35&&c[14]==35&&c[15]==35&&c[16]==35&&c[17]==35&&c[18]==35&&c[19]==35&&c[20]==35)x++;
        
        
        outfile.println(word[x]) ;
        
        }
  outfile.close() ; 
    }


    
}




