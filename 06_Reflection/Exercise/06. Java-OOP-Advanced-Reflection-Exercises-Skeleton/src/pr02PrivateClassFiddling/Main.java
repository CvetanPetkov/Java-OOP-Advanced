package pr02PrivateClassFiddling;

import pr02PrivateClassFiddling.com.peshoslav.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Class<BlackBoxInt> boxClass = BlackBoxInt.class;
		Constructor ctor = boxClass.getDeclaredConstructor();
		ctor.setAccessible(true);
		BlackBoxInt blackBoxInt = (BlackBoxInt) ctor.newInstance();


		while (true) {

			String[] input = reader.readLine().split("_");
			if (input[0].equals("END")) {
				break;
			}

			String command = input[0];
			int value = Integer.valueOf(input[1]);

			Method method = boxClass.getDeclaredMethod(command, int.class);
			method.setAccessible(true);
			method.invoke(blackBoxInt, value);

			Field field = boxClass.getDeclaredField("innerValue");
			field.setAccessible(true);
			System.out.println(field.get(blackBoxInt));
		}
	}
}
