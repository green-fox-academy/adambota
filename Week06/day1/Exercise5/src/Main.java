public class Main {

    public static void main(String[] args) {
        String foo = "ThIs Is A sAmPlE sTrInG!";

        foo.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char) c))
                .forEach(System.out::println);
    }
}
