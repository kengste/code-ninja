https://leetcode.com/problems/add-two-numbers/

To run the test suites, execute the following commands from the command-line:-

```
javac -d ./output -cp .:./test-lib/junit-4.12.jar:./test-lib/hamcrest-core-1.3.jar ./src/model/ListNode.java ./src/model/Solution.java ./test/model/SolutionTest.java

java -cp ./output:./test-lib/junit-4.12.jar:./test-lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore model.SolutionTest
```