package rwcsim.basicutils.dials;

import rwcsim.basicutils.runes.Rune;

public class DialFace {
    private int         initiative;
    private Face        face;
    private FaceColor   color;
    private int         count;
    private Rune        rune;

    public DialFace(Face face) {
        this(0, face, null, 0, null);
    }

    public DialFace(int initiative, Face face, FaceColor color) {
        this(initiative, face, color, 0, null);
    }

    public DialFace(int initiative, Face face, FaceColor color, int count) {
        this(initiative, face, color, count, null);
    }

    public DialFace(int initiative, Face face, FaceColor color, Rune rune) {
        this(initiative, face, color, 0, rune);
    }

    public DialFace(Face face, FaceColor color) {
        this(0, face, color, 0, null);
    }

    public DialFace(Face face, FaceColor color, int count) {
        this(0, face, color, count, null);
    }

    public DialFace(Face face, FaceColor color, Rune rune) {
        this(0, face, color, 0, rune);
    }

    public DialFace(Face face, FaceColor color, int count, Rune rune) {
        this(0, face, color, count, rune);
    }

    public DialFace(int initiative, Face face, FaceColor color, int count, Rune rune) {
        this.initiative = initiative;
        this.face = face;
        this.color = color;
        this.count = count;
        this.rune = rune;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public FaceColor getColor() {
        return color;
    }

    public void setColor(FaceColor color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Rune getRune() {
        return rune;
    }

    public void setRune(Rune rune) {
        this.rune = rune;
    }
}
