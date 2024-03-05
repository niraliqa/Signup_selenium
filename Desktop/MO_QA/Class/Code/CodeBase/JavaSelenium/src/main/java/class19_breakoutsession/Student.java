package class19_breakoutsession;

class Student 
{
    private String firstName;
    private String lastName;
    private int studentID;
    private String email;
    private String[] courses;

    public Student(String firstName, String lastName, int studentID, String email, String[] courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.email = email;
        this.courses = courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getEmail() {
        return email;
    }

    public String[] getCourses() {
        return courses;
    }
    
  
    public static void displayStudentInfo(Student student) 
    {
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Courses: ");
        for (String course : student.getCourses()) 
        {
            System.out.println("  - " + course);
        }
    }
    
  
    public static void searchStudentByID(Student[] students, int searchID) 
    {
        boolean found = false;

        for (Student student : students) 
        {
            if (student.getStudentID() == searchID) 
            {
                found = true;
                
                System.out.println("Student found with ID " + searchID + ":");
                
                displayStudentInfo(student);
                
                break; // Student found, no need to continue searching
            }
        }

        if (!found) {
            System.out.println("Student with ID " + searchID + " not found.");
        }
    }

    
}