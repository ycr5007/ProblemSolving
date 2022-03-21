package voca.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public interface File_Interface {
	String filePath = "D:/Voca/voca.txt";
	File file = new File(filePath);
	Scanner sc = new Scanner(System.in);
	ArrayList<Word> voca = new ArrayList<Word>();
}