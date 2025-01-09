package Interface;

public class Student extends Person{

    String previousOrganizations;
    int skippedDays;

    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Student(String name, int age, String gender, String previousOrganizations, int skippedDays) {
        super(name, age, gender);
        this.previousOrganizations = previousOrganizations;
        this.skippedDays = skippedDays;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + name + " a " + age + " year old " + gender + " from " + previousOrganizations +
                " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays){
        this.skippedDays += numberOfDays;
    }

}
