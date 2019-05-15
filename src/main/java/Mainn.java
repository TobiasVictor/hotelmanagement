
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Mainn {
    Comparator<Employeeee> sortByName = new Comparator<Employeeee>() {
        @Override
        public int compare(Employeeee employeeee1, Employeeee employeeee2) {
            return employeeee1.getName().compareTo(employeeee2.getName());
        }
    };
    List<Employeeee> employeeees = new ArrayList<Employeeee>();

}
