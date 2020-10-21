import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookHolidayWithHook extends HolidayBuilder{

    public String getCustomerDetails(){
        String insurance;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add insurance? Y or N");
        insurance = scanner.nextLine();
        return insurance;
    }

    @Override
    public void addInsurance() {
        String insurance = getCustomerDetails();

        if(insurance.startsWith("Y")){
            System.out.println("Insurance ADDED...");
        }
        else{
            System.out.println("Careful out there...");
        }
    }
}
