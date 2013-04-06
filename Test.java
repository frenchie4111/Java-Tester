/*
 * Simple Java test Framework
 *
 *
 * Created by Michael Lyons <mdl0394@gmail.com>
 */


public class Test {

	public Test() {

	}

	public void test_1() {
		System.out.println("Hello, World!");
	}

	public boolean run() {
		System.out.println( getClass().getName() );

		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	public static void main( String[] args ) {
		Test tester = new Test();
		tester.run();
		tester.test_1();
	}
}