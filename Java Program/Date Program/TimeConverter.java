import java.util.Date;

public class TimeConverter {
    public static void main(String[] args) {
        
        Date date = new Date();

       
        long timeInMillis = date.getTime();

        
        long hours = (timeInMillis / (60 * 60 * 1000) % 24)+5;
        long minutes = (timeInMillis / (60 * 1000) % 60)+30;
        long seconds = timeInMillis / 1000 % 60;

      
        System.out.printf("Time: %02d:%02d:%02d%n", hours, minutes, seconds);
    }
}

