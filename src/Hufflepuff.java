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
    public static void print(Hufflepuff[] hufStud) {
        System.out.println("Паффендуй :");

        for (Hufflepuff st : hufStud) {
            System.out.println("Имя: " + st.getFullName()
                    + " Трансгрессия: " + st.getTransgretion()
                    + " Магия: " + st.getMagic()
                    + " Трудолюбте: " + st.getIndustriousness()
                    + " Верность: " + st.getLoyalty()
                    + " Честность: " + st.getHonesty());

        }

    }
//    public static void bestStudentHufflpuff(Hufflepuff[] hufStud) {
//        int sum = 0;
//        int sum1;
//        for (Hufflepuff st : hufStud) {
//            sum1 = st.getHonesty() + st.getLoyalty() + st.getIndustriousness() + st.getMagic() + st.getTransgretion();
//            if (sum1 > sum) {
//                sum=sum1;
//                System.out.println(st.getFullName());
//
//            }
//        }
//
//    }
}
