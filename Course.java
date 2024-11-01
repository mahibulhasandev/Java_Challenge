public class Course {
    static int maxCappcity = 100;
    String courseName;
    int enrollments;


    String[] enrooledStudents; 
    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrooledStudents = new String[maxCappcity];
    }


    static void setMaxCapacity(int maxCappcity) {
        Course.maxCappcity = maxCappcity;
    }

    void enrooledStudents(String studnetName) {
        enrooledStudents[enrollments] = studnetName;
        enrollments++;
    }

    void unenroolStudent(String studentname) {
        System.err.println("Student Removed");
        enrollments--;
    }
}
