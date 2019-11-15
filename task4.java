import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedWriter w = new BufferedWriter(new FileWriter("ex1q4.html"));
		Scanner inp = new Scanner(System.in);
		w.write("<html><body><style>"
				+ "table, th, td { border-collapse: collapse; }"
				+ "</style><table style=\"width:100%;height:100%\"><tr>");
		
		int n = inp.nextInt();
		if( n<1 || n>50 )
			n=10;
		
		for( int i=0 ; i<n ; i++ ) {
			if( i%3==0 ) 
				w.write("<th style=\"background-color:rgb(0, 0, 255);\"></th>\n");
			else if( i%3==1 )
				w.write("<th style=\"background-color:rgb(255, 0, 0);\"></th>\n");
			else
				w.write("<th style=\"background-color:rgb(2, 133, 2);\"></th>\n");
		}
		
		w.write("</tr></table></body></html>");
		inp.close();
		w.close();
	}

}