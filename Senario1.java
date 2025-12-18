import java.util.Scanner;

public class Senario1 {

    public static void main(String[] args){
        int [] oldRoster  = new int[20];

        for(int i=0; i<oldRoster.length;i++ ){
            oldRoster[i]= 1000+ i;
        }
        int[] newRoster = new int[42];

        for(int i=0 ;i<oldRoster.length ; i++){
            newRoster[i]= oldRoster[i];
        }

        for(int i =0 ; i<newRoster.length; i++){
            if(i< oldRoster.length){
                System.out.println("oldRoster[" + i + "] = " + oldRoster[i] + ", newRoster[" + i
                        + "] = " + newRoster[i]);
            }else{
                System.out.println("oldRoster[" + i + "] = ... " + ", newRoster[" + i
                        + "] = " + newRoster[i]);
            }
        }

    }
}
