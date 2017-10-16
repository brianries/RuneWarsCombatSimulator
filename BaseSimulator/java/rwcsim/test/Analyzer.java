package rwcsim.test;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by dsayles on 8/17/17.
 */
public class Analyzer {
    public static void analyze(List<Statistics> stats) {
        AtomicInteger totrounds = new AtomicInteger(0);
        stats.stream().forEach(s -> {totrounds.getAndAdd(s.rounds);});

        System.out.println("Total Rounds: "+ totrounds.get());
        System.out.println("Avg Rounds: "+ totrounds.get()/stats.size());

//        int dlive = (int) stats.stream().filter(s->s.daqan.getHealth()>0).count();
//        int dwin = (int) stats.stream().filter(s->s.daqan.getHealth()>0 && s.waiqar.getHealth()<=0).count();
//        int wlive = (int) stats.stream().filter(s->s.waiqar.getHealth()>0).count();
//        int wwin = (int) stats.stream().filter(s->s.waiqar.getHealth()>0 && s.daqan.getHealth()<=0).count();

//        System.out.println("Daqan  live: "+ dlive + " win: "+ dwin + " avgWin: " + (float)dwin/stats.size());
//        System.out.println("Waiqar live: "+ wlive + " win: "+ wwin + " avgWin: " + (float)wwin/stats.size());

    }
}
