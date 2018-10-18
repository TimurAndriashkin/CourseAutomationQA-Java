package third_package;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AdditionalTesterMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		Constructor<AdditionalTester> constructor = AdditionalTester.class.getDeclaredConstructor();

		constructor.setAccessible(true);

		AdditionalTester tester = constructor.newInstance();

		tester.printText();

	}

}
