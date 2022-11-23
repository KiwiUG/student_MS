import model.classes;
import model.marks;
import model.students;

public class mains {
    public static void main(String[] args) {
        students one = new students("UG",17,11);
        marks two = new marks(97,98,85);
        classes three = new classes(11,"Khumbila",23048);

        one.std_info();
        two.total();
        three.details();
        
    }
}
