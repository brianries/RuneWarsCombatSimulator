package rwcsim.utils.runes;

import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by dsayles on 8/18/17.
 */
public enum Rune {
    BLANK("/images/BlankUnstable.png"),
    NATURAL("/images/NaturalBlank.png"),
    STABLE("/images/StableStable.png"),
    UNSTABLE("/images/UnstableNatural.png");

    String imageName;
    Image rpic;


    private Rune(String image) {
        imageName = image;
        rpic = new Image(this.getClass().getResourceAsStream(imageName));
    }

    public Image getImage() {
        return rpic;
    }
}
