package blackjack;

public class CardTest2 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();

        for(int i=0; i<3; i++){
            Card c = cd.getCard();
            System.out.println(c);

            gamer.receiveCard(c); // gamer가 받은 카드 저장
        }
        System.out.println("----------------");

//        cd.showAllMyCards();
        gamer.showAllMyCards(); // gamer가 받은 카드
    }
}
