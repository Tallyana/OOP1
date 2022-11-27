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




        Auto lada = new Auto("Lada", "Granta", 1.7, " металлик", 2015, "России");
        Auto audi = new Auto("Audi", "A8 ", 3.0, "черный", 2020, "Германии");
        Auto bmv = new Auto("BMV", "Z8", 3.0, "коричневый", 2021, "Германии");
        Auto kia = new Auto("KIA", "Sportage", 2.4, "красный", 2018, "Южной Корее");
        Auto hyundai = new Auto("Hyundai", "Avante", 1.6, "желтый", 2016, "Южной Корее");
        Auto[] cars = {lada, audi, bmv, kia, hyundai};
        for (Auto car: cars){
            System.out.println(car);
        }
    }
        }