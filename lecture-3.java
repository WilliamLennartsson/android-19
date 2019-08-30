public static void main(String[] args) {

        // Exempel 1
        int[] priceList = new int[3];
        priceList[0] = 100;
        priceList[1] = 50;
        priceList[2] = 199;

        // Exempel 2
        int[] priceList2 = {19, 25, 40, 10};

        // Exempel 3
        String[] names = {"Pelle", "Peter", "Pia"};
        // Print array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Testa metoderna createArray och printArray
        int[] firstList = createArray(10);
        printArray(firstList);
        int[] secondList = createArray(200);
        printArray(secondList);
        int[] thirdList = doubleUpArr(firstList);
        printArray(thirdList);

        // Arrayer kan ha x antal dimensioner

        // 1 Dimension
        int[] oneDimArr = new int[5];
        // - - - - -
        
        // 2 Dimensioner
        int [][] twoDimArr = new int[5][8];
        // - - - - -
        // - - - - -
        // - - - - -
        // - - - - -
        // - - - - -
        // - - - - -
        // - - - - -
        // - - - - -

    }

    public static int[] createArray(int numberOfValues){
        // Skapa upp en ny lista med längden av numOfValues. 
        int[] list = new int[numberOfValues];
        // list kan nu variera i storlek. Något som är väldigt användbart framöver.

        // För att loopa en lista som vi inte direkt vet längden på kan vi komma åt längden genom .length 
        for (int i = 0; i < list.length; i++) {
            // Värdet vi vill sätta på plats i är i + 1
            // Ex. om i = 0, dvs det första indexet i arrayn, vill vi sätta in värdet 1.
            list[i] = i + 1;
        }
        // Returnera listan när vi är klara
        return list;
    }

    public static void printArray(int[] arr) {
        // En dynamisk loop som loopar igenom hela arrayn vi skickar in. Dvs, arr.length
        for (int i = 0; i < arr.length; i++) {
            // Printar ut alla värden i arrayn, en i taget
            System.out.print(arr[i] + ", ");
        }
        // Ny tom rad.
        System.out.println();
    }

    public static int[] doubleUpArr(int[] oldArr) {
        // Skapa den nya arrayn.
        // Fundera på hur stor arrayn ska vara. Hur kan argumenten ändras?
        int[] newArr = new int[oldArr.length * 2];
        // Hur länge behöver jag loopa? jo, oldArr.length
        for (int i = 0; i < oldArr.length; i++){
            // Vad ska hända med varje element?
            // oldArr ska kopieras till newArr
            newArr[i] = oldArr[i];
        }
        // Skicka tillbaka resultatet
        return newArr;
    }