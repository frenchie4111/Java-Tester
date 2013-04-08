Java-Tester
===========

Java Testing Framework

This testing is intended to act as much like jUnit as possible without having to messily install jUnit.

Ussage:

If you are using eclipse you should add Test.jar to your project by: 

This in an exmaple for writing TestExample.java which runs a few example tests

Right clicking the project -> Properties -> Java Build Path -> Libraries -> Add External Jar -> Wherever you dowloaded Test.jar to on your computer.
If you are not using eclipse while building through command line you need the command 
javac -d bin;/path/to/Test.jar -sourcepath src /src/TestExample.java

```Java
include org.mikelyons.jtest.*;

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
