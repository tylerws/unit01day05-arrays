import java.util.Arrays;

// TODO: finish this
public class ImmutableSort {
    public static void main(String[] args) {
        int[] a = {4, 0, 3};
        int[] b;
        
        
        if (a[0] <= a[1] && a[1] <= a[2]) {
            b = new int[] {a[0], a[1], a[2]};
        } else if (a[1] <= a[0] && a[0] <= a[2]) {
            b = new int[] {a[1], a[0], a[2]};
        } else if (a[2] <= a[1] && a[1] <= a[0]) {
            b = new int[] {a[2], a[1], a[0]};
        } else if (a[2] <= a[0] && a[0] <= a[1]) {
            b = new int[] {a[2], a[0], a[1]};
        } else if (a[1] <= a[2] && a[2] <= a[0]) {
            b = new int[] {a[1], a[2], a[0]};
        } else {
            b = new int[] {a[0], a[2], a[1]};
        } 

        System.out.println(Arrays.toString(b));
}
}