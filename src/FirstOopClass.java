
public class FirstOopClass {

	public static void main(String[] args) {

		// create an object of type box
		Box myBox = new Box();
		myBox.length = 2;
		myBox.width = 3;
		myBox.height = 4;

		double obyem = myBox.height * myBox.length * myBox.width;
		System.out.println(obyem);
	}

}
