package ch05;

public class ArrayInArrayTest {
    /*
        박재희 총점: n점, 평균: n점
        김석진 총점: n점, 평균: n점
        이현동 총점: n점, 평균: n점

        수학 총점: n점, 평균: n점
        영어 총점: n점, 평균: n점
        국어 총점: n점, 평균: n점
     */
    public static void main(String[] args){
        int[][] scores = {
                {75, 100, 88}, //수학
                {98, 100, 76}, //영어
                {100, 90, 100} //국어
        };

        String[] names = {"박재희", "김석진", "이현동"};
        int[] stuScore = new int[names.length];

        String[] clsArr = {"수학", "영어", "국어"};
        int[] clsScore = new int[clsArr.length];

        for(int i=0; i<=scores.length; i++){
            for(int z=0; z<scores[i].length; z++){
                int score = scores[i][z];
                clsScore[i] += score;
                stuScore[z] += score;
            }
        }
        for(int i=0; i< stuScore.length; i++){
            System.out.printf("%s 총점: %d점, 평균 %.1f점\n", names[i], stuScore[i]
            , (float)stuScore[i] / clsArr.length);
        }
        for(int i=0; i<clsScore.length; i++){
            System.out.printf("%s 총점: %d점, 평균: %.1f점\n", names[i], stuScore[i],
                    (float)clsScore[i] / names.length);
        }

    }
}
