package HW1;

public class Monthly extends Appt {

    public Monthly(int day, int month, int year, String description) {
        super(day, month, year, description);
        
    }

    public boolean occursOn(int day, int month, int year) {
        if (getMonth() == month) {
            return true;

        } else {
            return false;

        }
    }
}
