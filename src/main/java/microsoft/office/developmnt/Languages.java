package microsoft.office.developmnt;

public class Languages {
    public String code = "java";
    public String code1 = "python";
    public String code2 = "C++";

    public Languages(String code,String code1){
        this.code=code;
        this.code1=code1;
        System.out.println("code="+code);
        System.out.println("code1="+code1);

    }

    public void coding() {
        System.out.println(code1);
    }
    public void coding2() {
        System.out.println(code2);
    }
}
