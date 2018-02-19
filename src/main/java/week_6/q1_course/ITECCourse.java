package week_6.q1_course;

import java.util.ArrayList;

/**
 * Stores data about an ITECCourse.
 *
 */

public class ITECCourse {

// Data that an ITECCourse object needs to store

// It's often best to make instance variables private

    private String name;

    private int code;

    private int maxStudents;





    private ArrayList<String> students;



// TODO Part 1 add a variable called classroom to store the classroom number a ITECCourse meets in



    private String classroom;



// TODO add get and set methods for the classroom variable



    public String getClassroom() {

        return classroom;

    }

    public void setClassroom(String classroom) {

        this.classroom = classroom;

    }





// Get and set methods for private variables

// Only provide if other classes will need to modify these variables!

// Common to only provide get methods to read the values, or only

// methods for a subset of all of the class variables.

    public int getMaxStudents() {

        return maxStudents;

    }



    public void setMaxStudents(int maxStudents) {

        this.maxStudents = maxStudents;

    }



    public int getCode() {

        return code;

    }



    public void setCode(int code) {

        this.code = code;

    }



    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }



    public ArrayList<String> getStudents() {

        return students;

    }

// Notice no set method for getStudents. To modify, have to use th addStudent and removeStudent methods.





// TODO part 1 create a new constructor. It will have the same arguments

// as this constructor, plus one more: a String to set the classroom variable.

// Don't delete the current constructor.

// Is your code repetitive? You can call one constructor from another. this(arg1, arg2, arg3)

// calls another constructor for this class.





    public ITECCourse(String courseName, int courseCode, int courseMaxStudents,String classroom) {

        this.name = courseName;

        this.code = courseCode;

        this.students = new ArrayList<>(); //Set up the students list

        this.maxStudents = courseMaxStudents;

        this.classroom= classroom;

    }





    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {

        this.name = courseName;

        this.code = courseCode;

        this.students = new ArrayList<>(); //Set up the students list

        this.maxStudents = courseMaxStudents;

    }







// Instance methods. If other classes will need to call these for your

// ITECCourse objects, they need to be public, package-protected or protected

    public void addStudent(String studentName) {



//Check to see if the ITECCourse is full before adding new student

        if (students.size() == maxStudents) {

            System.out.println("Course is full – can't add " + studentName);

            System.out.println("The maximum number of students is " + maxStudents);



        } else {

            students.add(studentName);

        }

    }





    public void removeStudent(String studentName) {

        if (students.contains(studentName)) {

            students.remove(studentName);

            System.out.println(studentName + " was un-enrolled from " + this.name);

        } else {

            System.out.println(studentName + " was not found in " + this.name);

        }

    }






//TODO print the classroom the ITECCourse meets in. If there is no classroom set, what will you print?

//TODO print the number of free spaces in the course







    public void writeCourseInfo() {

        System.out.println("Course Name: " + name);

        System.out.println("Course Code: " + code);

        System.out.println("Students enrolled:");



        for (String student : students) {

            System.out.println(student);

        }







        System.out.println("There are " + getNumberOfStudents() + " students enrolled");

        System.out.println("The max number of students for this ITECCourse is " + maxStudents);





        if("".equals(classroom) || "null".equals(classroom))

            System.out.println("The is no class room " + maxStudents);

        else

            System.out.println("Course classroom: " + classroom);



        System.out.println("Number of Free spaces in the course "+getFreeSpace());







    }








    public int getNumberOfStudents() {

        return this.students.size();

    }


//TODO Part 2 add a method that returns the number of free spaces in this ITECCourse.

    public int getFreeSpace(){



        return maxStudents-this.students.size();

    }


}

