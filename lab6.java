public class lab6 {
    //senario 0
    //a: 6 ; b:4 ; c:5 ; d:15 ; e:16 ; f:error

        public static void main(String[] args) {
            int[] arr = { 4,8,15,16,23,42 };
            System.out.println("a:" +arr.length);
            System.out.println("b:" +arr[0]);
            System.out.println("c:" + (arr.length - 1) );
            System.out.println("d:" +arr[2]);
            System.out.println("e:" +arr[3]);
            System.out.println("f:" +arr[10]);
            //f error: ArrayIndexOutOfBoundsException
        }

}
