//Завдання 2 -Іванов А.В.-КН-2-1
//Створити абстрактний клас Mashine, що реалізує інтерфейс Run.
public abstract class Mashine implements Run {
    final int max_speed = 300;
    final int min_speed = 1;
    final int min_passangers = 4;
    final int max_passangers = 60;
    String name;
    int speed;
    public Mashine(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    abstract int getmax_speed();
    abstract int getmin_speed();
    abstract int getmin_passangers();
    abstract int getmax_passangers();
    public String getName(){
        return "Masine";
    }
}
