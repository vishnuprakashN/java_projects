public class InterfaceDemo {
	
	public static void main(String[] args){
		BenzCar myobj = new BenzCar();
		myobj.model();
		myobj.vehicleType();
	}
	
}
interface Car{

	public void model();
}

interface Vehicle{

	public void vehicleType();

}

class BenzCar implements Car, Vehicle{
	
	public void model(){
		System.out.println("benz 112");
	}

	public void vehicleType(){
		
		System.out.println("landway vehicle type");
	}
}

