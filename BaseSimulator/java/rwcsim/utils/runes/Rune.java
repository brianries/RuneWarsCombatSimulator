package rwcsim.utils.runes;

import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by dsayles on 8/18/17.
 */
public enum Rune {
    BLANK(1, "/images/BlankUnstable.png"),
    NATURAL(1, "/images/NaturalBlank.png"),
    STABLE(1, "/images/StableStable.png"),
    UNSTABLE(2, "/images/UnstableNatural.png");

    int count;
    String imageName;
    Image rpic;


    private Rune(int count, String image) {
        this.count = count;
        imageName = image;
        rpic = new Image(this.getClass().getResourceAsStream(imageName));
    }


    public Image getImage() {
        return rpic;
    }
    public int getCount() { return count; }
}
