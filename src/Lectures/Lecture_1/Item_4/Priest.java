package Lectures.Lecture_1.Item_4;

public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.r.nextInt(100));
        this.maxElixir = Magician.r.nextInt( 150);
        this.elixir = maxElixir;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
