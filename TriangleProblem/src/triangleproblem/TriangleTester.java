package triangleproblem;

public class TriangleTester {
	public static void main (String... args) {
		
		
		String[][] matrix = {
				{"30","b","2"},
				{"sk","1","Sd"},
				{"21","5","3,4"},
				{"5,4","2,1","199,2"},
				{"4","7,5","abc"},
				{"274","12","97"},
				{"76","599","3"},
				{"55","55","201"},
				{"0","2","2"},
				{"12","-45","90"},
				{"124","125","-1"},
				{"156","500","-12"},
				{"0","-999","999"},
				};

		
		for (int i= 0; i< matrix.length; i++) {

			String a = matrix[i][0];
			String b=matrix[i][1];
			String c=matrix[i][2];
			System.out.println("\n\n>>>>>Initializing test case #"+i);
			System.out.println("Values: a="+a+" b="+b+" c="+c);
			try {
			TriangleProblem.checkInputs(Integer.parseInt (a),Integer.parseInt (b),Integer.parseInt (c));

	        System.out.println ("Side a is ");
	        System.out.println (a);
	        System.out.println ("Side b is ");
	        System.out.println (b);
	        System.out.println ("Side c is ");
	        System.out.println (c);
	                   
	        System.out.println ("\nIs triangle? ");
	        System.out.println(TriangleProblem.typeTriangle(Integer.parseInt (a),Integer.parseInt (b),Integer.parseInt (c)));
			System.out.println("\n\n>>>>>Test case #"+i+" SUCCEED");
			}catch(Exception e) {
				System.out.println("\n\n>>>>>Test case #"+i+" FAILED. Ex:" + e.getMessage());
	        }
		}
		
		}
}
