public class StringFunction {
    public static void main(String[] args) {
        //
        // A P P L E S
        // 0 1 2 3 4 5
        String a = "Apples";
        String b = "Bananas";
        String o = "Oranges";
        String bp = "Banana Peels";
        String p = "Pears";
        String[] fruits = {a, b, o, bp, p};

        for (String f : fruits) {
            // Getting a character at a specific index
            int index = 1;
            System.out.println(f.charAt(index));

            char[] charArray = f.toCharArray();
            System.out.println("Char at " + index + " : " + charArray[index]);

            int indexOfLetterE = f.indexOf('e');
            System.out.println(indexOfLetterE);

            f = f.toLowerCase();
            if (f.contains("app")) {
                System.out.println("Contains app: " + f);
            }

            System.out.println(f.substring(1, 4));

            System.out.println(reverseString(f));

            System.out.println();

            // Print a string if it contains a substring
            // Grab a substring using two indexes
            // Print a reverse String

        }
        //*********
        String pp = "   Panda";
        String f = " Fish ";
        String h = "Horse     ";
        String c = " Cat";
        String nothing = " ";
        String[] strings = {pp, f, c, h, nothing};

        for (String s : strings) {
            System.out.println(s);
            s = s.trim();
            System.out.println(s);

            if (!s.isEmpty()) {
                System.out.println("Not Empty: " + s);
            }

            if (s.length() > 3) {
                System.out.println("More than 3: " + s);
            }

            if (s.length() >= 3) {
                System.out.println("More than or equal to 3: " +s);
            }

            System.out.println(s.toLowerCase());
            System.out.println(s.toUpperCase());

            System.out.println();

        }

        // advanced string functions
        String text = "The giant panda has an insatiable appetite " +
                "for bamboo. A typical animal eats half the day—a " +
                "full 12 out of every 24 hours—and relieves itself " +
                "dozens of times a day. It takes 28 pounds of " +
                "bamboo to satisfy a giant panda's daily dietary " +
                "needs. Pandas will sometimes eat birds or rodents" +
                " as well.";

        String fishText = text.replace("bamboo", "fish");
        System.out.println(fishText);

        // How many sentences?
        String[] sentences = text.split("\\.");

        System.out.println("The text has " + sentences.length + " sentences.");

        // How many words?
        String[] words = text.split(" ");
        System.out.println("The text has " + words.length + " words.");

        // How many characters?
        System.out.println(text.length());

        // String equality
        String literal = "hello";
        String obj = new String("hello");
        String otherLiteral = "hello";
        String otherObj = new String("hello");

        // literal --> "hello"
        // otherLiteral --^

        // obj --> "hello"
        // otherObj --> "hello"

        System.out.println(literal == obj);
        System.out.println(literal == otherLiteral);
        System.out.println(literal.equals(obj));
        System.out.println(literal.equals(otherLiteral));

        System.out.println();

        System.out.println(obj == otherObj);
        System.out.println(obj.equals(otherObj));
    }

    // more function
        public static String reverseString(String s) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                stringBuilder.append(s.charAt(i));
            }
            return stringBuilder.toString();
        }
}
