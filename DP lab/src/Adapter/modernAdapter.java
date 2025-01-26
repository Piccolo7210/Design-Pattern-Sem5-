package Adapter;

public class modernAdapter implements legacyPrinter{
  private modernAdaptee adaptee;
   modernAdapter(modernAdaptee a){
       this.adaptee=a;
   }
    @Override
    public void oldPrint(String documents) {
     this.adaptee.modernPrinting(documents);
    }
}
