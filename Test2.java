import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","Elements in array: ","");
        for(int item: array ){
            System.out.print(item + "\t");
        }
        int max = array[0];
        int index = 1;
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
            if (array[j] > max) {
                max = array[j];
                index++;

            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
        System.out.println("the sum of the array is " + sum);
    }
}
