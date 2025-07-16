package Sample_2;

public class MethodsJavaProgram {
public static void main(String[] args) {
	String str="HellO";
	String str1="JavA";
	String str2="java";
	boolean contains=str.contains("els");
	System.out.println(contains);
	String replace=str.replace("O", "s");
	System.out.println(replace);
	String replaceAll=str.replaceAll("[^A-Z]","");
	System.out.println(replaceAll);
	String[] first=str.split("e");
	for(String firsts:first)
		System.out.println(firsts);
	char[] charArray=str.toCharArray();
	System.out.println(charArray);
	
}
}
