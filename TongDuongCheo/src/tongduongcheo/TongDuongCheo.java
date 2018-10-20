package tongduongcheo;

import java.util.Scanner;

public class TongDuongCheo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        int sum=0;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter value of array["+i+"]: ");
                array[i][j]=sc.nextInt();
                if(i==j) sum+=array[i][j];
            }
        }
        
        System.out.println("Sum is: "+sum);
    }
    
}
