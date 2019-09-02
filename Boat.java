public class Boat {
    private ArrayList<String> peopleOnTheBoat = new ArrayList<>();
    private boolean isOutOnTheSea = false;
    private boolean hasHelicopter = false;

    public void setIsOutOnTheSea(boolean b) {
        isOutOnTheSea = b;
    }

    public boolean getIsOutOnTheSea() {
        return isOutOnTheSea;
    }

    public void addPersonOnTheBoat(String person) {
        if (!isOutOnTheSea){
            peopleOnTheBoat.add(person);
            System.out.println(person + " klev på");
            if (peopleOnTheBoat.size() >= 3) {
                setSail();
            }
        } else {
            System.out.println("Out fishin'");
        }
    }

    public void removePersonOffTheBoat(String person) {
        peopleOnTheBoat.remove(person);
        System.out.println(person + " klev av");
    }

    public void removeAllPeopleFromTheBoat() {
        System.out.println("Number of people on the boat " + peopleOnTheBoat.size());
        for (int i = peopleOnTheBoat.size() - 1; i >= 0; i--) {
            System.out.println(peopleOnTheBoat.get(i) + " klev av");
            peopleOnTheBoat.remove(i);
        }
    }

    public void printPeopleOnTheBoat() {
        for (int i = 0; i < peopleOnTheBoat.size(); i++){
            System.out.println(peopleOnTheBoat.get(i));
        }
    }

    public void setSail() {
        System.out.println("BÅÅÅÅÅÅÅT");
        isOutOnTheSea = true;
    }
}