public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Room r1 = new Room(1,2,RoomCategory.STANDARD);
        Room r2 = new Room(2,2,RoomCategory.STANDARD);
        Person anna = new Person("Anna", "Rukina");
        System.out.println(r1);
        System.out.println(r2);

        Booking first = new Booking(anna, r1, new MyData(5,Month.AUGUST,2023), new MyData(7,Month.AUGUST,2023));
        System.out.println(first);
    }
}