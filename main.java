public class Main{
    public static void main(String[] args){
        String hobby1 ;
        String hobby2;
        String hobby3;
        hobby1 = "sleeping";
        hobby2 = "running";
        hobby3 = "loving";

        System.out.printf("[1]Hobby1 length: %s\n", hobby1.length());
        System.out.printf("[1]Hobby2 length: %s\n", hobby2.length());
        System.out.printf("[1]Hobby3 length: %s\n\n", hobby3.length());

        System.out.printf("[2]chartAt: %s\n", hobby1.charAt(2));
        System.out.printf("[2]chartAt: %s\n", hobby2.charAt(3));
        System.out.printf("[2]chartAt: %s\n\n", hobby3.charAt(5));


        System.out.printf("[3]toUpperCase: %s\n", hobby1.toUpperCase());
        System.out.printf("[3]toUpperCase: %s\n", hobby2.toUpperCase());
        System.out.printf("[3]toUpperCase: %s\n\n", hobby3.toUpperCase());

        System.out.printf("[4]substring: %s\n", hobby1.substring(1,4));
        System.out.printf("[4]substring: %s\n", hobby2.substring(1,4));
        System.out.printf("[4]substring: %s\n\n", hobby3.substring(1,4));
        
        System.out.printf("[5]indexOf: %s\n", hobby1.indexOf('i'));
        System.out.printf("[5]indexOf: %s\n", hobby2.indexOf('i'));
        System.out.printf("[5]indexOf: %s\n\n", hobby3.indexOf('i'));
        
        System.out.printf("[6]replace(): %s\n", hobby1.replace('e','a'));
        System.out.printf("[6]replace(): %s\n", hobby2.replace('i','a'));
        System.out.printf("[6]replace(): %s\n\n", hobby3.replace('i','a'));

        System.out.printf("[7]trim(): %s\n", hobby1.trim());
        System.out.printf("[7]trim(): %s\n", hobby2.trim());
        System.out.printf("[7]trim(): %s\n\n", hobby3.trim());

        System.out.printf("[8]contains(): %s\n", hobby1.contains("sleep"));
        System.out.printf("[8]contains(): %s\n", hobby2.contains("run"));
        System.out.printf("[8]contains(): %s\n\n", hobby3.contains("lov"));

        System.out.printf("[9]equals(): %s\n", hobby1.equals("sleeping"));
        System.out.printf("[9]equals(): %s\n", hobby2.equals("running"));
        System.out.printf("[9]equals(): %s\n\n", hobby3.equals("loasd"));

        // System.out.printf(\n"split(): %s", hobby1.split());
    }
}