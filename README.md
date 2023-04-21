# CollectionsAssignment1NKXGEN


Practice Exercise on Collections 
1. Create a Student class with following members and methods.
-int regNo
-String fullName
-Date dob
-String branch
-float CGPA
-short yearOfPass
void displayProfile()
2. Create a class MyTeam with a member 
List<Stutdent> team
and create a zero argument constructor to initialize the team member with with 10 different student 
objects.
3. Add the following instance methods to MyTeam class
void sortAndPrintByDOB() -Sort the students by their dob and print
void sortAndPrintByCGPA() -Sort the students by their CGPA -use Lambda
4. Create a class MyBatch with a member
HashMap<Student,<HashMap<int,float>> semWiseMarks
And add constructor to initialize the semWiseMarks member with atleast 4 semester marks.
5. Add the following method 
void displaySemWiseMarks() -Display sem wise score for all students
6. Write a class MyGameTeam extending MyTeam class with following Members and methods
Queue<GameScore> gameScores -member to store different game scores
void setScore(GameScore gscore) -to set the score to gameScores
GameScore getScore() -to read the score from gameScores
class GameScore{
String gameName;
int score;
}
7. Create a PlayerThread class with the constructor to accept MyGameTeam as an object
and add some random scores to the recieved MyGameTeam object through setScore() method
under the run() method of thread.
8. Create a ScoreReaderThread class with the constructor to accept MyGameTeam as an object
and read the scores of MyGameTeam object.
9. Write a class to demonstrate the usage of concurrent Queue by adding different gamescores
by different PlayerThreads and subsequently read the scores by using ScoreReaderThread.
