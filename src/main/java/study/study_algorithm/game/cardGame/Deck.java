package study.study_algorithm.game.cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<PlayingCard> cards;

	public Deck() {
		cards = new ArrayList<PlayingCard>();
		init();
	}

	public Deck(List<PlayingCard> list) {
		this.cards = list;
	}

	public List<PlayingCard> getCards() {
		return cards;
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public void print() {
		for (PlayingCard playingCard : cards) {
			System.out.println(playingCard.toString());
		}
	}

	public Deck deal(int count) {
		int size = cards.size();
		// List<PlayingCard> byeCards = cards.subList(size - count, size);
		return byeCards(size - 1, count);
	}

	public Deck byeCards(int size, int count) {
		List<PlayingCard> byeCards = new ArrayList<PlayingCard>();
		for (int i = size; i > size - count; i--) {
			byeCards.add(cards.get(i));
			cards.remove(i);
		}
		return new Deck(byeCards);
	}

	public void removeCards(int size, int count) {
		for (int i = size - 1; i > size - count; i--)
			cards.remove(i);
	}

	private void init() {
		for (int suit = 1; suit <= 4; suit++) {
			addAllGradeCards(suit);
		}
	}

	private void addAllGradeCards(int suit) {
		for (int grade = 1; grade <= 13; grade++) {
			addCard(new PlayingCard(suit, grade));
		}
	}

	public void addCard(PlayingCard playingCard) {
		cards.add(playingCard);
	}
}