public class Griffindor  extends Hogwarts {
    private int nobility; //благородство
    private int honor;// честь
    private int courage;// храбрость

    public Griffindor(String fullName, int magic, int transgretion, int nobility, int honor, int courage) {
        super(fullName, magic, transgretion);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
}
