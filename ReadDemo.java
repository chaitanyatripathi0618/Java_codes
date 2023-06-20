package com.lpu.app;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis= new FileInputStream("output//filel.txt");
			int noBytes = fis.available();
			byte[] b= new byte[noBytes];
			fis.read(b);
			String str= new String(b);
			System.out.println(str);
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
