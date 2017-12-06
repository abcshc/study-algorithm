package study.study_algorithm2.lastman.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import study.study_algorithm2.lastman.model.Man;

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