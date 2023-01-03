public class Main {
    public static void main(String[] args) {
        Person person = new Person ("Will", "Smith", "New York", "2936729462846" );

        Person person2 = new Person ("Jackie", "Chan", "Shanghai", "1231241241" );

        Person person3 = new Person("Sherlock", "Holmes", "London", "2936729462846");

        person.personInfo();
        person2.personInfo();
        person3.personInfo();
    }
}