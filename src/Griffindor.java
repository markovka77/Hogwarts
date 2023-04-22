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

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public static void BestStudentGriffindor(Griffindor[] grifStud, String st, String st1) {
        int sum;
        int sum1;
        for (Griffindor i : grifStud) {
            for (Griffindor j : grifStud) {


                sum = i.getCourage() + i.getNobility() + i.getMagic() + i.getHonor() + i.getTransgretion();
                sum1 = j.getCourage() + j.getHonor() + j.getNobility() + j.getMagic() + j.getTransgretion();

                if (sum1 > sum) {
                    System.out.println(i.getFullName());

                } else {
                    System.out.println(i.getFullName());
                }
            }

        }
    }
}


