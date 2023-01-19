public class ThreeArrayRange {
    public static void main(String[] args) {
        int[] a = {2, 2, 2};
        
        int ac = Math.abs(a[0] - a[2]);
        int ab = Math.abs(a[0] - a[1]);
        int bc = Math.abs(a[1] - a[2]);

        if (ac > ab && ac > bc) {
            System.out.println(ac);
        } else if (ab > ac && ab > bc) {
            System.out.println(ab);
        } else if (bc > ab && bc > ac) {
            System.out.println(bc);
        } else {
            System.out.println(0);
        }
    }
}
