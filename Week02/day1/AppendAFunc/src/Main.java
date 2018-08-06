public class Main {

    public static void main(String[] args) {
        String typo = "Chinchill";
        System.out.println(appendAFunc(typo));
    }

    private static String appendAFunc (String s){
        s += "a";
        return s;
    }
}
