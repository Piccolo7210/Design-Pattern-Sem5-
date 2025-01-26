package Lab03;

import java.util.Random;

public class IITDEPT extends Department{
    public IITDEPT(){
        this.dept_name="IIT";
//        this.printer_id=id;

    }
    @Override
    public void getPrinter_instance() {
        if(this.printer_instance==null){
            Random rand = new Random();

            // Generate random integers in range 0 to 999
            int rand_int1 = rand.nextInt(1000);
            this.printer_instance=IITprinter.getInstance(rand_int1);
        }
    }

    @Override
    public void print_examQN() {
        getPrinter_instance();
        System.out.println("Printing Exam Question on "+this.printer_instance.printer_dept+this.printer_instance.printer_id);
    }

    @Override
    public void print_CourseRoutine() {
        getPrinter_instance();
        System.out.println("Printing CourseRoutine on "+this.printer_instance.printer_dept+this.printer_instance.printer_id);
    }
}
