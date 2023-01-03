import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {

    }



    public boolean Equals(ArrayList<Integer> nums1, ArrayList<Integer> nums2, int num) {
        int count = 0;
        for (int elem : nums1) {
            if (elem == num) {
                count++;
            }
        }


        for (int elem : nums1) {
            if (elem == num) {
                count--;
            }
        }
        return count == 0;
    }
}