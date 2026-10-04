package JavaArrayAssignments;

/*
    Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method for calculating the minimum element.
    Output:
    -4
*/
public class Question4 {
    public static void main(String[] args) {
        int[] arr = { 2, -3, 5, 8, 1, 0, -4 };

        int min = Integer.MAX_VALUE;
        // Finding the minimum element using standard method of math class.
        for (int i : arr) {
            min = Math.min(i, min);
        }

        System.out.println("Minimum element of the array is : " + min);
    }
}
