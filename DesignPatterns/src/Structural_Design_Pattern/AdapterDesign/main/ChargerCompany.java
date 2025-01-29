package structuralDesignPattern.AdapterDesign.main;

public class ChargerCompany  implements AppleCharger{

	@Override
	public void chargePhone() {
		System.out.println("ypur iphone is charging!!!");
	}
	

}
