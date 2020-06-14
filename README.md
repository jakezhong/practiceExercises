# CS601 Practice exercises

I encourage incoming MSCS students to complete these Java practice problems before the beginning of the semester. 
In this set of problems, you will practice using the following:

- Java Basics: Classes&Objects, Methods, Conditionals, Iteration, Strings, Arrays, ArrayLists 
- Tools: IntelliJ, Maven, Github, JUnit

:warning: **It is expected that you solve these problems *without* looking up solutions or partial solutions on the Internet.**

## Getting Started
- Install Java 12 (you need JDK) and IntelliJ IDE (free Community edition), and create an account on Github if you don't have one. Please use your USF email for the Github account, if possible.
- Click on the following link to create your private repository for this exercise:
That repository will be seeded with the starter code for this exercise and test cases. 
- Clone a copy of the repository to your local machine (you can do it from IntelliJ by selecting VCS -> Checkout from Version Control -> Git and following the instructions).
- Work on the problems in IntelliJ. Run the tests provided by the instructor.
- Commit and Push your code frequently as you work on the problems. You can commit & push code to your github repository directly from IntelliJ: choose VCS->Git->Commit Directory; then in the bottom right corner, select Commit and Push. Go to this directory in the browser and verify that your final solution is what you see on Github. (This step is optional for the practice exercises).

## Problems
The starter code for the practice exercises is in the following folders: 
- src/main/java/practiceArrays
- src/main/java/practiceStrings
- src/main/java/practiceOOP

### practiceArrays
This folder contains the class `ArrayHelper` where you need to fill in code in several simple array manupulation methods.
The comment above each method explains what the method is supposed to do.
You can test these methods by running JUnit tests provided in class `ArrayHelperTest` located in the following folder: `src/test/java/practiceArrays` 

### practiceStrings
This folder contains the class `StringHelper` where you need to fill in code in several basic string manupulation methods.
The comment above each method explains what the method is supposed to do.
You can test these methods by running JUnit tests provided in class `StringHelperTest` located in the following folder: `src/test/java/practiceStrings`.

### practiceOOP
This folder contains classes `Student`, `University` and `Driver`. Fill in code in methods of classes `Student` and `University`.  The comment above each method explains what the method is supposed to do.
This folder also contains a csv file that contains information about several students. You can use it to test your code.
The instructor provided basic JUnit tests in `StudentTest` and `UniversityTest` classes in `src/test/java/practiceOOP` to test classes `Student` and `University`.

