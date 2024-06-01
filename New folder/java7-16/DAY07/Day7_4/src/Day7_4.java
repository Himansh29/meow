
public class Day7_4 {

	public static void main(String[] args)
	{
		String str="Sunbeam-Infotech-Pune";
		String reg="-";
		System.out.println("Original String ="+str);
		String[] words=str.split(reg);
		//for each element of type String 'w' inside the array of String words
		// print the each element 'w' 
		for(String w:words)
			System.out.println(w);

	}

}
