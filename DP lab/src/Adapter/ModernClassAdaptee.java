package Adapter;

public class ModernClassAdaptee extends modernAdaptee implements legacyPrinter{
    @Override
    public void oldPrint(String documents) {
        this.modernPrinting(documents);
    }
}
