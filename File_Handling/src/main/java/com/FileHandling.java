package com;

import java.io.BufferedWriter;
import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;

public class FileHandling {
	public static void main(String[] args) {
		try {
			File myObj = new File("samplefile.txt");
			if(myObj.createNewFile()) {
				System.out.println("New File is created: " + myObj.getName());
			}else {
				System.out.println("File already exists");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner("samplefile.txt");
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		sc.close();
		
		File file = new File("samplefile.txt");
		try {
			appendToFileFileWriter(file, " hello world");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

	private static void appendToFileFileWriter(File file, String content) throws IOException {
		try (FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw)) {
				bw.write(content);
				bw.newLine();   
				}		
	}	
}
