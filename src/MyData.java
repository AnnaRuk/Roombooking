public class MyData {

    private int day;
    private Month month;
    private int year;

    public MyData(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month +
                "/" + year;
    }
}
