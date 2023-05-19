package HardPatterns;
class pascal {
	public int factorial(int i)
	{
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}
	public static void main(String[] args)
	{
		int n = 4, i, j;
		pascal g = new pascal();
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= i; j++) {
				// nCr formula
				System.out.print(
					" "
					+ g.factorial(i)
						/ (g.factorial(i - j)
							* g.factorial(j)));
			}
			// for newline
			System.out.println();
		}
	}
}