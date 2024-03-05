package class23_exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling3 
{
	

	public static void main(String[] args) 
	{
		
		System.out.println("Start");
		
		File src=new File("/Users/mukeshotwani/Downloads/Decadasdasdasdasd.pdf");
		
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			
		} catch (FileNotFoundException e) 
		{
			System.out.println("File not found "+e.getMessage());
		}
		
		System.out.println("End");
		
	}

}
