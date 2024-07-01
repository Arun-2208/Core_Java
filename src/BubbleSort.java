import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[] array=new int[5];
        System.out.println("enter an array of numbers");

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            System.out.println();
        }

    for(int j=0;j<array.length-1;j++) {
        for (int i = 0; i < array.length - 1-j; i++) {

            int temp;
            if (array[i + 1] > array[i]) {

                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

            }
        }
    }
        for (int n:array)
            System.out.print(n+" ");


    }
}