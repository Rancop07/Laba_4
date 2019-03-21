//Завдання 3.2 -Іванов А.В.-КН-2-1
//Створити суперклас для певного виду пересування. Від заданого суперкласу створити двох прямих нащадків з певними властивостями
public class Helicopter_1 extends Mashine implements Run{
    public Helicopter_1(String name, int speed) {
        super(name, speed);
    }
    @Override
    int getmax_speed() {
        return super.max_speed;
    }
    @Override
    int getmin_speed() {
        return super.min_speed;
    }
    @Override
    int getmin_passangers() {
        return super.min_passangers;
    }
    @Override
    int getmax_passangers() {
        return super.max_passangers;
    }
    @Override
    public void Inform() {
        System.out.println("Грузовий гелікоптер");
    }
    @Override
    public int Speed() {
        return super.speed;
    }
    @Override
    public int Massa (){
        return 2000;
    }
    @Override
    public int Passanger() {
        return 18;
    }
    @Override
    public int Engine() {
        return 2;
    }
    public String getName(){
        return super.name;
    }
}
