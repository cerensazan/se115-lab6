import java.util.Random;

public class Senario3 {
    public static void main(String[] args){
        Random randomGenerator= new Random();
        int days=1000000;

        String[] weathertypes= {"Sunny","Cloudy","Rainy","Stormy"};
        int[] situations= new int [4];

        for(int i = 0; i<days; i++){
            int n= randomGenerator.nextInt(100);

            if(n<40) situations[0]++;
            else if (n<70) situations[1]++;
            else if(n<90) situations[2]++;
            else situations[3]++;
        }
        for(int i=0; i< weathertypes.length;i++){
            double value=situations[i] *100/days;
            System.out.printf("%s: %d days %.2f%% %n", weathertypes[i],situations[i],value);
        }


    }
}
