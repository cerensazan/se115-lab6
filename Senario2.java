import java.util.Random;

public class Senario2 {
    public static int [] rotate(int [] arr){
        int [] rotate = new int [arr.length];
        rotate[0]= arr [arr.length -1];

        for(int i = 0 ;i< arr.length -1 ; i++){
            rotate[i+1]=arr[i];

        }
        return rotate;
    }
    public static void main(String[] args){
        Random randomGenerator= new Random();
        int capacity = randomGenerator.nextInt(11) +10;
        int [] array = new int[capacity];
        for(int i = 0; i< capacity; i++){
            array[i]= randomGenerator.nextInt(100);
        }
        for (int i = 0 ; i<array.length; i++){
            System.out.print(" Original: "+ array[i]);
        }
        System.out.println();
        int [] rotate = rotate(array);
        for (int i = 0; i< rotate.length; i++){
            System.out.print(" Rotate: " + rotate[i]);
        }

    }
}
