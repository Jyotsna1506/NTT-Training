package com.ntt.filehandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myObj = new File("filename.txt");
		if (myObj.delete()) {
			System.out.println("File deleted: " + myObj.getName());
		} else {
			System.out.println("Failed to delete file");
		}
	}

}
