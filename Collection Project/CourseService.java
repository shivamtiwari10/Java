package PracticeJava.Collection;

import java.util.HashMap;

public class CourseService
{
    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, Course> courses = new HashMap<>();


    public CourseService()
    {
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    public void enrollStudent(String studentId, String courseId){
        //TODO implement so it adds the given course form the student
    	
    	if(students!=null && courses!=null) {
    		Student student = students.get(studentId);
            Course course = courses.get(courseId);
    		student.enroll(course);
    		System.out.println("Student " + student.getName() + " enrolled in course "+course.name);
    	}
    	else {
    		System.out.println("Invalid student ID or course ID");
    	}
    }

    public void unEnrollStudent(String studentId, String courseId){
        //TODO implement so it removes the given course form the student
    	if(students!=null && courses!=null) {
        	Student student = students.get(studentId);
            Course course = courses.get(courseId);
    		student.unEnroll(course);
    		System.out.println("Student " + student.getName() + " unenrolled from course "+course.name);
    	}
    }

    public void displayCourseInformation(String courseId){
        //TODO implement so it shows the course name, id and credits
    	Course course = courses.get(courseId);

    	if (course != null) {
    		System.out.println("-----------------------------");
            System.out.println("Course Information:");
            System.out.println("-----------------------------");
            System.out.println("Course Name: " + course.getName());
            System.out.println("Course ID: " + course.getId());
            System.out.println("Course Credits: " + course.getCredits());
        } else {
            System.out.println("Course not found.");
        }

    }

    public void displayStudentInformation(String studentId){
        //TODO implement so it shows the student name, id and list of enrolled courses
    	Student student = students.get(studentId);

    	if (student != null) {
    		System.out.println("-----------------------------");
            System.out.println("Student Information:");
            System.out.println("-----------------------------");
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student ID: " + student.getId());

            for (Course course : student.getEnrolledCourses()) {
            	System.out.print("Enrolled Courses:");
                System.out.println(" - " + course.getName());
            }
        } else {
            System.out.println("Student not found.");
        }
    }


}
