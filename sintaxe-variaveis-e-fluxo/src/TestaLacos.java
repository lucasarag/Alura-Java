
public class TestaLacos {

	public static void main(String[] args) {

		for (int mult = 1; mult <= 10; mult++) {

			System.out.println("Tabuada do " + mult);

			for (int cont = 0; cont <= 10; cont++) {

				System.out.print(mult * cont);
				System.out.print(" ");
			}

			System.out.println();
			System.out.println();
		}
	}
}
