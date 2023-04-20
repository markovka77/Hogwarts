public class Hufflepuff extends Hogwarts{
    private int industriousness; // трудолюбие
    private int loyalty; // верность
    private int honesty; // честность

    public Hufflepuff(String fullName, int magic, int transgretion, int industriousness, int loyalty, int honesty) {
        super(fullName, magic, transgretion);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
