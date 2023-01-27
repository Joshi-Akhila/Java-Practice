class BasicDemo {

	static void print() {
		// New line Sequences(Advance curser to begining of next line)
System.out.println(" ..Hello..");
System.out.println(); // Print empty line 
System.out.println("Hello, World!!");
System.out.print("Good Afternoon"); // Cursor stayed after the printing string 
System.out.print(" "); // print space
}
		static void primitives() {
		System.out.println("\n\n Inside primitives ....");
		Long intHex = 0x0041L;
		System.out.println("intHex" +  intHex);
		
		int intBinary = 0b0100_0001;
		System.out.println("intBinary" +  intBinary);
		int intOctal = 0101;
		System.out.println("intOctal" +  intOctal);
}
 	public static void main(String[] arges) {
		print();
                primitives();
}
}
