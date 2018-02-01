package study.study_algorithm.game.lastman.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ManTest {
	private Man man;

	@Before
	public void before() {
		man = new Man(1);
	}

	@Test
	public void manTest() {
		assertEquals(1, man.getNumber());
	}
}