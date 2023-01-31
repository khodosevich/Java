package Exceptions;

public class ScannerExp extends Exception{

    private String name;
    public ScannerExp(String exp) {
        this.name = exp;
    }

    public void nameOfExp(){
        System.out.println(name);
    }

}
