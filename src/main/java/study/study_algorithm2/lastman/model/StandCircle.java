package study.study_algorithm2.lastman.model;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StandCircle {
	private static final Logger log = LoggerFactory.getLogger(StandCircle.class);

	private ArrayList<Man> mans = new ArrayList<Man>();
	private int currentIndex = -1;

	public StandCircle(int number) {
		for (int i = 1; i < number + 1; i++) {
			mans.add(new Man(i));
		}
	}

	public void goOutNextMan(int moveNumber) {
		int nextIndex = (currentIndex + moveNumber) % mans.size();
		currentIndex = nextIndex - 1;
		log.debug("{}번째 사람이 나갑니다.", mans.get(nextIndex).getNumber());
		mans.remove(nextIndex);
	}

	public int getManInitialNumber(int index) {
		return mans.get(index).getNumber();
	}

	public int size() {
		return mans.size();
	}
}