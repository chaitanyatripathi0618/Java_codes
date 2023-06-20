package com.lpu.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello WOrld ";
		File f= new File("output");
		f.mkdir();
		try {
			FileOutputStream fos= new FileOutputStream( "output//filel.lpu");
			byte[] b= str.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("Saved Successfully");
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
