package study.study_algorithm2.cardGame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeckTest {
	private Deck deck = new Deck();

	@Test
	public void test() {
		assertEquals(52, deck.getCards().size());
		deck.shuffle();
		deck.print();
		Deck hand = deck.deal(5);
		assertEquals(5, hand.getCards().size());
		assertEquals(47, deck.getCards().size());
	}
}