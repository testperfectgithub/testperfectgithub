package Assignment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOverLop {
	public static void main(String[] args) {
		
	
	File f=new File("ap.txt");
	try {
		boolean res=f.createNewFile();
		System.out.println(res);
		FileWriter fw=new FileWriter(f);
		fw.write("Hi");
		fw.write("How Are You");
		fw.write("I Am Good");
		FileReader fr=new FileReader(f);
		int i;
		while((i=fr.read())!=-1) {
			
			System.out.println((char)i);
			
		}
		fw.flush();
		fw.close();
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
