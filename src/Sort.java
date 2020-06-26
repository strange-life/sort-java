import edu.princeton.cs.algs4.StdOut;

public abstract class Sort<T extends Comparable<T>> {
    protected boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }

    protected boolean isSorted(T[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }

        return true;
    }

    protected void exch(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    protected void show(T[] a) {
        for (T item : a) {
            StdOut.println(item);
        }
    }
}
