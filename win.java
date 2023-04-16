package ticTactoc1;

 class win {
    public void pattern2() {

        int i, f, a = 5;

        for (i = 1; i <= a; i++) {
            for (f = 1; f <= a; f++) {

                System.out.print("$");
            }

            for (f = 1; f < a + 6; f++) {
                System.out.print(" ");
            }
            for (f = a + 1; f > i; f--) {

                System.out.print(" ");
            }
            for (f = 1; f <= i; f++) {

                System.out.print("$");
            }
            for (f = 1; f < a + 5; f++) {
                System.out.print("$");
            }
            for (f = 1; f <= i; f++) {

                System.out.print("$");

            }
            for (f = a + 1; f > i; f--) {

                System.out.print(" ");
            }
            for (f = a + 1; f > i; f--) {

                System.out.print(" ");
            }
            for (f = 1; f <= i; f++) {

                System.out.print("$");

            }
            for (f = 1; f < a + 5; f++) {
                System.out.print("$");
            }
            for (f = 1; f <= i; f++) {

                System.out.print("$");
            }
            for (f = a + 1; f > i; f--) {

                System.out.print(" ");
            }
            for (f = 1; f < a + 6; f++) {
                System.out.print(" ");
            }

            for (f = 1; f <= a + 2; f++) {

                System.out.print("$");
            }
            System.out.println();

        }

        for (i = 1; i <= a + 15; i++) {

            for (f = 1; f <= a; f++) {

                System.out.print("$");
            }
            for (f = 1; f < a + 6; f++) {
                System.out.print(" ");
            }
            for (f = 1; f <= i; f++) {

                System.out.print(" ");
            }
            for (f = a + 16; f > i; f--) {

                System.out.print("$");
            }
            for (f = a + 16; f > i; f--) {

                System.out.print("$");
            }
            for (f = 1; f <= i; f++) {

                System.out.print(" ");
            }
            for (f = 1; f < a + 6; f++) {
                System.out.print(" ");
            }
            for (f = 1; f <= a + 2; f++) {

                System.out.print("$");
            }
            System.out.println();

        }
      

     
    }
}
