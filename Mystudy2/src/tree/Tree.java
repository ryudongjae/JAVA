package tree;

public class Tree {

	public static void main(String[] args) {
		int num=40;
		
		for(int i = 0; i < num ; i++) {
			
			for (int j = 1; j< num - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i * 2 + 1; k++) {
				System.out.print("@");
				
			}
			System.out.println();
			
		}
		System.out.println("                            씨발 진짜 이지랄 하는게 맞냐?");
		System.out.println("                            씨발 진짜 이지랄 하는게 맞냐?");
		System.out.println("                            씨발 진짜 이지랄 하는게 맞냐?");
		System.out.println("                            씨발 진짜 이지랄 하는게 맞냐?");
		System.out.println("                            씨발 진짜 이지랄 하는게 맞냐?");
		System.out.println("                            씨발 진짜 이지랄 하는게 맞냐?");
		
	}

}
