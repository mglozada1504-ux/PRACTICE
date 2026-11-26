public class Family{

    String firstName;
    String lastName;
    char middleName;
    int age;
    String course;
    String campus;

    Family(String firstname,String lastname,char middlename,int old,String program,String school){

    firstName = firstname;
    lastName = lastname;
    middleName = middlename;
    age = old;
    course = program;
    campus = school;

    System.out.println(" ");

    System.out.println("I'am " + firstName + " " + middleName + " " + lastName);
    System.out.println(age + " years old");
    System.out.println("Currently taking the course of " + course);
    System.out.println("School: " + campus);
    
    }


    


}