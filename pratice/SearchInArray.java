package pratice;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {4, 56, 4, 6, 9, 33, 73, 4, 6, 7,};
        int target = 4;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
                break;
            }

        }
        if (flag == true) {
            if (flag == true) System.out.println("Target existe in array");
            else System.out.println("Target missing in array");



        }
    }
}

