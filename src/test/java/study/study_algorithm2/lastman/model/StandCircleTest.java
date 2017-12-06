package study.study_algorithm2.lastman.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import study.study_algorithm2.lastman.model.StandCircle;

public class StandCircleTest {
	private StandCircle standCircle;

	@Before
	public void before() {
		standCircle = new StandCircle(20);
	}

	@Test
	public void goOutTest() {
		standCircle.goOutNextMan(5);
		assertEquals(standCircle.size(), 19);
		assertEquals(standCircle.getManInitialNumber(3), 4);
		assertEquals(standCircle.getManInitialNumber(4), 6);

		standCircle.goOutNextMan(5);
		assertEquals(standCircle.size(), 18);
		assertEquals(standCircle.getManInitialNumber(7), 9);
		assertEquals(standCircle.getManInitialNumber(8), 11);
	}
}