package Assignment;

public class ReverseString {
public static void main(String[] args) {
	String str="Full Stack Web Development And Java Development And SQL And MYSQL ";
	String rev=" ";
	char ch;
	for(int i=0;i<=str.length()-1;i++){
		ch=str.charAt(i);
		rev=ch+rev;
	}
	System.out.println("Reverse String ="+rev);
}
}
