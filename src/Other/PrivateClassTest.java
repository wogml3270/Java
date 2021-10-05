package Other;

import ch06.PrivateClass;

public class PrivateClassTest {
    public static void main(String[] args){
        PrivateClass pc = new PrivateClass();
//        pc.val = 10; 접근 불가
//        pc.defaultVal = 10; default는 다른 패키지에서 접근 불가
    }
}
