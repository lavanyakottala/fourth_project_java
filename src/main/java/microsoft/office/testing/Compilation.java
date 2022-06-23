package microsoft.office.testing;

public class Compilation {
    public int errors = 6;
    public boolean yes= true;

    public Integer multiplyWith100(int errors,boolean yes){
        this.errors=errors;
        this.yes=yes;
        System.out.println("errors="+errors);
        System.out.println("yes="+yes);
        return errors*100;
    }





}
