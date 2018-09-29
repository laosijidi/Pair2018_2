package Exam1;
import static org.junit.Assert.*;

import org.junit.Test;
public class MathExamTest {
	@Test
	public void test1() throws Throwable {
		String[] input = new String[] {"-n", "10", "-grade", "1"};
		MathExam.main(input);
	}

	@Test
	public void test2() throws Throwable {
		String[] input = new String[] {"-n", "10", "-grade", "2"};
		MathExam.main(input);
	}

	@Test
	public void test3() throws Throwable {
		String[] input = new String[] {"-n", "10", "-grade", "3"};
		MathExam.main(input);
		
	}

}
