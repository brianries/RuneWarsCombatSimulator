package rwcsim.basicutils.dials;

import rwcsim.basicutils.runes.RuneFaces;

public class DialFace {
    private int         initiative;
    private Face        face;
    private FaceColor   color;
    private int         count;
    private RuneFaces rune;

    public DialFace(Face face) {
        this(0, face, null, 0, null);
    }

    public DialFace(int initiative, Face face, FaceColor color) {
        this(initiative, face, color, 0, null);
    }

    public DialFace(int initiative, Face face, FaceColor color, int count) {
        this(initiative, face, color, count, null);
    }

    public DialFace(int initiative, Face face, FaceColor color, RuneFaces rune) {
        this(initiative, face, color, 0, rune);
    }

    public DialFace(Face face, FaceColor color) {
        this(0, face, color, 0, null);
    }

    public DialFace(Face face, FaceColor color, int count) {
        this(0, face, color, count, null);
    }

    public DialFace(Face face, FaceColor color, RuneFaces rune) {
        this(0, face, color, 0, rune);
    }

    public DialFace(Face face, FaceColor color, int count, RuneFaces rune) {
        this(0, face, color, count, rune);
    }

    public DialFace(int initiative, Face face, FaceColor color, int count, RuneFaces rune) {
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

    public RuneFaces getRune() {
        return rune;
    }

    public void setRune(RuneFaces rune) {
        this.rune = rune;
    }
}
