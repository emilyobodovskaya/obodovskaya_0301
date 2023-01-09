
public class Person {
    String firstName;
    String lastName;
    String  age;
    String gender;
    String address;

    public Person (String a, String b, String c) {
        firstName = a;
        lastName = b;
        age = c;
        System.out.println(firstName + lastName + age ) ;
    }
    public Person (String a, String b) {
        firstName = a;
        gender = b;
        System.out.println(firstName + gender) ;
    }
    public Person (String a, String b, String c, String d, String e) {
        firstName = a;
        lastName = b;
        age = c;
        gender = d;
        address = e;
        System.out.println(firstName + lastName + age + gender + address) ;
    }

    public Person(String s1, String s2, String s, String s3) {
        System.out.println(s1 + s2 + s + s3 ) ;

    }
    public void personInfo() {


    }
}