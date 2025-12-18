import java.util.Random;

public class Senario4 {
    public static void main(String[] args){
        Random randomGenerator= new Random();
        int []a = new int[30];

        for(int i=0;i<a.length;i++){
            a[i]= randomGenerator.nextInt(100)+1;
            System.out.println(a[i]);
        }

        int count=0;
        int max=0;
        for(int i=1; i<a.length-1;i++){
            if (a[i] > a[i - 1] && a[i]>a[i+1]) {
                count++;
                if (a[i]> max){
                    max=a[i];
                }
            }
        }
        System.out.println("Total peaks: "+ count);
        if (count>0)
            System.out.println("Tallest peak: "+max);
        else System.out.println("No peaks.");

    }

}
