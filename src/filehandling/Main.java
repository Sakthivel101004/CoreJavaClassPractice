package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	Scanner scan =new Scanner(System.in);
	
	public void create() throws IOException{
		System.out.println("enter the file name");
		String name=scan.nextLine();
		
		File file=new File(name);
		if(file.createNewFile()) {
			System.out.println("file created succesfully");
		}
		else {
			System.out.println("file already created");
		}
		
		
	}
	
	public void write()throws IOException {
		System.out.println("enter the file name to write ");
		String name=scan.nextLine();
		System.out.println("write the content to the file :"+ name);
		String data=scan.nextLine();
		FileWriter write=new FileWriter(name);
		write.write(data);
		write.close();
	}
	
	public void read() throws IOException{
		
		System.out.println("enter the file name to read");
		String name=scan.nextLine();
		FileReader read=new FileReader(name);
		System.out.println(read.readAllAsString());
		read.close();
	}
	public void delete() throws IOException{
		System.out.println("enter the file name to delete");
		String name=scan.nextLine();
		File f=new File(name);
		if(f.delete()) {
			System.out.println("deleted successfully");
		}
		else {
			System.out.println("file is already deleted or not valid file name");
		}
	}
	public static void main (String args[]) throws IOException{
		
		Main main=new Main();
		main.create();
		main.write();
		main.read();
		main.delete();
	}
}
