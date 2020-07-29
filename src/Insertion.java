import edu.princeton.cs.algs4.StdRandom;

public class Insertion<T extends Comparable<T>> extends Sort<T> {
    // TODO 用二分查找继续优化
    public void sort(T[] a) {
        int min = 0;
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[min])) {
                min = i;
            }
        }
        exch(a, 0, min);

        for (int i = 1; i < a.length; i++) {
            int j = i;
            T temp = a[j];

            while (less(temp, a[j - 1])) {
                a[j] = a[j - 1];
                j--;
            }

            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        Insertion<Double> insertion = new Insertion<>();
        Double[] a = new Double[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform();
        }

        insertion.sort(a);
        assert insertion.isSorted(a);
        insertion.show(a);
    }
}
