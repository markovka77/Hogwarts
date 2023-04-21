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
    public static void print(Griffindor[] grifStud) {
        System.out.println("Грифинодор : ");

        for (Griffindor st : grifStud) {
            System.out.println("Имя: " + st.getFullName()
                    + " Трансгрессия: " + st.getTransgretion()
                    + " Магия: " + st.getMagic()
                    + " Благородство: " + st.getNobility()
                    + " Честь: " + st.getHonor()
                    + " Храбрость: " + st.getCourage());

        }
    }
//    public static void bestStudentGriffindor(Griffindor[] grifStud) {
//        int sum = 0;
//        int sum1;
//        for (Griffindor st : grifStud) {
//            sum1 = st.getCourage() + st.getHonor() + st.getNobility() + st.getMagic() + st.getTransgretion();
//            if (sum1 > sum) {
//                sum=sum1;
//                System.out.println(st.getFullName());
//
//            }
//        }
//
//    }
}

