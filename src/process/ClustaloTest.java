package process;

import java.io.IOException;

public class ClustaloTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Process p = Runtime.getRuntime().exec("C:\\Program Files\\Notepad++\\Notepad++.exe");
		int exitVal = p.waitFor();
		System.out.println("Process exitValue: " + exitVal);
	}
}