
package Toto;
import java.util.*;
public class ShestOt49 {
    public static void masivRandom(){
        System.out.println("Числата на 6 от 49 са: ");
        Random r=new Random();
        int rnd;
        int[] masiv = {4, 44, 21, 25, 20, 49, 28, 1, 6, 17, 24, 48, 11, 34, 22, 37, 9, 30, 5, 12, 29, 8, 47, 45, 46};
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

	