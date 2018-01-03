package study.study_algorithm2.cardGame;

public class PlayingCard {
	private Suit suit;
	private int grade;

	public PlayingCard(int suit, int grade) {
		this.suit = Suit.getValue(suit);
		this.grade = grade;
	}

	public String getSuit() {
		return suit.toString();
	}

	public String getGrade() {
		return Grade.getValue(grade);
	}

	public String toString() {
		return getGrade() + " of " + getSuit();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grade;
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayingCard other = (PlayingCard) obj;
		if (grade != other.grade)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}

	public static enum Grade {
		Ace(1), Jack(11), Queen(12), King(13);
		private int gradeNumber;

		Grade(int gradeNumber) {
			this.gradeNumber = gradeNumber;
		}

		private static String getValue(int num) {
			for (Grade grade : values()) {
				if (grade.gradeNumber == num) {
					return grade.toString();
				}
			}
			return Integer.toString(num);
		}
	};

	public static enum Suit {
		Spades(1), Hearts(2), Diamonds(3), Clubs(4);
		private int suitNumber;

		Suit(int suitNumber) {
			this.suitNumber = suitNumber;
		}

		private static Suit getValue(int num) {
			for (Suit suit : values()) {
				if (suit.suitNumber == num) {
					return suit;
				}
			}
			return null;
		}
	}
}