

    static int B, H;
    static boolean flag = true;
    static Scanner scan = new Scanner(System.in);

    static{
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } 
    }    

