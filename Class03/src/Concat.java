public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ram"+"Sita";
        String s2 = "Sita"+"Ram";
        System.out.println(s1);
        System.out.println(s2);
        
        if(s1 == s2) {
        	System.out.println("Same");
        }
        else {
        	System.out.println("Not same");
        }

	}

}
/*Note:
--> '+' is used for concatenate the string.
--> During the concatenation if values are used, it allocates memory in constant pool.
 */