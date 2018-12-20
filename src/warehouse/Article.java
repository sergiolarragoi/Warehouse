package warehouse;

public abstract class Article {

	// Attributes:

	protected String code, name, mark;
	protected double price;
	protected int unitsBox, stock;

	// Constructor:

	public Article(String code, String name, String mark, double price, int unitsBox, int stock) {
		super();
		this.code = code;
		this.name = name;
		this.mark = mark;
		this.price = price;
		this.unitsBox = unitsBox;
		this.stock = stock;
	}

	// Methods:

	public abstract void seeFeatures();

	public abstract boolean healthy();
	// public boolean equivalents(Article art);

	public void imprimeCabecera() {
		System.out.println("Codigo Artículo: " + this.code);
		System.out.println("Nombre Artículo: " + this.name);
		System.out.println("Marca Artículo: " + this.mark);
		System.out.println("Stock-----> " + this.stock);
		System.out.println("Sabor-----> " + this.unitsBox);
		System.out.println("Tipo-----> " + this.stock);

	}

}
