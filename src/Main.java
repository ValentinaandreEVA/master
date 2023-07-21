public class Main {
    public static void main(String[] args) {

        int initialBalans = 100;
        int addend = 300;
        int bonus = 0;

        int InitialBalans = 1500;
        addend = 500;
        bonus = addend / 100;
        int finalBalans = initialBalans + addend + bonus;

        System.out.println("Итоговый баланс: " + initialBalans);


        if (addend > 1000) {
            bonus = addend / 100;

        } else {
            System.out.println("Итоговый бонус: " + bonus);

        }

    }
}