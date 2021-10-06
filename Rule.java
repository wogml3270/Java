package blackjack;

import java.util.*;

public class Rule {
    public int getScore(List<Card> cards){
        int sumPoint = 0;
        for(int i=0; i<2; i++){
            Card c = cards.get(i);
            sumPoint = sumPoint + c.getPoint();
        }
        return sumPoint;
    }

    public void getWinner(Dealer dealer, Gamer gamer){
        int dealerScore = getScore(dealer.openCards());
        int gamerScore = getScore(gamer.openCards());

        final int STAND_SCORE = 21;

        if( (gamerScore > STAND_SCORE) || (dealerScore <= STAND_SCORE) && (dealerScore > gamerScore) ){
                System.out.println("딜러 승");
        } else if( (dealerScore == gamerScore) || (dealerScore > STAND_SCORE && gamerScore > STAND_SCORE) ){
                System.out.println("무승부");
        } else {
                System.out.println("게이머 승");
        }

        System.out.println("딜러 총점 : " + dealerScore);
        System.out.println("게이머 총점 : " + gamerScore);

        // 경우의 수 3 (비긴경우(점수 같음, 둘다 21점 넘김), 딜러 승, 게이머 승)
    }
}
