package stream;

import java.util.Scanner;

public class stdin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()){
			String line = sc.nextLine();
			System.out.println(line);
		}
	}
}
