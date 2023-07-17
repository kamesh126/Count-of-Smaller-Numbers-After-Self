import java.util.ArrayList;
import java.util.Scanner;

class Small{
    public ArrayList<Integer> countSmallest(int[] arr) {

        ArrayList<Integer> ara = null;
        ara = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i] < 0) {
                ara.add(0);
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        count++;
                    }
                }
                ara.add(count);
            }
        }
        return ara;
    }
}
public class SmallerNumberAfter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Small Solution = new Small();
        System.out.println((Solution.countSmallest(arr)));
    }
}