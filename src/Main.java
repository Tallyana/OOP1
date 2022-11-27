public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();

        human1.name = "Максим";
        human2.name = "Аня";
        human3.name = "Катя";
        human4.name = "Артем";

        human1.birthday = 35;
        human2.birthday = 29;
        human3.birthday = 28;
        human4.birthday = 27;

        human1.cityOfResidence = "Минск";
        human2.cityOfResidence = "Москва";
        human3.cityOfResidence = "Калининград";
        human4.cityOfResidence = "Петербург";

        human1.post = "бренд-менеджерa";
        human2.post = "методистa образовательных программ";
        human3.post = "продакт-менеджера";
        human4.post = "директора по развитию бизнеса";

        human1.toSay();
        human2.toSay();
        human3.toSay();
        human4.toSay();
    }
}