
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public void advance() {
        if (this.day < 30) {
            this.day += 1;
        } else {
            this.day = 1;
            
            if (this.month < 12) {
                this.month++;
            } else {
                this.month = 1;
                this.year++;
            }
        }
    }

 
    public void advance(int howManyDays) {
        while (howManyDays > 0) {
            this.advance();
            howManyDays--;
        }
    }


    public SimpleDate afterNumberOfDays(int day) {
        SimpleDate afterNumberOfDays = new SimpleDate(this.day, this.month, this.year);
        afterNumberOfDays.advance(day);
        return afterNumberOfDays;
    }
    
    
    
    
    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
