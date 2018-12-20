package warehouse;

public class Refresh extends Article {

	// Attributes:
	
	private String taste;
	private boolean juice;
	private boolean gas;
	private int sugar;

	// Constructor:
	
	public Refresh(String code, String name, String mark, double price, int unitsBox, int stock, String taste,
			boolean juice, boolean gas, int sugar) {
		super(code, name, mark, price, unitsBox, stock);
		this.taste = taste;
		this.juice = juice;
		this.gas = gas;
		this.sugar = sugar;

	}

	// Methods:
	
	@Override
	public void seeFeatures() {
		
		super.imprimeCabecera();
		System.out.println("Sabor-----> " + this.taste);
		System.out.println("Sabor-----> " + this.juice);
		System.out.println("Tipo-----> " + gas);
		System.out.println("Azucar-----> " + sugar);

	}

	@Override
	public boolean healthy() {
		// TODO Auto-generated method stub
		return false;
	}

}
