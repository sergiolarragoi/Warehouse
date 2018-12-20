package warehouse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArticlesList {

	private ArrayList<Article> list = new ArrayList<Article>();

	public ArticlesList() {
		super();
	}

	public ArrayList<Article> getList() {
		return list;
	}

	public void setList(ArrayList<Article> list) {
		this.list = list;
	}

	public void load(String path) {

		String[] splitLine;

		String line;

		try {
			File fich = new File(path);
			Scanner sc = new Scanner(fich);

			while (sc.hasNextLine()) {

				line = sc.nextLine();
				splitLine = line.split("::");

				if (splitLine[0].toUpperCase().contains("FRES")) {

					Refresh newRefresh = new Refresh(splitLine[0], splitLine[1], splitLine[2],
							Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]),
							Integer.parseInt(splitLine[5]), splitLine[6], Boolean.parseBoolean(splitLine[7]),
							Boolean.parseBoolean(splitLine[8]), Integer.parseInt(splitLine[9]));

					list.add(newRefresh);

				} else if (splitLine[0].toUpperCase().contains("ARDO")) {
					
					Wine newWine = new Wine(splitLine[0], splitLine[1], splitLine[2], Double.parseDouble(splitLine[3]),
							Integer.parseInt(splitLine[4]), Integer.parseInt(splitLine[5]), splitLine[6], splitLine[7],
							Integer.parseInt(splitLine[8]), splitLine[9]);
					list.add(newWine);
				}
			}
			sc.close();

		} catch (FileNotFoundException e) {

			System.out.println("Fichero no existe...");
		}
	}

	public void viewArticles() {
		System.out.println("______________________________________________");
		
		for (Article aux : list) {
			aux.seeFeatures();
			System.out.println("______________________________________________");
		}
	}

}
