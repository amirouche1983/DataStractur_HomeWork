package homeWork;

public class SmallestAndGreatestNm {
    public static void main(String[] args) {

            int[] num = {987534,-88, -10, 1, 5, 24, 50};
           //int[] num = {5,5};
           //int[] num = {1};
          //int[] num = {};
            if (num.length == 0) {
                System.out.println("the arry is empty");
                return;
            }
            int greatest = num[0];
            int smallest = num[0];
            for (int i = 0; i < num.length; i++) {
                if (num[i] > greatest) {
                    greatest = num[i];}
             if  (num[i] < smallest) {
                        smallest = num[i];
                    }

            }
        System.out.println("the smallest number is: "+ smallest);
        System.out.println("the greatest number is: "+ greatest);
        }
    }

