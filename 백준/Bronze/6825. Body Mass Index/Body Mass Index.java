import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		
		Double w = Double.parseDouble(br.readLine());
		Double h = Double.parseDouble(br.readLine());
		
		Double bmi = w / (h * h);
		if(bmi > 25) {
			sb.append("Overweight");
		}else if(bmi >= 18.5) {
			sb.append("Normal weight");
		}else {
			sb.append("Underweight");
		}
		
		System.out.println(sb);
	}	
}