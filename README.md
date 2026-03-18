# CSCI160-EXAM2
Exam 2 Questions for CSCI 160
## Q1 Instructions - Team Object  
Write a class encapsulating the concept of a team.  For example, the Baltimore Orioles.  The team has two attributes, the team name and the team hometown.  Include a constructor, the accessor and mutator and the methods `toString` and `equals`.  A client class `TeamClient.java` is provided to test your code.  All of your work for this problem should be done in `Team.java`.  Do not make **ANY** changes to `TeamClient.java`  You can use the Run and Debug button to test your code.  
**Note:** The full expected output is provided and checked for Test 4.  Tests 1-3 serve as your checkpoints to look for individual pieces of correct code.
### Q1 Test 1 - Checking setName() and setHometown()  
**Input:**  
*none*  
**Output:**  
```
The name of team #1 is Baltimore Orioles
```
### Q1 Test 2 - Checking toString()  
**Input:**  
*none*  
**Output:**  
```
Team #2: New York Yankees
```

### Q1 Test 3 - Checking .equals()  
**Input:**  
*none*  
**Output:**  
```
Setting team #2 name to Orioles.
Team #1: Baltimore Orioles
New Team #2: New York Orioles
Original team #1 and modified team #2 are different.
```

### Q1 Test 4 - Full Program
**Input:**  
*none*  
**Output:**  
```
The name of team #1 is Baltimore Orioles
Team #2: New York Yankees
Original teams #1 and #2 are different.

Setting team #2 name to Orioles.
Team #1: Baltimore Orioles
New Team #2: New York Orioles
Original team #1 and modified team #2 are different.

Setting team #2 hometown to Baltimore.
Team #1: Baltimore Orioles
New Team #2: Baltimore Orioles
Original team #1 and modified team #2 are identical.
```

## Q2 Instructions - Return Boolean Array  
Code an array-returning method that takes an array of *ints* as a parameter and returns an array of *booleans*, assining *true* for any element of the parameter array greater than or equal to 100; and *false* otherwise.  
**Note:**  The main method has been provided for you.  All of your work should take place in `intToBoolean()`  
**Hint:**  Test 4 requires you to handle an array of a different size than Tests 1-3.  Keep that in mind as you work.  
### Q2 Test 1 - No True Integers  
**Compile Code:** javac Q2/*.java  
**Run Code:** java -cp Q2 ReturnBooleanArray 1 2 3 4 5 6
**Input:**  
*none*  
**Output:**  
```
The elements of the int array are 1 2 3 4 5 6 
The elements of the boolean array are false false false false false false 
```
### Q2 Test 2 - All True Integers  
**Compile Code:** javac Q2/*.java  
**Run Code:** java -cp Q2 ReturnBooleanArray 110 115 120 125 130 150  
**Input:**  
*none*  
**Output:**  
```
The elements of the int array are 110 115 120 125 130 150 
The elements of the boolean array are true true true true true true 
```  
### Q2 Test 3 - Mixed Integers  
**Compile Code:** javac Q2/*.java  
**Run Code:** java -cp Q2 ReturnBooleanArray 1 115 3 125 4 150  
**Input:**  
*none*  
**Output:**  
```
The elements of the int array are 1 115 3 125 4 150 
The elements of the boolean array are false true false true false true  
```  

### Q2 Test 4 - Even More Integers  
**Compile Code:** javac Q2/*.java  
**Run Code:** java -cp Q2 ReturnBooleanArray 1 1 112 2 2 223 3 3 334 4 4 445  
**Input:**  
*none*  
**Output:**  
```
The elements of the int array are 1 1 112 2 2 223 3 3 334 4 4 445 
The elements of the boolean array are false false true false false true false false true false false true 
```

## Q3 Instructions - Letter Grades  
Write a method that takes an *ArrayList* of *Integer* objects and returns an *ArrayList* of *Character* objects of the same size.  The returned elements of the *ArrayList* are assigned a letter grade corresponding to the integer grade of the same index element of the *ArrayList* parameter.  For example: A if 90 or above, B if 80 or above...etc with F if less than 60.  
**Note:**  The main method and two print methods have been provided for you.  All of your work should take place in `convertToLetterGrades()`  
**Hint:**  Test 4 requires you to handle an arrayList of a different size than Tests 1-3.  Keep that in mind as you work.   
### Q3 Test 1 - All A's
**Compile Code:** javac Q3/*.java  
**Run Code:** java -cp Q3 LetterGrades 90 92 94 96 98  
**Input:**  
*none*  
**Output:**  
```
The integer grades are:
90 
92 
94 
96 
98 

The letter grades are:
A 
A 
A 
A 
A 
```

### Q3 Test 2 - All A', B's and C's
**Compile Code:** javac Q3/*.java  
**Run Code:** java -cp Q3 LetterGrades 90 92 80 75 98  
**Input:**  
*none*  
**Output:**  
```
The integer grades are:
90 
92 
80 
75 
98 

The letter grades are:
A 
A 
B 
C 
A 
```  
### Q3 Test 3 - All Grades Included
**Compile Code:** javac Q3/*.java  
**Run Code:** java -cp Q3 LetterGrades 90 84 73 62 50  
**Input:**  
*none*  
**Output:**  
```
The integer grades are:
90 
84 
73 
62 
50 

The letter grades are:
A 
B 
C 
D 
F 
```
### Q3 Test 4 - New Students Added
**Compile Code:** javac Q3/*.java  
**Run Code:** java -cp Q3 LetterGrades 90 84 73 62 50 68 78 88 98  
**Input:**  
*none*  
**Output:**  
```
The integer grades are:
90 
84 
73 
62 
50 
68 
78 
88 
98 

The letter grades are:
A 
B 
C 
D 
F 
D 
C 
B 
A 
```
## Q4 Instructions - Game Class Inheritance  
Write a class encapsulating a board game, which inherits from *Game.java*.  A board game has the following additional attributes: the minimum number of players, the maximum number of players and whether there is a time limit to finish the game.  Code the constructor and the *toString* method of the new class.  `BoardGameClient.java` is provided to test your code.  Do not make *ANY* changes to `Game.java` or `BoardGameClient.java`.  You can use the Run and Debug button to test your code.  
**Note:** The full expected output is provided and checked for Test 4.  Tests 1-3 serve as your checkpoints to look for individual pieces of correct code.  
### Q4 Test 1 - Implementing old toString from Game.java
**Input:**  
*none*  
**Output:**  
```
Board Game 1:
Description: Chess
```
### Q4 Test 2 - Implementing new toString in BoardGame.java
**Input:**  
*none*  
**Output:**  
```
Board Game 1:
Description: Chess
Minimum players: 2; Maximum players: 2; Is time limited: true
Board Game 2:
Description: Monopoly
Minimum players: 2; Maximum players: 6; Is time limited: false
```

### Q4 Test 3 - Implementing .equals()  
**Input:**  
*none*  
**Output:**  
```
Setting BG2 number of players to 2 and adding a time limit:
New Board Game 2:
Description: Monopoly
Minimum players: 2; Maximum players: 2; Is time limited: true
bg1 and bg2 are not equal
```  

### Q4 Test 4 - Full Program Check 
**Input:**  
*none*  
**Output:**  
```
Board Game 1:
Description: Chess
Minimum players: 2; Maximum players: 2; Is time limited: true
Board Game 2:
Description: Monopoly
Minimum players: 2; Maximum players: 6; Is time limited: false

Setting BG2 number of players to 2 and adding a time limit:
New Board Game 2:
Description: Monopoly
Minimum players: 2; Maximum players: 2; Is time limited: true
bg1 and bg2 are not equal

Setting BG2 description to Chess:
New Board Game 2:
Description: Chess
Minimum players: 2; Maximum players: 2; Is time limited: true
bg1 and bg2 are now equal
```  
## Q5 Instructions - Counting Lines in a File  
Write a program that reads a file and counts how many lines it contains.  
**Note:**  Test 4 purposely sends your program to a file that does not exist.  How will you handle the FileNotFound Exception?  
### Q5 Test 1 - using dataFile
**Compile Code:** javac Q5/*.java  
**Run Code:** java -cp Q5 CountTextFileLines Q5/dataFile.txt  
**Input:**  
*none*  
**Output:**  
```
The number of lines in Q5/dataFile.txt is 6
```
### Q5 Test 2 - using spaceFile
**Compile Code:** javac Q5/*.java  
**Run Code:** java -cp Q5 CountTextFileLines Q5/spaceFile.txt  
**Input:**  
*none*  
**Output:**  
```
The number of lines in Q5/spaceFile.txt is 11
```

### Q5 Test 3 - using emptyFile
**Compile Code:** javac Q5/*.java  
**Run Code:** java -cp Q5 CountTextFileLines Q5/emptyFile.txt  
**Input:**  
*none*  
**Output:**  
```
The number of lines in Q5/emptyFile.txt is 0
```

### Q5 Test 4 - using wrongFile
**Compile Code:** javac Q5/*.java  
**Run Code:** java -cp Q5 CountTextFileLines Q5/wrongFile.txt  
**Input:**  
*none*  
**Output:**  
```
Unable to find Q5/wrongFile.txt, exiting
```
