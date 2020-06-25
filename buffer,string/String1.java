package string.operation;

public class String1 {
    public static void main(String[] args) {

        String st = "This is sample text";
        System.out.println(st);

        System.out.println(st.charAt(2));
        System.out.println(st.concat(" from my teacher"));
        System.out.println(st.length());
        System.out.println(st.codePointAt(0));
        System.out.println(st.indexOf('s'));
        System.out.println(st.lastIndexOf('t'));
        System.out.println(st.replace('s','t'));
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.trim()+'a');
        System.out.println(st.equalsIgnoreCase("exit"));


    }




}
