import edu.princeton.cs.algs4.StdRandom;

public class Shell<T extends Comparable<T>> extends Sort<T> {
    public void sort(T[] a) {
        int h = 1;
        while (h < a.length / 3) {
            h = 3 * h + 1;
        }

        for (; h >= 1; h /= 3) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (less(a[j], a[j - h])) {
                        exch(a, j, j - h);
                    }
                }
            }
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
