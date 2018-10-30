package first_package;

public class PageMain {

	public static void main(String[] args) {

		Button button1 = new Button("Open");
		Button button2 = new Button("OK");
		Button button3 = new Button("Cancel");
		Button button4 = new Button("Button is replaced");

		Page page = new Page();

		page.addToCollection(button1);
		page.addToCollection(button2);
		page.addToCollection(button3);
		page.removeFromCollection(button3);
		page.replaceFromCollection(0, button4);
		page.printButtonCollection();

		System.out.println("****************************************");

		Field field1 = new Field("Hello");
		Field field2 = new Field("Hello City");
		Field field3 = new Field("Hello Country");
		Field field4 = new Field("Hello World!");

		page.addToCollection(field1);
		page.addToCollection(field2);
		page.addToCollection(field3);
		page.removeFromCollection(field3);
		page.replaceFromCollection(0, field4);
		page.printFieldCollection();

		System.out.println("****************************************");

		Label label1 = new Label("Label");
		Label label2 = new Label("Label better than Label");
		Label label3 = new Label("The Best Label");
		Label label4 = new Label("Super Label");

		page.addToCollection(label1);
		page.addToCollection(label2);
		page.addToCollection(label3);
		page.addToCollection(label4);
		page.removeFromCollection(label2);
		page.replaceFromCollection(label1, label4);
		page.printLabelCollection();

		System.out.println("****************************************");

		Dropdown dropdown1 = new Dropdown("xxx");
		Dropdown dropdown2 = new Dropdown("yyy");
		Dropdown dropdown3 = new Dropdown("zzz");
		Dropdown dropdown4 = new Dropdown("qqq");

		page.addToCollection(0, dropdown1);
		page.addToCollection(1, dropdown2);
		page.addToCollection(2, dropdown3);
		page.addToCollection(3, dropdown4);
		page.removeFromCollection(2);
		page.replaceFromCollection(1, dropdown4);
		page.printDropdownCollection();

	}

}
