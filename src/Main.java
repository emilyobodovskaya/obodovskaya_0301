public class Main {
    public static void main(String[] args) {
        Person person = new Person ("Will", " Smith", " 49");

        Person person2 = new Person ("Jackie", " the man");

        Person person3 = new Person("Sherlock", " Holmes"," 42", " is a man", " in London");

        Person person4 = new Person("Michael", " the man", " in London");

        Person person5 = new Person ("Anna", " Johnson"," 20" , " is a women");

        person.personInfo();
        person2.personInfo();
        person3.personInfo();
        person4.personInfo();
        person5.personInfo();
    }
}