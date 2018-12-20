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
			System.out.println("2-Listar todos los artículos.");
			System.out.println("3-Ver los artículos saludables.");
			System.out.println("4-Sacar una lista de artículos con precio equivalente.");
			System.out.println("5-Ver el artículo más caro");
			System.out.println("6-Ver los artículos con poco stock.");
			System.out.println("0-Salir");
			System.out.println("......................");
			System.out.println(" Tu opción (1-6) Salir-0:");
			System.out.println("......................");
			try {
				opcion = Integer.parseInt(reader.nextLine());
				switch (opcion) {
				case 1: // 1-Hacer una venta (crear factura)

					break;
				case 2: // 2-Listar todos los artículos.

					listArticles.viewArticles();

					break;
				case 3: // 3-Ver los artículos saludables.

					break;
				case 4: // 4-Sacar una lista de artículos con precio equivalente.

					break;
				case 5: // 5-Ver el artículo más caro

					break;
				case 6: // 6-Ver los artículos con poco stock.

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
