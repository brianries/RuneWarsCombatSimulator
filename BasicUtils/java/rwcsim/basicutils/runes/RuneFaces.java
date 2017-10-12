package rwcsim.basicutils.runes;

import javafx.scene.image.Image;

/**
 * Created by dsayles on 8/18/17.
 */
public enum RuneFaces {
    BLANK(1, "/images/BlankUnstable.png"),
    NATURAL(1, "/images/NaturalBlank.png"),
    STABLE(1, "/images/StableStable.png"),
    UNSTABLE(2, "/images/UnstableNatural.png");

    int count;
    String imageName;
    Image rpic;

    static RuneFaces[] values = RuneFaces.values();


    private RuneFaces(int count, String image) {
        this.count = count;
        imageName = image;
        rpic = new Image(this.getClass().getResourceAsStream(imageName));
    }


    public Image getImage() {
        return rpic;
    }
    public int getCount() { return count; }


    public static RuneFaces getFace(int i) { return values[i]; }
}
