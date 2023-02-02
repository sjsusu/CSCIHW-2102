package HW1;

public class Appt {
    private String description;
    private int day;
    private int month;
    private int year;

    public Appt(int day, int month, int year, String description) {
        this.description = description;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDesc() {
        return description;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean occursOn(int day, int month, int year) {
        
        if (this.day == day && this.month == month && this.year == year) {
            return true;

        } else {
            return false;
            
        }
    }

}
