package warehouse;

public class Wine extends Article {

	// Attributes:

	private String colour;
	private String origin;
	private int year;
	private String grapeKind;

	// Constructor:

	public Wine(String code, String name, String mark, double price, int unitsBox, int stock, String colour,
			String origin, int year, String grapeKind) {
		super(code, name, mark, price, unitsBox, stock);
		this.colour = colour;
		this.origin = origin;
		this.year = year;
		this.grapeKind = grapeKind;
	}

	// Methods:

	@Override
	public void seeFeatures() {
		super.imprimeCabecera();
		System.out.println("Color-----> " + colour);
		System.out.println("Origen-----> " + origin);
		System.out.println("Año-----> " + year);
		System.out.println("Uva-----> " + grapeKind);
	}

	@Override
	public boolean healthy() {
		// TODO Auto-generated method stub
		return false;
	}

}
