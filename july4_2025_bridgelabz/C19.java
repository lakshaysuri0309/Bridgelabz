  package july4_2025_bridgelabz;

public class C19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
            int num;
            if (i % 2 == 0) {
                num = 0;
            } else {
                num = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (num == 1) {
                    num = 0;
                } else {
                    num = 1;
                }
            }

            System.out.println();
        }
	}

}
