public class ParameterConstructorTask {

		int StudentId;
		int StudentFees;
		String StudentName;
		String StudentCourse;
		String StudentGender;
		ParameterConstructorTask(int id,int fees,String name,String course,String gender)	
{
			StudentId=id;
			StudentFees=fees;
			StudentName=name;
			StudentCourse=course;
			StudentGender=gender;
 }

		public static void main(String[] args) {
			ParameterConstructorTask myobj=new	ParameterConstructorTask(2111,30000,"inba","java","male");
			System.out.println("student name   = "+myobj.StudentName);
			System.out.println("student id     = "+myobj.StudentId);			
			System.out.println("student course = "+myobj.StudentCourse);		
			System.out.println("student gende  = "+myobj.StudentGender);
			System.out.println("student fees   = "+myobj.StudentFees);

}
}