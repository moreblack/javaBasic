import javax.sound.sampled.SourceDataLine;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = ~num1;
		int num3 = num2 + 1;
		int num4 = 10000000;


	System.out.println("Hello,world");

		// java add....

		String returnValue = toBinaryString(num1);
		System.out.println(returnValue);

		String returnValue1 = toBinaryString(num2);
		System.out.println(returnValue);

		String returnValue2 = toBinaryString(num3);
		System.out.println(returnValue2);

		String returnValue3 = toBinaryString(num4);
		System.out.println(returnValue2);
	}

	public static String toBinaryString(int val) {
		String str = Integer.toBinaryString(val);
		while (str.length() < 32) {
			str += "0" + str;

		}
		return str;
	}

}
