import javax.management.StringValueExp;

public class Handlingstringexample {
    public static void main(String[] args) {

        // concatination
        String firstname = "ram";
        String lastname = "magar";
        String fullname = firstname + " " + lastname;
        System.out.println("concatination example:fullname:" + fullname);
        System.out.println("------------------------");

        // conversion
        int number = 123;
        String tonumber = String.valueOf(number);
        System.out.println(tonumber);
        System.out.println("------------------------");
        System.out.println(tonumber.getClass().getName());
        System.out.println("------------------------");

        // case change
        String mixedcase = "hello world";
        System.out.println("upper case :" + mixedcase.toUpperCase());
        System.out.println("------------------------");
        System.out.println("lowercase :" + mixedcase.toLowerCase());
        System.out.println("------------------------");

        // extracting charact
        String name = "programmer";
        char firstchar = name.charAt(0);
        char fifthchar = name.charAt(4);
        System.out.println("firstchar:" + firstchar);
        System.out.println("------------------------");
        System.out.println("fifthchar:" + fifthchar);
        System.out.println("------------------------");

        // string comparision
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = "java";

        // using ==
        System.out.println("s1 ==s2:" + (s1 == s2));
        System.out.println("------------------------");
        System.out.println("s1==s3:" + (s1 == s3));
        System.out.println("------------------------");

        // using.equalsignorecase
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println("------------------------");

        // searching string
        String text = "java is a a programming language";

        // check if contain
        System.out.println("contains programming:" + text.contains("programming"));
        System.out.println("------------------------");

        // index of string occurrence
        int firstindex = text.indexOf("java");
        System.out.println("first java is at : " + firstindex);

        // MODIFYING string
        String originalstring = "     java programming";

        // trim whitespace
        String trimedstring = originalstring.trim();
        System.out.println("remove whitespace string:" + trimedstring);
        System.out.println("------------------------");

        // replace text
        String replaceString = trimedstring.replace("java", "python");
        System.out.println("replace string:" + replaceString);
        System.out.println("------------------------");

        // concat
        String newstrng = replaceString.concat("is used for artifical intelligence");
        System.out.println("new string:" + newstrng);
        System.out.println("------------------------");

        // string Buffer
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(" world");
        stringBuffer.insert(5, " java");
        // stringBuffer.reverse();
        System.out.println("modified string buffer:" + stringBuffer);
        System.out.println("------------------------");

    }
}
