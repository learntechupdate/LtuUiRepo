package javaconcept.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosingResourceUsingFinally {
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = null;
			int n = 0;
			
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Read Input ");
				n = Integer.parseInt(br.readLine());
				
			} 
			
			finally {
				br.close();
				System.out.println("Reource Closed");
			}
		}
}
