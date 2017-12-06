package study.study_algorithm2.lastman.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LastManStanding {
	private static final Logger log = LoggerFactory.getLogger(LastManStanding.class);

	private StandCircle standCircle;
	private int interval;

	public LastManStanding(int number, int interval) {
		standCircle = new StandCircle(number);
		this.interval = interval;
		goOutMans();
	}

	public void goOutMans() {
		while (standCircle.size() != 1)
			standCircle.goOutNextMan(interval);
	}

	public int result() {
		int lastIndex = standCircle.getManInitialNumber(0);
		log.debug("{}번째 자리에 서 있던 사람이 남았습니다.", lastIndex);
		return lastIndex;
	}
}