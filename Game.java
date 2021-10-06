package blackjack;

import java.util.Scanner;

public class Game {
    public void play(){
        Scanner scan = new Scanner(System.in);
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();

        for(int i=0; i<2; i++){ // 순차적으로 각자 2장의 카드를 갖도록한다.
            dealer.receiveCard(cd.getCard());
            gamer.receiveCard(cd.getCard());
        }
        dealer.moreCard(cd);

        while(true){
            System.out.println("--- My Card List ---");
            gamer.showAllMyCards();

            System.out.println("카드를 더 뽑으시겠습니까? (y/n)");
            String yn = scan.next();
            if("n".equals(yn)){
                break;
            }
            gamer.receiveCard(cd.getCard());
        }
        System.out.println("--- Dealer Card List ---");
        dealer.showAllMyCards();
        rule.getWinner(dealer, gamer);
    }
}
