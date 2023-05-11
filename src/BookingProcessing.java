import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BookingProcessing {

    private List<Booking> bookingList = new ArrayList<>();

//CRUD
//add, find, change, del/cancel

    public boolean add(Booking booking){
        //check dates; and add;
        if(checkBooking(booking)){
            bookingList.add(booking);
            return true;
        }

     return false;
    }

    public boolean add(Person client,Room room, MyData dataStart, MyData dataEnd){
        Booking booking = new Booking(client, room,dataStart, dataEnd);
        return add(booking);
    }

    //TODO realise capability check
    private boolean checkBooking(Booking booking){
        return true;
    }

   public String toString(){
        String rez = "";
       for (Booking booking:bookingList
            ) rez+=booking.toString()+System.lineSeparator();
          // rez+=booking.toString()+"\n";
       return rez;
   }

   }

