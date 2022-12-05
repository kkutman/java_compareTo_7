public class SortClass implements Comparable<Integer> {
    @Override
    public int compareTo(Integer o) {
        return o.compareTo(o);
    }
}
