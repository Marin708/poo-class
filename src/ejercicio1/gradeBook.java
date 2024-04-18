package ejercicio1;

public class gradeBook {
    private String courseName;
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String displayMessage(){
        return "welcome to the gradebook, course name is: " + getCourseName();
    }


}
