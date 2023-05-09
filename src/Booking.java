public class Booking {
    private Person client;
    private Room room;
    private MyData dataStart;
    private MyData dataEnd;


    Booking (Person client,Room room, MyData dataStart, MyData dataEnd){
        this.client = client;
        this.room = room;
        this.dataStart = dataStart;
        this.dataEnd = dataEnd;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "client=" + client +
                ", room=" + room +
                ", dataStart=" + dataStart +
                ", dataEnd=" + dataEnd +
                '}';
    }
}
