public class Checks {
	private boolean clipCheck;
	private boolean mapCheck;
	private boolean teacher;
	private boolean textbookACalc;
	private boolean key;
	
	//hospital checks
	public Checks(boolean cC, boolean mC, boolean sC) {
		clipCheck = cC;
		mapCheck = mC;
	}
	
	public void clipChecked(boolean cC) {
		clipCheck = cC;
	}
	
	public boolean getClipCheck() {
		return clipCheck;
	}
	
	public void mapChecked(boolean mC) {
		mapCheck = mC;
	}
	
	public boolean getMapCheck() {
		return mapCheck;
	}
	
	public boolean checkCombo(String safe) {
		if (safe.equals("Triangle, Nonagon, Icosagon")) {
			return true;
		} else {
			return false;
		}
	}
	
	//Parking Lot checks
	public Checks(boolean k) {
		
	}
	
	//Lake Elizabeth checks
	public Checks() {
		
	}
	
	//Chemistry lab checks
	public Checks(boolean t, boolean tB, boolean k, boolean mixed) {
		teacher = t;
		textbookACalc = tB;
		key = k;
	}
	
	public void teacherLeft() {
		teacher = false;
	}
	
	public void textbookACalcFound(boolean tB) {
		textbookACalc = tB;
	}
	
	public boolean getTextbookACalc() {
		return textbookACalc;
	}
	
	public boolean teacherHere() {
		return teacher;
	}
}
