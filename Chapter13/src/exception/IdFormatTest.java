package exception;

public class IdFormatTest {
	
	private String userID;
	


	public String getUserID() {
		return userID;
	}



	public void setUserID(String userID) throws IdFormatException {
		
		if(userID == null) {
			throw new IdFormatException("아이디는 null 일 수 없습니다.");
		}
		else if(userID.length() < 8|| userID.length() >20) {
			throw new IdFormatException("아이디는 8자 이상 20자 이하로 쓰시오");
		}
		this.userID = userID;
	}



	public static void main(String[] args) {
		
		
		IdFormatTest idTest = new IdFormatTest();
		
		String myId = null;
		
		try {
			idTest.setUserID(myId);
		}catch(IdFormatException e) {
			System.out.println(e);
		}
	
	
	myId ="121324";
	try {
		idTest.setUserID(myId);
	}catch(IdFormatException e) {
		System.out.println(e);
	}
	}

}
