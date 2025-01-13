public class Main {
    public static void main(String[] args) {

        int eaters = 5; // сколько людей будут есть

        int water = 3001; // миллилитров воды
        int potatoes = 8; // картофелин
        int chicken = 7; // куриных бёдер
        int spices = 11; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eaters) + " миллилитров(а) воды");
        System.out.println((potatoes / eaters) + " картофелин(а/ы)");
        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + " ложек(ки/ка) специй");

    }
}