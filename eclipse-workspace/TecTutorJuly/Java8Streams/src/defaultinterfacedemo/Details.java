package defaultinterfacedemo;

public interface Details {
	public void personalDetails();
	public  default void EducationDetails()
	{
		System.out.println("This is new method for eductation details");
	}
	public static   void data()
	{
		
	}
}
