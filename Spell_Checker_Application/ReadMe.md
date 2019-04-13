Version 1.0

**Module 3 Assignment**

Write a program that does spell checking. The program should do spell checking as follows,

The program should accept two text file names on the command line
The program should read both files into string variables. The first is the file to check, and the second is the dictionary. 
(Sample file  testStates.txtPreview the document and  dictionary.txtPreview the document)
Both strings should be split into lists of words (two ArrayList collections)
Implement your main loop.
For each word in the document file, if that word doesn't exist in the dictionary, print it out, saying that it is an unknown word
Submit your source code and a couple of screen shots showing your program in action
Add your spell checker application to your GitHub repo. Submit a screen shot

***Version 2.0***

**Module 7 Assignment**

Update your "spell checker" application. Put a UI on top of the spell checking class.

Try to follow the UI guidelines and practices that you learned about, so that the UI is clean and usable.

Submit your .java files for the application, and a couple of screen shots of your program in action.

***Version 3.0***

**Module 8 Assignment**

Update your "spell checker" application. Add unit testing to the spell checking class.

Submit your .java files for the application, and a couple of screen shots of your unit test results.

***Version 4.0***

**Module 11 Assignment**

Add database support to your spell checking application.

Use the tutorials from "Learning Materials" to learn how to use MySQL Workbench
Add a schema called “spelling”. Add a table called “word”. Then, insert the dictionary’s words like this,
insert into spelling.word (word) values ('the');

insert into spelling.word (word) values ('test');

insert into spelling.word (word) values ('this');

insert into spelling.word (word) values ('a');

select * from spelling.word

Add JDBC support to your Eclipse project
In your spell checker application, instead of reading the dictionary words from a text file, read them from the database
 
