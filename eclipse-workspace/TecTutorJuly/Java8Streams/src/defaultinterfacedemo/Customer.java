package defaultinterfacedemo;

public class Customer implements Details{

	@Override
	public void personalDetails() {
		System.out.println("Personal Details for Customer");
		
	}
	@Override
	public void EducationDetails()
	{
		System.out.println("Specific functionality for Customer");
		
	}

}
