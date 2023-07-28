import java.util.Scanner;

public class DayOfWeekCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String input = scanner.nextLine();
        
        
        String[] parts = input.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        
        int q = day;
        int m = month;
        int yearOfCentury = year % 100;
        int century = year / 100;
        
        if (m < 3) {
            m += 12;
            yearOfCentury -= 1;
        }
        
        int h = (q + (13 * (m + 1) / 5) + yearOfCentury + (yearOfCentury / 4) + (century / 4) - (2 * century)) % 7;
        if(h<0){
          h=7+h;
        }
        System.out.println(h);
        
        
        String dayOfWeek;
        switch (h) {
            case 0:
                dayOfWeek = "Saturday";
                break;
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            default:
                dayOfWeek = "Invalid day";
                break;
        }
        
       
        System.out.println("You were born on a " + dayOfWeek + ".");
        
        scanner.close();
    }
}

