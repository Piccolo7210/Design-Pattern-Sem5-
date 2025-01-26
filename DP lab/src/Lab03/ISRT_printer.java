package Lab03;

public class ISRT_printer extends printer {

    private static volatile ISRT_printer instance;
    private ISRT_printer(int id){
        this.printer_dept="ISRT_printer";
        this.printer_id=id;
    }
    public  static ISRT_printer getInstance(int id){
        ISRT_printer result = instance;
        if(instance!=null)return result;
        synchronized (ISRT_printer.class){
            if(instance== null){
                instance = new ISRT_printer(id);
            }
            return instance;
        }
    }

    @Override
    public void show() {
        System.out.println("This printer is from: "+this.printer_dept);
    }
}
