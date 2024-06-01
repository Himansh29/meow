
public class Day7_3 {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Akshita");
		StringBuffer s2=new StringBuffer("Sunbeam");
		StringBuffer s3=s2;
		System.out.println(s1.hashCode() + " " +s1);
		System.out.println(s2.hashCode() + " " +s2);
		System.out.println(s3.hashCode()+ " " + s3);
		
		s2.append("pune");
		System.out.println(s2.hashCode() + " " +s2);
		System.out.println(s3.hashCode()+ " " + s3);
		
		s3.append("hinjewadi");
		System.out.println(s2.hashCode() + " " +s2);
		System.out.println(s3.hashCode()+ " " + s3);
		
	}

}
