
    // Main
    Scanner scc = new Scanner(System.in);
        System.out.println("Skriv in ett tal");
    int y = scc.nextInt();
    printMultiply(y);
    public static void printMultiply(int x) {
        for (int i = 0; i <= 10; i++){
            System.out.println(x*i);
        }
    }



    // Skriv ett program som ber användaren om ett namn som är längre än 3. Programmet skall fråga tills dess att rätt svar matas in.
    String name = "";
        do {
        System.out.println("Enter name");
        name = sc.nextLine();
    } while(name.length() < 4);
        System.out.println("Your name " + name + " was accepted");


        while(true) {
        System.out.println("Skriv ditt namn");
        String yourName = sc.nextLine();
        if (yourName.length() > 3){
            System.out.println("Bra jobbat");
            break;
        } else {
            System.out.println("Fel. Försök igen");
        }
    }
