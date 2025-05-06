package Arrays;

import java.util.Arrays;

public class ShiftOnesToLeft {

    public static void main(String[] args) {

        int [] arr = {1,2,3,2,4,1,1,2,1,3,1};

        int left = 0;
        int right = arr.length -1;
        while(left<right) {
            if (arr[left] ==1)  {
                left ++;
            }
            else if (arr[right] ==1) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right --;
            } else {
                right--;
            }
        }

        System.out.println("THE Re-arranged array with all 1s to the left: " + Arrays.toString(arr));
    }
}
