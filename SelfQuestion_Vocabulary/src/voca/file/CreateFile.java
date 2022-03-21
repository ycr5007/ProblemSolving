package voca.file;

import java.io.IOException;

public class CreateFile implements File_Interface{
	public void CreateNew() throws IOException {
		if(!file.exists()) {
			System.out.println(filePath);
			file.createNewFile();
		}
	}
}
