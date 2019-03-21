//Завдання 3.2 -Іванов А.В.-КН-2-1
//Створити демонстраційний клас, в якому створюються екземпляри обох нащадків, та здійснюється виклик методів для виводу інформації про Ваш засіб пересування.
public class Main {
    public static void name(Mashine mashine){
        System.out.println("Назва машини: " + mashine.name);
    }

    public static void Space_line(){
        System.out.println("________________________________________________________________________________________" +
                "_____________________________" + "\n");    }

    public static void main(String[] args) {
        Space_line();
        name(new Helicopter("Гелікоптер Мі-24",110));
        Helicopter l = new Helicopter("Гелікоптер Мі-24",100);
        l.Inform();
        System.out.println("Максимальна кількість пасажирів: " + l.getmax_passangers());
        System.out.println("Мінімальна кількість пасажирів: " + l.getmin_passangers());
        System.out.println("Максимальна швидкість: " + l.getmax_speed());
        System.out.println("Мінімальна швидкість: " + l.getmin_speed());
        System.out.println("Поточна швидкість: " + l.Speed());
        System.out.println("Маса машини: " + l.Massa());
        System.out.println("Засоби передачі руху (двигуни): " + l.Engine());
        System.out.println("Кількість пасажирів: " + l.Passanger());

        Space_line();

        name(new Helicopter("Гелікоптер Мі-8",75));
        Helicopter_1 l_2 = new Helicopter_1("Гелікоптер Мі-8",75);
        l_2.Inform();
        System.out.println("Максимальна кількість пасажирів: " + l_2.getmax_passangers());
        System.out.println("Мінімальна кількість пасажирів: " + l_2.getmin_passangers());
        System.out.println("Максимальна швидкість: " + l_2.getmax_speed());
        System.out.println("Мінімальна швидкість: " + l_2.getmin_speed());
        System.out.println("Поточна швидкість: " + l_2.Speed());
        System.out.println("Маса машини: " + l_2.Massa());
        System.out.println("Засоби передачі руху (двигуни): " + l_2.Engine());
        System.out.println("Кількість пасажирів: " + l_2.Passanger());

        Space_line();
    }
}

