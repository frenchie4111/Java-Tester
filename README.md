Java-Tester
===========

Java Testing Framework

This testing is intended to act as much like jUnit as possible without having to messily install jUnit.

Ussage:

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
javac -cp /bin;/path/to/Test.jar TestExmaple
```
Or f11 (default) in ecplise

The expected output would be:

```
..
```
