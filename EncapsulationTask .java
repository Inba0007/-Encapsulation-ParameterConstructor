class School
{
private String name;
	public String getname() 
{
	return name;
}
private int age;
	public int getage()
	{
		return age;
	}
	
public void setname(String name)
{
this.name=name;
}
public void setage(int age)
{
	this.age=age;
}
}
public class EncapsulationTask {

	public static void main(String[] args) {
		 School S=new  School(); 
		S.setname("inba");
		S.setage(21);
		System.out.println("name is"+" "+S.getname());
		System.out.println("the age is "+" "+S.getage());
	}

}
