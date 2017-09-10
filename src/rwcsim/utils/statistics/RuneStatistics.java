package rwcsim.utils.statistics;

import java.util.ArrayList;
import java.util.List;

public class RuneStatistics {
    private static boolean showRecordings = true;
    private static List<String> recording = new ArrayList<>();

    public static void record(String value) {
        recording.add(value);
        if (showRecordings) {
            System.out.println("RuneStatistics("+ System.nanoTime() +"): "+value);
        }
    }


}
