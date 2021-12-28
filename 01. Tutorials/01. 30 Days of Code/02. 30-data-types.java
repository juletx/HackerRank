

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);
        /* Print the sum of the double variables on a new line. */
		System.out.printf("%.1f\n", d + d2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + s2);
