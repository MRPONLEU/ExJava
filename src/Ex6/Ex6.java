package Ex6;

public class Ex6 {
    public static void main(String[] args) {
        String str ="Hello java";
        System.out.println("The length of \'Hello java\' is: "+ str.length());
        System.out.println("the compare with \"hello java\" is return:"+ str.equals("hello java"));
        System.out.println("now character at 1 is: "+ str.charAt(1));
        int comp,idx;
        comp=str.compareTo("Hello");
        System.out.println("now compare to \"Hello\" is return: "+ comp);
        idx=str.indexOf("java");
        System.out.println("index of java in \"Hello java\" is: "+ str.indexOf("java"));
        System.out.println("last index of java in \"Hello java\" is: "+ str.indexOf("java"));
        System.out.println("now substring from 5th index and end index at 10 is: "+ str.substring(5,10));
    }
}
