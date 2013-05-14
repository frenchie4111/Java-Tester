build-jar: build
	jar cf Test.jar bin/org/mikelyons/jtest/* src/org/mikelyons/jtest/*
	
build-test-tester: build
	javac -d bin -sourcepath src src/org/mikelyons/jtest/TestTester.java

build: src/org/mikelyons/jtest/Test.java
	javac -d bin -sourcepath src src/org/mikelyons/jtest/Test.java

build-simple: src/Test.java
	javac -d bin -sourcepath src src/Test.java
