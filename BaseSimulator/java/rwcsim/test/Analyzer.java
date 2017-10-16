package rwcsim.test;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by dsayles on 8/17/17.
 */
public class Analyzer {
    private static Logger log = Logger.getLogger(Analyzer.class);
    public static void analyze(List<Statistics> stats) {
        AtomicInteger totrounds = new AtomicInteger(0);
        stats.stream().forEach(s -> {totrounds.getAndAdd(s.rounds);});

        System.out.println("Total Rounds: "+ totrounds.get());
        System.out.println("Avg Rounds: "+ totrounds.get()/stats.size());

        Map<String, Long> unitLife = new HashMap<>();

        stats.stream().forEach( s -> {
            if (!unitLife.containsKey(s.first.unit.getName())) {
                unitLife.put(s.first.unit.getName(), new Long(0));
            }
            if (s.first.isAlive) {
                unitLife.put(s.first.unit.getName(), unitLife.get(s.first.unit.getName()) + 1);
            }

            if (!unitLife.containsKey(s.second.unit.getName())) {
                unitLife.put(s.second.unit.getName(), new Long(0));
            }
            if (s.second.isAlive) {
                unitLife.put(s.second.unit.getName(), unitLife.get(s.second.unit.getName()) + 1);
            }

            if (!unitLife.containsKey("Both Alive")) {
                unitLife.put("Both Alive", new Long(0));
            }
            if (s.first.isAlive && s.second.isAlive) {
                unitLife.put("Both Alive", unitLife.get("Both Alive") + 1);
            }

            if (!unitLife.containsKey("First kills Second")) {
                unitLife.put("First kills Second", new Long(0));
            }
            if (s.first.isAlive && !s.second.isAlive) {
                unitLife.put("First kills Second", unitLife.get("First kills Second") + 1);
            }

            if (!unitLife.containsKey("Second kills First")) {
                unitLife.put("Second kills First", new Long(0));
            }
            if (!s.first.isAlive && s.second.isAlive) {
                unitLife.put("Second kills First", unitLife.get("Second kills First") + 1);
            }
        });

        for (Map.Entry<String,Long> ul : unitLife.entrySet()) {
            int value = ul.getValue().intValue();
            log.info(ul.getKey() + " (isAlive): " + value+ " (delta):" + ((double)value)/stats.size()*100);
        }
    }
}
