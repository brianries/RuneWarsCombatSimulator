package rwcsim.basicutils.trays;


public class InfantryTray extends BaseTray {
    public InfantryTray() {
        super(4);
    }

    public static void main(String[] args) {
        InfantryTray it = new InfantryTray();
        it.isEmpty();
    }
}
