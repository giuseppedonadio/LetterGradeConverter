package gradeConverter;

public class Grade {
	private int number;
	private String letter;
	
	public Grade() {
		number = 0;
		letter = "";
	}	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}

	public Grade(int number,String letter) {
		this.number = number;
		this.letter = letter;
	}	
	
	public String letter() {
		if(number > 87 && number < 101) {
			letter = "A";
		}else if(number > 79 && number < 88) {
			letter = "B";
		}else if(number > 66 && number < 80) {
			letter = "C";
		}else if(number > 59 && number < 67) {
			letter = "D";
		}else if(number < 60) {
			letter = "F";
		}
		return letter;
	}

}
