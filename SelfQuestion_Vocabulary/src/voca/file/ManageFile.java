package voca.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class ManageFile implements File_Interface{

	public ManageFile() {
		Read();
	}

	public void Write() throws IOException{
		Word word = new Word(sc.next(), sc.next());
		// Create BufferedWriter
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		
		// Write on File 
		writer.write(word.getWord());
		writer.write("; ");
		System.out.println();
		writer.write(word.getMean());
		writer.newLine();
	
		// close Stream & flush
		writer.flush();
		writer.close();
	}
	
	public void Read() {
		boolean flag = true;
		try {
			if(file.exists()) {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = null;
				int i = 1;
				while((line = reader.readLine()) != null) {
					Word word = new Word();
					StringTokenizer stk = new StringTokenizer(line.replace(" ", ""),";");
					while(stk.hasMoreTokens()) {
						if(flag) {
							word.setWord(stk.nextToken());
							flag = !flag;
						}else {
							word.setMean(stk.nextToken());
							flag = !flag;
						}
					}
					voca.add(word);
					System.out.println(i + "\t" + word);
					i++;
				}
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
