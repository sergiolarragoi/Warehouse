package warehouse;

import java.util.ArrayList;

public class Invoice implements Invoicing {

	// Attributes:
	
	int code;
	String name, surname;
	ArrayList<InvoiceLine> lines;
	double total;

}
