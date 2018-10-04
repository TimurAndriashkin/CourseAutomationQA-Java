
public class Task4_lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2147483647;
		short b = 32767;
		long c = 92233720368547L;
		double d = 999999.25;
		float f = 99.25f;
		char h = 'x';
		boolean o = true;
		long result1 = (long) a + b;
		double result2 = a - d;
		double result3 = f * d;
		boolean result4 = c > d;
		boolean result5 = f < a;
		boolean result6 = a == b;
		boolean result7 = f != d;

		{
			System.out.print(a + " " + b + " " + c + " " + d + " " + f + " " + h + " " + o + " " + result1 + " "
					+ result2 + " " + result3 + " " + result4 + " " + result5 + " " + result6 + " " + result7 + "\n");
		}
		{
			System.out.println();
		}
		{
			System.out.println(a + "\n" + " " + b + "\n" + "  " + c + "\n" + "   " + d + "\n" + "    " + f + "\n"
					+ "     " + h + "\n" + "      " + o + "\n" + "       " + result1 + "\n" + "        " + result2
					+ "\n" + "         " + result3 + "\n" + "          " + result4 + "\n" + "           " + result5
					+ "\n" + "            " + result6 + "\n" + "             " + result7 + "\n");
		}
	}

}
