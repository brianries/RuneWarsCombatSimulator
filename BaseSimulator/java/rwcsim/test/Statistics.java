package rwcsim.test;

/**
 * Created by dsayles on 8/17/17.
 */
public class Statistics {
    CoreUnit daqan;
    CoreUnit waiqar;
    int rounds;
    public Statistics(int r, CoreUnit d, CoreUnit w) {
        daqan = d;
        waiqar = w;
        rounds = r;
    }

    public void showStats() {
        System.out.println("R: "+ rounds + " D:"+daqan.getHealth()+ " W:"+waiqar.getHealth());
        System.out.println("\nDaqar Data");
//        daqan.showStats();

        System.out.println("\nWaiqar Stats");
//        waiqar.showStats();
    }
}
