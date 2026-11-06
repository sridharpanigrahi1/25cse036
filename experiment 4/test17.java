class Person
{
    String name;
    String dob;
    int age;

    Person(String n, String d, int a)
    {
        name = n;
        dob = d;
        age = a;
    }

    void display()
    {
        System.out.println("Name = " + name);
        System.out.println("DOB = " + dob);
        System.out.println("Age = " + age);
    }
}

class Teacher extends Person
{
    double salary;
    String subject;

    Teacher(String n, String d, int a, double s, String sub)
    {
        super(n, d, a);
        salary = s;
        subject = sub;
    }

    void displayTeacher()
    {
        display();
        System.out.println("Salary = " + salary);
        System.out.println("Subject = " + subject);
    }
}

class Student extends Person
{
    int studentId;

    Student(String n, String d, int a, int id)
    {
        super(n, d, a);
        studentId = id;
    }

    void displayStudent()
    {
        display();
        System.out.println("Student ID = " + studentId);
    }
}

class CollegeStudent extends Student
{
    String collegeName;
    int year;

    CollegeStudent(String n, String d, int a, int id,
                   String c, int y)
    {
        super(n, d, a, id);
        collegeName = c;
        year = y;
    }

    void displayCollegeStudent()
    {
        displayStudent();
        System.out.println("College Name = " + collegeName);
        System.out.println("Year = " + year);
    }
}

class test17
{
    public static void main(String args[])
    {
        Teacher t = new Teacher(
            "Amit", "10-05-1980", 46, 50000, "Java"
        );

        Student s = new Student(
            "Rahul", "12-08-2005", 21, 101
        );

        CollegeStudent cs = new CollegeStudent(
            "Rohan", "15-03-2006", 20, 102,
            "ABC College", 2
        );

        System.out.println("TEACHER DETAILS");
        t.displayTeacher();

        System.out.println("\nSTUDENT DETAILS");
        s.displayStudent();

        System.out.println("\nCOLLEGE STUDENT DETAILS");
        cs.displayCollegeStudent();
    }
}