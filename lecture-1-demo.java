    // Skriv ett program som ber användaren mata in sin ålder och sedan printar ut om användaren är tillräckligt gammal för att köra bil.

    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if (age >= 18) {
        System.out.println("Du får köra bil");
    } else {
        System.out.println("Du är inte tillräckligt gammal");
    }


    // Skriv ett program som räknar baklänges från 40 till 30 och skriver
    // ut siffrorna på skärmen.

    for (int i = 40; i >= 30; i--){
        System.out.println(i);
    }


    // Skriv ett program som skriver ut alla jämna tal från 2 till 12.

    int counter = 2;
    while(counter <= 12){
        System.out.println(counter);
        counter += 2;
    }


    // Skriv ett program som frågar om ett lösenord. Om lösenordet stämmer "Du loggade in" skrivas ut samt att programmet ska avslutas.

    String password = "123123";
    Scanner sc = new Scanner(System.in);
    boolean correctGuess = false;
    do {
        System.out.println("Skriv in lösenord.");
        String loginGuess = sc.nextLine();
        if (loginGuess.equals(password)){
            System.out.println("Du loggade in");
            correctGuess = true;
        } else {
            System.out.println("Fel lösenord");
        }
    } while(!correctGuess);
