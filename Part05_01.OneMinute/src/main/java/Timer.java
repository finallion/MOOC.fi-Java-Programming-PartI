public class Timer {

    private int seconds;
    private int hundSeconds;
    private int limit;

    public Timer() {
        this.hundSeconds = 0;
        this.seconds = 0;
        this.limit = 100;
    }

    
    public void advance() {
        this.hundSeconds++;

        if (this.hundSeconds >= limit) {
            this.seconds++;
            this.hundSeconds = 0;

            if (this.seconds >= 60) {
                this.seconds = 0;
            }
        }
    }

    public int valueTimer() {
        return this.hundSeconds; 
    }

    
    public String toString() {
        if (this.seconds < 10) {
            if (this.hundSeconds < 10) {
                return "0" + this.seconds + ":0" + this.hundSeconds;
            }
            return "0" + this.seconds + ":" + this.hundSeconds;
        }

        if (this.hundSeconds < 10) {
            return "" + this.seconds + ":0" + this.hundSeconds;
        }

        return "" + this.seconds + ":" + this.hundSeconds;
    }

}
