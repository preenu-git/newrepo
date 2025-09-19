package string_package;

public class String_Example {
	
	
    public static void main(String args[]){
	String S="Hello";
	System.out.println(S);
    String A=new String("Hi");
    System.out.println(A);
    //length method
    System.out.println(S.length());
    //concatenation
    System.out.println(S.concat(A));
    System.out.println(S.concat("world"));
    //to uppercase
    System.out.println(S.toUpperCase());
    //to lowercase
    System.out.println(A.toLowerCase());
    //is empty
    String B="";
    System.out.println(B.isEmpty());
    String c="hi";
    System.out.println(c.isEmpty());
    //contains
    String d="my name is preenu";
    System.out.println(d.contains("name"));
    String e="my name is preenu";
    System.out.println(e.contains("this"));
    String f="my name is preenu";
    System.out.println(f.contains("t"));
    String g="my name is preenu ";
    System.out.println(g.contains(S));
    //Equals
    String h="java";
    String i="java";
    String j="Java";
    String k="selenium";
    System.out.println(h.equals(i));
    System.out.println(h.equals(j));
    System.out.println(h.equals(k));
    //equalignorecase
    System.out.println(h.equalsIgnoreCase(i));
    String s1=new String("java");
    System.out.println(h.equals(s1));
    System.out.println(h==s1);
    //value of
    int z=3;
    System.out.println(String.valueOf(z));
    System.out.println(h.charAt(2));
}
}
