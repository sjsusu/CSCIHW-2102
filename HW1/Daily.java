package HW1;

public class Daily extends Appt {

    public Daily(int day, int month, int year, String description) {
        super(day, month, year, description);
        
    }

    public boolean occursOn(int day, int month, int year) {
        if (getDay() == day) {
            return true;

        } else {
            return false;

        }
    }
}
