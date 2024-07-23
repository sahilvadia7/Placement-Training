package programs.clock;

public class clocktest {
    public static void setClock(int secondsSinceMidnight) {
        int hours = secondsSinceMidnight / 3600;
        System.out.println("hours :"+hours);
        int remainingSeconds = secondsSinceMidnight % 3600;
        System.out.println("remainingSecond : "+remainingSeconds);
        int minutes = remainingSeconds / 60;
        System.out.println("Minutes : "+minutes);
        int seconds = remainingSeconds % 60;
        System.out.println("Seconds : "+seconds);
       
    }

    public static void main(String[] args) {

        setClock(80);
    }
}
