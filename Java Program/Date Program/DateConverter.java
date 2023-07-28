import java.util.Scanner;

public class DateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the date (DD-MM-YYYY): ");
        String input = scanner.nextLine();
        
       
        String day = input.substring(0, 2);
        String month = input.substring(3, 5);
        String year = input.substring(6, 10);
        
        
        String formattedDate = year + "-" + day + "-" + month;
        

        System.out.println("Formatted date: " + formattedDate);
        
        scanner.close();
    }
}


