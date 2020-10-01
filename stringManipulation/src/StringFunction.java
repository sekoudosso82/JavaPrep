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
