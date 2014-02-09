	
package Toto;
import java.util.*;
public class ShestOt42 {
    public static void masivRandom(){
        System.out.println("Числата на 6 от 42 са: ");
        Random r=new Random();
        int rnd;
        int[] masiv = {7, 23, 25, 20, 19, 36, 38, 24, 31, 12, 40, 21, 4, 1, 18, 34, 11, 17, 26, 30, 35, 2, 3, 42, 5};
        int[] newMasiv = new int[6];

       for(int i=0; i<6; i++){ 
           rnd = masiv[r.nextInt(masiv.length)]; 
           int j=i+1;
           
           do{  
               j--;
               if (newMasiv[j]==rnd){
                   rnd = masiv[r.nextInt(masiv.length)];
                  j=i+1;
               }
           }while (j>0);
           
               newMasiv[i]=rnd; 
       }
       
       System.out.println(Arrays.toString(newMasiv));
       
       for(int i=0; i<6; i++){ 
           rnd = masiv[r.nextInt(masiv.length)]; 
           int j=i+1;
           
           do{  
               j--;
               if (newMasiv[j]==rnd){
                   rnd = masiv[r.nextInt(masiv.length)];
                  j=i+1;
               }
           }while (j>0);
           
               newMasiv[i]=rnd; 
       }
       
       System.out.println(Arrays.toString(newMasiv));
       for(int i=0; i<6; i++){ 
           rnd = masiv[r.nextInt(masiv.length)]; 
           int j=i+1;
           
           do{  
               j--;
               if (newMasiv[j]==rnd){
                   rnd = masiv[r.nextInt(masiv.length)];
                  j=i+1;
               }
           }while (j>0);
           
               newMasiv[i]=rnd; 
       }
       
       System.out.println(Arrays.toString(newMasiv));
       for(int i=0; i<6; i++){ 
           rnd = masiv[r.nextInt(masiv.length)]; 
           int j=i+1;
           
           do{  
               j--;
               if (newMasiv[j]==rnd){
                   rnd = masiv[r.nextInt(masiv.length)];
                  j=i+1;
               }
           }while (j>0);
           
               newMasiv[i]=rnd; 
       }
       
       System.out.println(Arrays.toString(newMasiv));
       
    }
}

	