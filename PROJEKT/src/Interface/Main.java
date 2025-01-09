package Interface;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jane Doe",30,"female");
        Student student1 = new Student("Jane Doe", 30, "female", "The School of Life" , 0);
        Mentor mentor1 = new Mentor("Jane Doe",30, "female", "intermediate");
        Sponsor sponsor1 = new Sponsor("Jane Doe", 30, "female", "Google", 0);
        Cohort cohort1 = new Cohort("Trieda");

        cohort1.addMentor(mentor1);
        cohort1.addStudent(student1);


        sponsor1.hire();
        sponsor1.hire();
        sponsor1.hire();
        sponsor1.hire();

        sponsor1.introduce();



    }
}
