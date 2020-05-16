package Exercises;

public class Ex1 {

    public static void names(String[] userNames) {

        for (String name : userNames) {

            System.out.println("Hello " + name);

        }

    }

    public static void main(String[] args) {

        String[] namesOfUsers = {"Andrzej", "Janusz", "Grażyna", "Karyna"};
        names(namesOfUsers);

    }

}
