package first_package;

public class MassiveMain {

	public static void main(String[] args) {
		Massive massive;
		try {
			massive = new Massive(0);
		} catch (ArithmeticException ae) {
			System.out.println("Dividing to 0 ");
		} finally {
			massive = new Massive();
		}
		System.out.println("******************FIRST TASK******************");
		massive.getTryCatch();
		System.out.println("******************SECOND TASK******************");
		massive.getTryCatchCatch();
		System.out.println("******************THIRD TASK******************");
		massive.getMultiCatch();
		System.out.println("******************FOURTH TASK******************");
		massive.getTryCatchFinally();
		System.out.println("******************SECOND TASK (Additional)******************");
		massive.getTryInsideTry();
		System.out.println("******************THIRD TASK (Before Skiping)******************");
		massive.afterSkipingFinallyBlock();
		System.out.println("******************THIRD TASK (After Skiping)******************");
		massive.skipFinallyBlock();

	}

}
