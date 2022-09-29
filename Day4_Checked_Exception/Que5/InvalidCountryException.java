package Day4_Checked_Exception.Que5;

public class InvalidCountryException extends Exception{
	
	public InvalidCountryException() {

}

	public InvalidCountryException(String message) {
		super(message);
	}
}
