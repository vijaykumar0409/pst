
import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {

    private Map<Integer, CheckInInfo> checkIns = new HashMap<>();
    private Map<String, double[]> routes = new HashMap<>();

    public UndergroundSystem() {
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckInInfo(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInInfo info = checkIns.get(id);

        String route = info.station + "->" + stationName;
        double travelTime = t - info.time;

        if (!routes.containsKey(route)) {
            routes.put(route, new double[]{0.0, 0.0});
        }

        double[] data = routes.get(route);
        data[0] += travelTime;
        data[1]++;

        checkIns.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "->" + endStation;

        double[] data = routes.get(route);

        return data[0] / data[1];
    }

    private static class CheckInInfo {
        String station;
        int time;

        CheckInInfo(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna