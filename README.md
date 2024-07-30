# Getting Started
 
1. **Clone the Repository**
   - Use the command `git clone <repository_url>` to clone the repository into your local machine.
   - Ensure all dependencies are downloaded and updated.
 
2. **System Requirements**
   - Java 8 or above
   - Git
   - Maven
 
3. **Install Plugins**
   - Install the Cucumber and TestNG plugins in your IDE.
 
4. **Convert to Maven Cucumber Project**
   - After downloading the repository, convert the project to a Maven Cucumber project.
 
# Features
 
1. **BDD Cucumber Framework**
2. **Page Object Model (POM)**
3. **Selenium Java (Selenium 4)**
4. **TestNG Framework**
5. **Maven Build Automation Tool**
 
# Points to be Followed
 
1. **Hybrid Framework**
   - This project uses a combination of BDD Cucumber framework, Page Object Model, Selenium Java, and TestNG, along with Maven Build Automation Tool.
 
2. **Project Structure**
   - Feature files (with test steps) are located in the `src/test/resources` source folder.
   - Step definitions, Hooks, and Runner classes are in the `src/test/java` source folder.
   - Utility classes like WebDriver factory, config reader, and Page classes are in the `src/main/java` source folder.
 
3. **Test Execution**
   - Cucumber + TestNG is used to run test feature files.
   - The runner class is located at `src/test/java/com/runners/TestNGRunner.java`.
 
4. **Reporting**
   - Extent reports in both HTML and PDF formats are used for reporting.
   - After execution, detailed reports will be available in the `test-output -> pdfReport/SparkReport` folders.
 
5. **Running Tests**
   - To execute test cases, directly run the runner file `TestNGRunner.java` with TestNG Test.
   - To execute test cases using Maven, run the command `clean verify` using Maven command line or directly in Eclipse using Maven Build Configuration.
 
6. **Viewing Reports**
   - After execution, view the report using `Spark.html` or `ExtentPdf.pdf` located in the `test-output` folder.
