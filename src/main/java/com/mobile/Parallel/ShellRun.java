package com.mobile.Parallel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellRun {
	public static void main(String[] args) throws IOException, InterruptedException {

		// -- Linux --

		// Run a shell command
		// Process process = Runtime.getRuntime().exec("ls /home/mkyong/");

		// Run a shell script
		
		String[] cmdScript = new String[]{"/bin/bash", "/Users/ibnuhhazar/eclipse-workspace/Parallel/DeviceNode/DeviceTwo.sh"}; 

		Process process = Runtime.getRuntime()
				.exec(cmdScript);

		// -- Windows --
		// Run a command
		// Process process = Runtime.getRuntime().exec("cmd /c dir C:\\Users\\mkyong");

		// Run a bat file
		// Process process = Runtime.getRuntime().exec("cmd /c hello.bat", null, new
		// File("C:\\Users\\mkyong\\"));

		StringBuilder output = new StringBuilder();

		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

		String line;
		while ((line = reader.readLine()) != null) {
			output.append(line + "\n");
		}

		int exitVal = process.waitFor();
		if (exitVal == 0) {
			System.out.println("Success!");
			System.out.println(output);
			System.exit(0);
		} else {
			// abnormal...
		}

	}
}
