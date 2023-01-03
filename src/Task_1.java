import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {

    }

    public boolean equals(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1 == nums2) {
            return false;
        }

        if (nums1.size() != nums2.size()) {
            return false;
        }

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) != nums2.get(i)) {
                return false;
            }
        }
        return true;
    }
}