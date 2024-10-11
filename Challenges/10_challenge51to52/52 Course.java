
// 52. Design a Course class.
// . Instance variables: courseName, enrolledStudents.
// . Static variable: maxCapacity, the maximum number of students for any
// course.
// . Instance methods: enrollStudent(String studentName),
// unenrollStudent(String studentName).
// . Static method: setMaxCapacity(int capacity), to set the maximum
// capacity for courses.

class Course {
    static int maxCapacity = 100; // consider by default
    String courseName;
    int enrolledStudents;
    String[] totalEnrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrolledStudents = 0;
        this.totalEnrolledStudents = new String [maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        totalEnrolledStudents[enrolledStudents] = studentName;
        enrolledStudents++;
        System.out.println(this.enrolledStudents+" students enrolled successfully!! and the course name is : "+this.courseName);
    }

    void unenrollStudent(String studentName) {
        System.out.println("Students removed");
        enrolledStudents--; 
    }

    public static void main(String[] args) {
        Course myCourse = new Course("B.Tech");
        myCourse.enrollStudent("Nitya");
        myCourse.enrollStudent("Satya");
        
    }

}


// Outputs : 
// 1 students enrolled successfully!! and the course name is : B.Tech
// 2 students enrolled successfully!! and the course name is : B.Tech