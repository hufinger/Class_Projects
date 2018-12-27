package tightly_packed;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//scan in the number of widgets
		Scanner s = new Scanner(System.in);
		long in = s.nextLong();
		s.close();
		//calculate how many open spaces are left after packing 
		long square  = (long) Math.ceil(Math.sqrt(in));
		long open = square*square;
		long min_lim = Math.max(1, 7*(square-1)/10);
		for(long i = min_lim; i <= square; i++) {
			long width = in/i;
			if(2*i >= width) {
				if(width*i == in) {
					open = 0;
				} else {
					width++;
					if(2*i >= width) {
						long area = i*width;
						open = Math.min(open, area-in);
					}
				}
			}	
	}
		System.out.print(open);
	}	
}
