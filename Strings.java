public class Strings {
    public static void main(String[] args){
        String a = "Hi";
        String b = " Vijay reddy";
        System.out.println(a);
        int length = a.length();
        System.out.println("length " +length);
        String c = a.concat(b); //combine two strings
        System.out.println("concat "+c);
        boolean result = a.equals(c);
        System.out.println("String a and c are equal: = "+result);
        System.out.println("upper case of a: "+a.toUpperCase());
        System.out.println("lower case of b: "+b.toLowerCase());
        System.out.println("deleting space: "+b.trim()); // delete front and back spaces in string
        System.out.println("second word of a: "+a.charAt(1));
        String d = "he s a good man and he s a developer";
        String e = d.replace("s","is");
        System.out.println("replacing s with is: "+e);
        float f = 14.5f;
        String g = String.valueOf(f); // changes int,float,long.double,char to String
        System.out.println("adding value to float: " +(f+2.2));
        String h = String.join("is ","vijay ","a kind person ");
        int i = h.indexOf(e);
        System.out.println("index: "+h);
        StringBuilder j = new StringBuilder("Is");
        j.append(result);
        System.out.println("append: "+j);

    }
}
