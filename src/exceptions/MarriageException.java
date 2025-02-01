package exceptions;


public class MarriageException extends Exception {

	public MarriageException(String Msg) {
		super(Msg);
	}
	 
	public static void getMarried(int male, int female) throws MarriageException {
		if(male>=21 && female>=18) {
			System.out.println("Happy Married Life");
		}else {
			throw new MarriageException("To small To get married");
		}
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********First Couple**********");
		
		try {
            getMarried(27, 20);
            
        } catch (MarriageException e) {
            System.out.println("Exception: " + e.getMessage());
        }
		System.out.println();
		System.out.println("***********Second Couple**********");
		try {
            getMarried(18, 18);
            
        } catch (MarriageException e) {
            System.out.println(e.getMessage());
        }
	}

}
