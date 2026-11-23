import java.util.ArrayList;
import java.util.List;

class RecentCounter {
    List<Integer> times;

    public RecentCounter() {
        times = new ArrayList<>();
    }

    public int ping(int t) {
        times.add(t);

        while (times.get(0) < t - 3000) {
            times.remove(0);
        }

        return times.size();
    }
}