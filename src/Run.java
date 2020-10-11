import java.util.Scanner;
public class Run {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        //using Student class :

        Student std1 = new Student("Ehsan " , "Edalat" , "9031066");
        Student std2 = new Student("SEYED " , "Ahmadpanah" , "925464");
        std1.setGrade(15);
        std1.print();
        std2.setGrade(19);
        std2.setFirstName("Seyed");
        std2.print();


        Student std3 = new Student(scanner.next() ,scanner.next() , scanner.next() );
        std3.print();
    }
}
