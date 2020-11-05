package data_structer;

import java.util.Arrays;

public class FunctinMethod {
    public static void main(String [] arge){
      int  x[] = {9, 44, 66, 2, 99, 10, -31, 65, -20, -39};
        IbrahimMethod(x);
    }

    public static void IbrahimMethod(int [] x){
        System.out.println(Arrays.toString(x));
        for(int i : x){
            if(i%2 !=0 && i <0){
                System.out.println(i+" ");
            }
        }
    }
}
