import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddsTest {

	@Test
	void test() {
		Adds t=new Adds();
		int result=t.add(4, 9);
		assertEquals(13,result);
	}

}
