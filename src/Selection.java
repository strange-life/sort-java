import edu.princeton.cs.algs4.StdRandom;

public class Selection<T extends Comparable<T>> extends Sort<T> {
    public void sort(T[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;

            for (int j = i + 1; j < a.length; j++)
                if (less(a[j], a[min]))
                    min = j;

            exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        Selection<Double> selection = new Selection<>();
        Double[] a = new Double[10];

        for (int i = 0; i < a.length; i++)
            a[i] = StdRandom.uniform();

        selection.sort(a);
        assert selection.isSorted(a);
        selection.show(a);
    }
}
