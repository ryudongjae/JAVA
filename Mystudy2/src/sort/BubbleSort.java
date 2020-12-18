package sort;

public class BubbleSort implements Sort {

	@Override
	public void ascedning() {
		System.out.println("BubbleSort ascedning");
	}

	@Override
	public void descending() {
		System.out.println("BubbleSort descending");
		
	}

	@Override
	public void description() {
		System.out.println("두 인접한 배열요소를 차례대로 검사를 하여 정렬을 하는 방식");
		System.out.println("BubbleSort입니다.");
	}

}
