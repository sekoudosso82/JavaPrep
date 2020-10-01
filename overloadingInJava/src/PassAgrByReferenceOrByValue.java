public class PassAgrByReferenceOrByValue {
    public static void  incrementValue(int inMethod){
        inMethod++;
        System.out.println("value inside the method: "+ inMethod);
    }
    public static void  incrementValue1(int[] inMethod){
        inMethod[0]++;
        System.out.println("value inside the method: "+ inMethod[0]);
    }

    // Passing String Values
    public static void  stringValue(String inMethod){
        inMethod = "New";
        System.out.println("string inside the method: "+ inMethod);
    }

    public static void main(String[] args) {
        // Passing primitive
        int original = 10;
        System.out.println("original before: " + original);
        incrementValue(original);
        System.out.println("original after: " + original);

        // primitive Wrapped in Objects
        System.out.println("*********************");
        System.out.println("primitive Wrapped in Objects");
        int[] original2 = {10, 20, 30};
        System.out.println("original2[0] before: " + original2[0]);
        incrementValue1(original2);
        System.out.println("original2[0] after: " + original2[0]);

        // Passing String Values
        System.out.println("*********************");
        System.out.println("Passing String Values");
        String original3 = "Original!";
        System.out.println("original3 before: " + original3);
        stringValue(original3);
        System.out.println("original2[0] after: " + original3);

    }
}
