public class Demokondisi{
	public static void main ( String[] args)  {
		String status = "";
		int grade = 80;
		//mendapatkan status belajar
		status = (grade >= 60)?"Passed":"Fail";
		//print status
		System.out.println( status );
	}
}