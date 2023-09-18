package statickeyword;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Student s1=new Student();
        s1.name="Arun";
        s1.setAge((byte)25);
        s1.roll_number=1;
        s1.print();

        Student s2=new Student();
        s2.print();

        s1.print(s2);

        Student s3=new Student("Viraj", (byte)22, 2);
        s3.print();

        System.out.println(Student.count);
        System.out.println(s3.count);
		
	}

}
