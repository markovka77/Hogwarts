public class Ravenclaw extends Hogwarts{
    private int  smart; // ум
    private int wisdom; // мудрость
    private int wit; // остроумие
    private int creation; // творчество

    public Ravenclaw(String fullName, int magic, int transgretion, int smart, int wisdom, int wit, int creation) {
        super(fullName, magic, transgretion);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }
}
