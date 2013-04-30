Java-Tester
===========

Java Testing JUnit

This testing is intended to act as much like jUnit as possible without having to messily install jUnit.

It also allows JUnit-like tests when using the Default package


Using with Test.java
--------------------

Add Test.java to your project (If you are using Eclipse just drag it into your project)

Create a new Java file for testing, here I will call it TestExample.java
The clas we will create extends Test (The file we just added to the project)
Add test functions to TestExample that start with test

Add a main that looks like this:
```Java
public static void main() {
	Test tester = new TestExample();
	tester.run();
}
```
This will run every test function in the TestExample class

Below is the full source code for this example

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

Using with Test.jar
-------------------

If you are using eclipse you should add Test.jar to your project by: 

This in an exmaple for writing TestExample.java which runs a few example tests

Right clicking the project -> Properties -> Java Build Path -> Libraries -> Add External Jar -> Wherever you dowloaded Test.jar to on your computer.
If you are not using eclipse while building through command line you need the command 
```
javac -d bin;/path/to/Test.jar -sourcepath src /src/TestExample.java
```
(This is assuming all of your source files are saved in the src folder and all of your .class files are build to /bin) <br/>
<a href="http://www.sergiy.ca/how-to-compile-and-launch-java-code-from-command-line/">This is a nice guide for compiling java through command line</a>

Here is the TestExample.java source

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

After running with:
```
java -cp /bin;/path/to/Test.jar TestExmaple
```
Or f11 (default) in ecplise

The expected output would be:

```
..
```
