package generic;

public class Plastic extends Meterial{
	
	public String  toString() {
		return "재료는 플라스틱입니다";
	}

	@Override
	public void doPrinting() {
		
		
		System.out.println("플라스틱으로 프린팅합니다.");
	}

}
