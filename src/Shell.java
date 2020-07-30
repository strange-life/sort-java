import edu.princeton.cs.algs4.StdRandom;

public class Shell<T extends Comparable<T>> extends Sort<T> {
    public void sort(T[] a) {
        int h = 1;
        while (h < a.length / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                T temp = a[i];

                int j = i;
                while (j >= h && less(temp, a[j - h])) {
                    a[j] = a[j - h];
                    j -= h;
                }

                a[j] = temp;
            }

            h /= 3;
        }
    }

    public static void main(String[] args) {
        Shell<Double> shell = new Shell<>();
        Double[] a = new Double[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform();
        }

        shell.sort(a);
        assert shell.isSorted(a);
        shell.show(a);
    }
}
