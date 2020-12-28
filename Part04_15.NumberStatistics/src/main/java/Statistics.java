
public class Statistics {
  
    private int count;
    private int sum;

    public void addNumber(int number) {
        count++; 
        sum += number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (count != 0) {
            return (double) this.sum/this.count;
        }
        return 0;
    }
}
