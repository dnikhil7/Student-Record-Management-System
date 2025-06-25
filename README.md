# Student-Record-Management-System

Objective
A simple Command-Line Interface (CLI) based CRUD application to manage student records using Java. Users can add, view, update, and delete student details using menu-driven options.

Tools & Technologies
Language: Java

IDE: VS Code / IntelliJ IDEA Community Edition

Data Storage: In-memory using ArrayList

Features / Functionality
Add Student – Register a new student by entering ID, name, and marks.

View Student – Retrieve student details based on student ID.

Update Marks – Modify the marks of an existing student.

Delete Student – Remove a student record using student ID.

Structure & Hints
Create a Student class with fields:

int id

String name

int marks

Use ArrayList<Student> to store and manage student records in memory.

Provide a user-friendly CLI menu using Scanner to perform:

Add

View

Update

Delete operations

How to Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/dnikhil7/Student-Record-Management-System.git
Open the project in Eclipse or IntelliJ.

Run the TestStudent.java file (contains the main method).

Note
This project uses in-memory data storage and does not persist data across runs.

Can be extended the project by adding file handling or integrating a database (e.g., MySQL, SQLite).
