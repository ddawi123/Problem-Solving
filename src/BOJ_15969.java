import java.util.*;
public class BOJ_15969 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = 0;
        int temp2 = 0;
        int max = 0;
        int min = 1001;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++){
            temp = arr[i];
            if(temp > max){
                max = temp;
            }
            temp2 = arr[i];
            if(temp2 < min){
                min = temp2;
            }
        }
        System.out.println(max - min);
    }
}
