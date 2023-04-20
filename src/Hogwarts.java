public class Hogwarts {
    private final String fullName;
    private int magic;
    private int transgretion;

    public Hogwarts(String fullName, int magic, int transgretion) {
        this.fullName = fullName;
        this.magic = magic;
        this.transgretion = transgretion;
    }

    public String getFullName() {
        return fullName;
    }


    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgretion() {
        return transgretion;
    }

    public void setTransgretion(int transgretion) {
        this.transgretion = transgretion;
    }
}
