public class Car{
	public static String companyName="Honda";
	public String carModel="Civic";
public static void main(String args[])
{
	System.out.println("Company :"+Car.companyName);
	Car car1 = new Car();
	Car car2 = new Car();
	System.out.println("Car 1 Model:"+car1.carModel);
	car2.carModel="Accord";
	System.out.println("Car 2 Model:"+car2.carModel);
}
}
	
	
