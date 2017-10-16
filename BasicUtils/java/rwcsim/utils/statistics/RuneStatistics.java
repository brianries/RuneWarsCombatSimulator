package rwcsim.utils.statistics;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class RuneStatistics {
    private static Logger log = Logger.getLogger(RuneStatistics.class);
    private static boolean showRecordings = false;
    private static List<String> recording = new ArrayList<>();

    public static void record(String value) {
        recording.add(value);
        if (showRecordings) {
            log.debug("RuneStatistics("+ System.nanoTime() +"): "+value);
        }
    }


}
