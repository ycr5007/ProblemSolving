package voca.exe;

import java.io.IOException;
import java.util.Scanner;

import voca.file.CreateFile;
import voca.file.File_Interface;
import voca.file.ManageFile;
import voca.file.Random_Word;


public class Voca implements File_Interface{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Create File (Path : D:/Voca/voca.txt)
		CreateFile newFile = new CreateFile();
		ManageFile manage = new ManageFile();
		Random_Word game = new Random_Word();
		boolean flag = true;
		byte menu = 0;
		do {
			try {
				newFile.CreateNew();
				System.out.println("-------------------- M E N U --------------------");
				System.out.println("1. New Word");
				System.out.println("2. Show List");
				System.out.println("3. Question Of Mean");
				System.out.println("4. Question Of Word");
				System.out.println("0. Exit");
				System.out.println("-------------------------------------------------");
				menu = sc.nextByte();
				switch(menu) {
				case 1 : 
					System.out.print("Word & Mean : ");
					manage.Write();
					break;
				case 2 :
					manage.Read();
					break;
				case 3 :
					game.MeanQuestion();;
					break;
				case 4 :
					game.WordQuestion();;
					break;
				case 0 :
					flag = false;
					break;
				default :
					System.out.println();
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}while(flag);
		sc.close();
	}
}
