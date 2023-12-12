package PracticeJava.Collection;
import java.util.ArrayList;
import java.util.List;

public class Student
{
    String name;

    String id;

    List<Course> enrolledCourses = new ArrayList<>(  );
    List<Course> unEnrolledCourses = new ArrayList<>(  );


    public Student( String name, String id )
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public void enroll(Course course){
    	if (!enrolledCourses.contains(course)) {
    		enrolledCourses.add( course );
    	}
    }

    public void unEnroll(Course course){
    	if (enrolledCourses.contains(course)) {
    		enrolledCourses.remove( course );
    	}
    }

    public int totalEnrolledCourses(){
    	return enrolledCourses.size();

    }

    public List<Course> getEnrolledCourses()
    {
        return enrolledCourses;
    }
    
    public List<Course> getunEnrolledCourses()
    {
        return unEnrolledCourses;
    }


    @Override
    public String toString()
    {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", enrolledCourses=" + enrolledCourses
            + '}';
    }
}
