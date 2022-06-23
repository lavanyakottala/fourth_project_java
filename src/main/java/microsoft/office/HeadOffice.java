package microsoft.office;

import microsoft.office.developmnt.Languages;
import microsoft.office.networking.Protocols;
import microsoft.office.testing.Compilation;

public class HeadOffice {
    public static void main(String[] args) {
        Languages languages= new Languages("MyJava","Lava");
        //languages.coding();
        //languages.coding2();

        Protocols protocols= new Protocols();
        Compilation compilation= new Compilation();
        compilation.multiplyWith100(7,false);



    }
}
