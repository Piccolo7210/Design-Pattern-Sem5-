package Lab03;

public class IITprinter extends printer{
    private static volatile IITprinter instance;
    private IITprinter(int id){
        this.printer_dept="IITprinter";
        this.printer_id=id;
    }
    public  static IITprinter getInstance(int id){
        IITprinter result = instance;
        if(instance!=null)return result;
        synchronized (IITprinter.class){
            if(instance== null){
                instance = new IITprinter(id);
            }
            return instance;
        }
    }

    @Override
    public void show() {
        System.out.println("This printer is from: "+this.printer_dept);
    }
}
