package study.study_algorithm.game.lastman.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LastManStandingTest {
	private LastManStanding lastManStanding;

	@Test
	public void resultTest() {
		lastManStanding = new LastManStanding(20, 5);
		assertEquals(lastManStanding.result(), 7);
	}

	@Test
	public void resultTest2() {
		lastManStanding = new LastManStanding(5, 1);
		assertEquals(lastManStanding.result(), 5);
	}

	@Test
	public void resultTest3() {
		lastManStanding = new LastManStanding(10, 2);
		assertEquals(lastManStanding.result(), 5);
	}

	@Test
	public void resultTest4() {
		lastManStanding = new LastManStanding(2, 4);
		assertEquals(lastManStanding.result(), 1);
	}

	@Test
	public void resultTest5() {
		lastManStanding = new LastManStanding(2, 3);
		assertEquals(lastManStanding.result(), 2);
	}
}