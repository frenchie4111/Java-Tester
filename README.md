Java-Tester
===========

Java Testing Framework

This testing is intended to act as much like jUnit as possible without having to messily install jUnit.

Ussage:

Put the Test.java file in your package.
Then create a Test___.java file that extends Test. (Where the ___ is the name of whatever you are testing)

```Java
public class TestExample extends Test {
  public void test_01smokeTest() {
    assertTrue(true, "True was not true");
  }
  
  public void test_02exampleTest() {
    assertEqual((1+1), 2, "1+1 did not equal 2");
  }

  public static void main() {
    Test tester = new TestExample();
    tester.run();
  }
}
```

This example would run both smoke test and exmaple test, and the output would be:

```
..
```
