package ch03;

public class ForExample2 {
    public static void main(String[] args){
        for(int i=0; i<5; i++) {
            for (int z = 0; z < 10; z++) {
                System.out.printf("%d -%d\n", i, z);
            }
        }
    }
}
