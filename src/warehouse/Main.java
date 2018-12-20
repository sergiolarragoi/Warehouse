package warehouse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = -1;

		Scanner reader = new Scanner(System.in);
		
		ArticlesList listArticles = new ArticlesList();

		listArticles.load("src/data/artikuloak.txt");

		while (opcion != 0) {
			System.out.println("......................");
			System.out.println(" GESTION VENTA DE ARTICULOS");
			System.out.println("......................");
			System.out.println("1-Hacer una venta (crear factura)");
			System.out.println("2-Listar todos los art�culos.");
			System.out.println("3-Ver los art�culos saludables.");
			System.out.println("4-Sacar una lista de art�culos con precio equivalente.");
			System.out.println("5-Ver el art�culo m�s caro");
			System.out.println("6-Ver los art�culos con poco stock.");
			System.out.println("0-Salir");
			System.out.println("......................");
			System.out.println(" Tu opci�n (1-6) Salir-0:");
			System.out.println("......................");
			try {
				opcion = Integer.parseInt(reader.nextLine());
				switch (opcion) {
				case 1: // 1-Hacer una venta (crear factura)

					break;
				case 2: // 2-Listar todos los art�culos.

					listArticles.viewArticles();

					break;
				case 3: // 3-Ver los art�culos saludables.

					break;
				case 4: // 4-Sacar una lista de art�culos con precio equivalente.

					break;
				case 5: // 5-Ver el art�culo m�s caro

					break;
				case 6: // 6-Ver los art�culos con poco stock.

					break;

				case 0: // 0-Salir

					break;

				default:
					System.out.println("Eleccion incorrecta");

				}
			} catch (Exception e) {
				System.out.println("No se admiten letras");
			}
		}
		reader.close();
		System.out.println(" A   M   A   I   E   R   A   !   !   !");

	}

}
