package ch06;

public class Tv {
    private String brand = null; // String이나 문자형은 기본적으로 null이 셋팅된다.
    private int inch = 0; // int형과 같은 숫자형 타입은 기본적으로 0이 셋팅된다.


    public void setBrand(String brand){
        this.brand = brand; // brand의 setter
    }
    public String getBrand(){
        return this.brand; // brand의 getter
    }

    public void setInch(int inch){
        this.inch = inch; // inch의 setter
    }
    public int getInch(){
        return this.inch; // inch의 getter
    }
    // getters, setters
    // getter일때는 파라미터가 없다
}
