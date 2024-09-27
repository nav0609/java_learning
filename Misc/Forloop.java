class Forloop {
    public static void main(String args[]) {
        int depth = 20;
        int i, j, k, m;
        for (i = depth; i > 0; i--) {
            System.out.print("                                                                              ");

            for (k = 0; k < (depth - i); k++) {
                System.out.print(" ");
            }

            for (j = i; j > 0; j--) {
                System.out.print("*");
            }

            for (m = i; m > 0; m--) {
                System.out.print("*");
            }

            System.out.println("");
        }

        for (i = depth; i > 1; i--) {
            System.out.print("                                                                              ");

            for (k = i; k > 2; k--) {
                System.out.print(" ");
            }

            for (j = 0; j < (depth - i + 2); j++) {
                System.out.print("*");
            }

            for (m = 0; m < (depth - i + 2); m++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}