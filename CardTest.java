package blackjack;

public class CardTest {
    public static void main(String[] args) {
        // 스페이드, A
//        Card s1 = new Card("스페이드","A");
//        Card s2 = new Card("스페이드","2");
//        Card s3 = new Card("스페이드","3");

        // ArrayList

//        List<Card> cards = new ArrayList();
//        cards.add(s1);
//        cards.add(new Card("스페이드","2"));

//        Card ccc = cards.get(0);

//        System.out.println(s1.getPattern());
//        System.out.println(s1.getDenomination());
//        System.out.println(s1);
//        System.out.println(s2);

        CardDeck cd = new CardDeck();
        cd.showAllMyCards();
        cd.getCard();

        // 52장의 카드가 "스페이드" - a~K
        // "하트", "클럽", "다이아"

    }
}
