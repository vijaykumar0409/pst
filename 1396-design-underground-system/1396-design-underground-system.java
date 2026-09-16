
import java.util.*;

class UndergroundSystem {

    // id -> [stationName, checkInTime]
    private Map<Integer, Pair> checkIns;

    // "start#end" -> [totalTime, numberOfTrips]
    private Map<String, double[]> trips;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        trips = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new Pair(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        Pair checkIn = checkIns.get(id);

        String start = checkIn.station;
        int startTime = checkIn.time;

        String key = start + "#" + stationName;

        double[] data = trips.getOrDefault(key, new double[]{0, 0});

        data[0] += t - startTime; // total time
        data[1]++;                // number of trips

        trips.put(key, data);

        checkIns.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "#" + endStation;

        double[] data = trips.get(key);

        return data[0] / data[1];
    }

    // Helper class to store check-in information
    private static class Pair {
        String station;
        int time;

        Pair(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }
}

