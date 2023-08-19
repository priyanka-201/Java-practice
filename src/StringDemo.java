public class StringDemo {
    public static void main(String[] args) {
        //String "hello"
        //toUpperCase(),toLowerCase(),length(),substring(), concat(), +, charAt(), equals(), equalsIgnoreCase()
        String word="Hello";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.length());
        System.out.println(word.substring(0,3));
        String word2="world";
        System.out.println(word.concat(word2));
        String output=word+" "+word2;
        System.out.println(output);
        char word1=word.charAt(0);
        String word3="World";
        System.out.println(word2.equals(word3));
        System.out.println(word2.equalsIgnoreCase(word3));
    }
}
