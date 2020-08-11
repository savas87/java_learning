import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// copy from one file to another file
		FileInputStream fileInputStream = new FileInputStream("/home/erbas/Documents/learning/java/input.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("/home/erbas/Documents/learning/java/output.txt");
		
		// check if fileInputStream is available
		while(fileInputStream.available() > 0) {
			
			// read file an save in variable
			int data = fileInputStream.read();
			// write in output
			fileOutputStream.write(data);
		}
		
		// close
		fileInputStream.close();
		fileOutputStream.close();	
		

	}

}
