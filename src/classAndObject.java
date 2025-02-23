public class classAndObject {
    public static void main(String[] args) {
student myStudent = new student();
    myStudent.firstName = "Jim";
    myStudent.lastName = "Halpert";
    myStudent.major = "Buisness";
    myStudent.gpa = 2.3;
    myStudent.age = 24;
    myStudent.onProbration = false;

        student myStudent2 = new student();
        myStudent2.firstName = "Pam";
        myStudent2.lastName = "Beasley";
        myStudent2.major = "Art";
        myStudent2.gpa = 2.5;
        myStudent2.age = 23;
        myStudent2.onProbration = true;

        book action = new book();
        action.author= "Sandra Smith";
        action.pages= 202;
        action.publisher= "Hot Action Publication";
        action.year=2015;
        action.title = "Paris With Love";

    System.out.println(myStudent.gpa);
    System.out.println(myStudent2.gpa);
    System.out.println(action.title);
    }
}