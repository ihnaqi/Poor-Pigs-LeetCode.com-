public class App {

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {

        if (buckets < 2) {
            return 0;
        }

        if (minutesToDie > minutesToTest) {
            return Integer.MAX_VALUE;
        }

        int m = minutesToTest / minutesToDie;

        return (int) Math.ceil(Math.log(buckets) / Math.log(m + 1));

    }
}
