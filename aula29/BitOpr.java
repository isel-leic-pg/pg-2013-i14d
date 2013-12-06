import java.util.Scanner;

public class BitOpr{

	public static void main(String[] args)
	{	
		for(int i=0; i<args.length; ++i)
			System.out.println(args[i]);
	
		int i1 = 10;
		int i2 = 0b1010;
		int i3 = 0xA;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = 0x4;
		int i5 = i4 >> 1;
		int i6 = i4 >> 2;
		int i7 = i4 << 1;
		
		System.out.println();
		System.out.println(i4); //4
		System.out.println(i5); //2
		System.out.println(i6); //1
		System.out.println(i7); //8
		
		Scanner input = new Scanner(System.in);
		int i8 = input.nextInt();
		int i9 = i8 & 0x1;
		System.out.println(i9==0 ? '-' : '*');
		
		int mask = 1 << 31;
		for(int i=0; i<32; ++i){
			if((i % 4) == 0) System.out.print(" ");
			System.out.print( (i8 & mask) == 0 ? '-' : '*');
			mask>>>=1; //mask = mask << 1;
		}		
	}
}