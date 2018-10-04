package tasksLesson5;

public class TesterMain {

	public static void main(String[] args) {
		Tester tester1 = new Tester();
		Tester tester2 = new Tester("Erik");
		Tester tester3 = new Tester("Karl", "Varok");
		Tester tester4 = new Tester("Alex", "Lesley", 10);
		Tester tester5 = new Tester("Margaret", "Wilson", 20, "Native");
		Tester tester6 = new Tester("Elena", "Salmon", 17, "Intermidiate");
		Tester tester7 = new Tester("Tim", "Richards", 11, "Advance", 3060);
	Tester.printTesterInformation(tester2);
	Tester.printTesterInformation(tester7);
	}

}
