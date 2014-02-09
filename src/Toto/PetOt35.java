
package Toto;
import java.util.*;
public class PetOt35 {
    public static void masivRandom(){
        System.out.println("Числата на 5 от 35 са: ");
        Random r=new Random();
        int rnd;
        int[] masiv = {32, 16, 20, 9, 24, 13, 27, 7, 33, 17, 29, 28, 35, 8, 3, 18, 12, 30, 1, 22};
        int[] newMasiv = new int[5];

       for(int i=0; i<5; i++){ 
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
       
       for(int i=0; i<5; i++){ 
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
       for(int i=0; i<5; i++){ 
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
       for(int i=0; i<5; i++){ 
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

	