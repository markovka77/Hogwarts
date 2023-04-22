public class PrintService {
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

    public static void print(Ravenclaw[] ravStud) {
        System.out.println("Когтевран :");

        for (Ravenclaw st : ravStud) {
            System.out.println("Имя: " + st.getFullName()
                    + " Трансгрессия: " + st.getTransgretion()
                    + " Магия: " + st.getMagic()
                    + " Ум: " + st.getSmart()
                    + " Мудрость: " + st.getWisdom()
                    + " Остроумие: " + st.getWit()
                    + " Творчество: " + st.getCreation());

        }
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

//    public static void best (Griffindor grifStud) {
//        for (int i = 0; i < grifStud.; i++) {
//            Griffindor student = grifStud[i];
//
//
//        }
//
//
//    }

}
