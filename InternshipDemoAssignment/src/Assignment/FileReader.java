package Assignment;

import java.io.File;
import java.io.IOException;

public class FileReader {
public static void main(String[] args) {
	File f=new File("art.txt");
try {
	
	boolean res=f.createNewFile();
	System.out.println(res);
	java.io.FileReader reader=new java.io.FileReader(f);
	try {
		int i;
		while((i=reader.read())!=-1) {
			
			System.out.println((char)i);
			
		}
		
	} finally {
		// TODO: handle finally clause
		
		reader.close();
	}
} catch (IOException e) {
	// TODO: handle exception
	System.out.println("Exception Handling");
}
}	
}

