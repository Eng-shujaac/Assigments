public class TestProgram {
    public static void main(String[] args) {
        Person person = new Person("ahmed", "adrees daynile", "333-333-33", "ahmed@example.com");
        Student student = new Student("HamdaMohamed", "adress hodan", "99-999-999", "hamada@example.com", Student.FRESHMAN);
        MyDate dateHired = new MyDate("2024-01-01");
        Employee employee = new Employee(" Ali", "adress yaqshiid", "555-555-5557", "ali@example.com", "Xafiiska 2aad", 1000, dateHired);
        Faculty faculty = new Faculty("Fatima Ibrahim", "9-5", "555-555-555", "Fatima@gmai.com","Xafiiska 4aad", 1355, dateHired, "100","1");
        Staff staff = new Staff("Aisha Nur", "Secretary", "555-555-555", "Aisha@gmail.com","Xafiisla 3aad", 1567, dateHired, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

    }
}
