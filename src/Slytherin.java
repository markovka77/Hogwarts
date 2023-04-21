public class Slytherin extends  Hogwarts {
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int power; // власть

    public Slytherin(String fullName, int magic, int transgretion, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(fullName, magic, transgretion);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public static void print(Slytherin[] slyStud) {
        System.out.println("Слизерин :");

        for (Slytherin st : slyStud) {
            System.out.println("Имя: " + st.getFullName()
                    + " Трансгрессия: " + st.getTransgretion()
                    + " Магия: " + st.getMagic()
                    + " Хитрость: " + st.getCunning()
                    + " Решительность: " + st.getDetermination()
                    + " Амбициозность: " + st.getAmbition()
                    + " Власть: " + st.getPower());

        }
    }

//    public static void bestStudentSlytherin(Slytherin[] slyStud) {
//        int sum = 0;
//        int sum1;
//        for (Slytherin st : slyStud) {
//            sum1 = st.getAmbition() + st.getPower() + st.getDetermination() + st.getMagic() + st.getCunning() + st.getResourcefulness() + st.getTransgretion();
//            if (sum1 > sum) {
//                sum = sum1;
//                continue;
//
//
//            }
//
//        }
//    }
}
