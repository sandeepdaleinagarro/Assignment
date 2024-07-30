1 - Have used BDD Cucumber framework + Page Object Model + Selenium Java + Test NG (Hybrid Framework) along with Maven Build Automation Tool.

2 - As it's a cucumber project , I have kept all the feature files (with test steps) in src/test/resources source folder. And all the step definitions , Hooks and Runner classes in src/test/java source folder.

3 - Utility classes like webdriver factory , config reader and Page classes are in src/main/java source folder.
Here I have used cucumber + testng to run my test feature files. So the runner class is located at src/test/java/com.runners/TestNGRunner.java.

4 - For reporting I have used both Extent reports HTML and PDF format. After execution the detailed reports will be available at test-output -> pdfReport/SparkReport folders.

5 - To execute the test cases , we can directly execute the runner file i.e. TestNGRunner.java with TestNG Test.

6 - To execute the test cases using Maven Build, we have to run the command "clean verify" using Maven command line or directly in eclipse using Maven Build Configuration.

7 - After the execution the report can be viewed using Spark.html or ExtentPdf.pdf.
