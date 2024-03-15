package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class FileWritter {

public static void main(String[] args)   {
	File f=new File("ap.doc");
	try {
		boolean res=f.createNewFile();
		System.out.println(res);
		FileWriter fw=new FileWriter(f);
		fw.write("Hi");
		fw.write("How Are You");
		fw.write("I Am Good");
		fw.flush();
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
