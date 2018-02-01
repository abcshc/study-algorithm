package study.study_algorithm.game.cardGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayingCardTest {
	PlayingCard playingCard;

	@Test
	public void test() {
		playingCard = new PlayingCard(1, 1);
		assertEquals("Ace", playingCard.getGrade());
		assertEquals("Ace of Spades", playingCard.toString());
		
		playingCard = new PlayingCard(1, 2);
		assertEquals("Spades", playingCard.getSuit());
		assertEquals("2", playingCard.getGrade());
		assertEquals("2 of Spades", playingCard.toString());
		
		playingCard = new PlayingCard(2, 11);
		assertEquals("Hearts", playingCard.getSuit());
		assertEquals("Jack", playingCard.getGrade());
		assertEquals("Jack of Hearts", playingCard.toString());
		
		playingCard = new PlayingCard(3, 12);
		assertEquals("Diamonds", playingCard.getSuit());
		assertEquals("Queen", playingCard.getGrade());
		assertEquals("Queen of Diamonds", playingCard.toString());
		
		playingCard = new PlayingCard(4, 13);
		assertEquals("Clubs", playingCard.getSuit());
		assertEquals("King", playingCard.getGrade());
		assertEquals("King of Clubs", playingCard.toString());
	}
}