package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Desktop();
		computer.display();
		computer.turnOff();
		
		
		Notebook myNote = new MyNotebook() {};
	}

}
