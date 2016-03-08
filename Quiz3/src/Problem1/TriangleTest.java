
package Problem1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {


	@Test
	public void test() {
		Triangle test = new Triangle(2.0,3.0,4.0);
		double output = test.getPerimeter();
		assertTrue(9.0==output);
		
		output = test.getArea();
		assertTrue(Math.abs(2.9047375096555625 - output) < .01);
	}
}

