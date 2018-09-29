package jUnit4Demo;
import static org.junit.Assert.*;

import org.junit.Test;
public class Exam1Test {
	@Test
	public void test1() throws Throwable {
		String[] input = new String[] {"-n", "10", "-grade", "1"};
		Exam1.main(input);
	}

	@Test
	public void test2() throws Throwable {
		String[] input = new String[] {"-n", "10", "-grade", "2"};
		Exam1.main(input);
	}

	@Test
	public void test3() throws Throwable {
		String[] input = new String[] {"-n", "10", "-grade", "3"};
		Exam1.main(input);
		
	}

}
