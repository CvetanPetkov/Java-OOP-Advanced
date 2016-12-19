package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Field[] allFields = RichSoilLand.class.getDeclaredFields();

		while (true) {

			String input = reader.readLine();
			if (input.equals("HARVEST")) {
				break;
			}

			switch (input) {
				case "private":
					for (Field field : allFields) {
						if (field.getModifiers() == 2) {
							System.out.printf("%s %s %s\n",
									Modifier.toString(field.getModifiers()),
									field.getType().getSimpleName(),
									field.getName());
						}
					}
					break;
				case "protected":
					for (Field field : allFields) {
						if (field.getModifiers() == 4) {
							System.out.printf("%s %s %s\n",
									Modifier.toString(field.getModifiers()),
									field.getType().getSimpleName(),
									field.getName());
						}
					}
					break;
				case "public":
					for (Field field : allFields) {
						if (field.getModifiers() == 1) {
							System.out.printf("%s %s %s\n",
									Modifier.toString(field.getModifiers()),
									field.getType().getSimpleName(),
									field.getName());
						}
					}
					break;
				case "all":
					for (Field field : allFields) {
						System.out.printf("%s %s %s\n",
								Modifier.toString(field.getModifiers()),
								field.getType().getSimpleName(),
								field.getName());
					}
					break;
			}
		}

	}
}
