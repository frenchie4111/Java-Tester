import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * Simple Java test Framework
 *
 *
 * Created by Michael Lyons <mdl0394@gmail.com>
 */


public class Test {

	private ArrayList<String> errorMessages;

	private Boolean currentTest; //Whether the current test is passing or not, changed by asserts

	public Test() {
		errorMessages = new ArrayList<String>();
	}

	public void test_smokeTest() {
		System.out.println("Hello, World!");
		assertEqual( "a", "a", "a != a" );
		assertEqual( "a", "b", "a != b" );
		assertTrue(true, "true is not true");
		assertTrue(false, "false is not true");
	}

	public void assertEqual(Object object1, Object object2, String errorMessage) {
		if( object1.equals(object2) ) {

		} else {
			this.currentTest = false;
		}
	}

	public void assertTrue(Object object1, String errorMessage) {
		if( object1 instanceof Boolean ) {
			if( (Boolean)object1 ) {

			} else {
				this.currentTest = false;
				System.out.println(errorMessage);
			}
		} else {
			this.currentTest = false;
		}
	}

	private void addMessage( String message ) {
		this.errorMessages.add( message );
	}

	private void printMessages() {
		for( String message : this.errorMessages ) {
			System.out.println( message );
		}
	}

	public boolean run() {
		System.out.println( getClass().getName() );

		try {
			Method m[] = this.getClass().getDeclaredMethods();
			for( Method i : m ) {
				if( i.getName().startsWith("test") ) {
					currentTest = true;

					i.invoke(this);

					if( !this.currentTest ) {
						System.out.println("F");
					} else {
						System.out.println(".");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	public static void main( String[] args ) {
		Test tester = new Test();
		tester.run();
	}
}