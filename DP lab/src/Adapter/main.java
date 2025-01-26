package Adapter;

public class main {
    public static void main(String[] args) {
//        legacyPrinter printer = new modernAdapter(new modernAdaptee());
//        printer.oldPrint("BSSE1405");
        legacyPrinter printer2 = new ModernClassAdaptee();
        printer2.oldPrint("BSSE 1400000");
    }
}
