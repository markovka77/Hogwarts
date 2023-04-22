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

//    public static void bestStudentRavenclaw(Ravenclaw[] ravStud) {
//        int sum = 0;
//        int sum1;
//        for (Ravenclaw st : ravStud) {
//            sum1 = st.getCreation() + st.getWit() + st.getWisdom() + st.getMagic() + st.getSmart() + st.getTransgretion();
//            if (sum1 > sum) {
//                sum=sum1;
//
//            }
//        }


}
