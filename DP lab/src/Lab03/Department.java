package Lab03;

import java.util.HashMap;
import java.util.Map;

public abstract class Department {
    String dept_name;
    printer printer_instance=null;
//    int printer_id;

    public abstract void getPrinter_instance();
    public abstract void print_examQN();
    public abstract void print_CourseRoutine();

}
