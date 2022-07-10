public class ReturnStatements {

    public static void main(String[] args) {

        // Method call

        // Print out statement
        //System.out.println(makeLast(new int[]{4, 5, 8}));

        System.out.println(39/5);

    }

    /*
    public static int[] makeLast(int[] nums) {

        int doubleArrayLength = nums.length * 2;

        int[] newArray = new int[doubleArrayLength];

        for (int i = 0; (i < doubleArrayLength - 1); i++) {

            newArray[i] = 0;
        }

        return newArray;
    }
    */

}

    /*
    METHOD CALLS

    CODING BAT - 5/19/22
    String strValue1 = nonStart("Hello", "There");
    System.out.println(strValue1);

    String strValue2 = left2("Hello");
    System.out.println(strValue2);

    String strValue3 = right2("Hello");
    System.out.println(strValue3);

    CODING BAT - 5/20/22
    String capture = theEnd("Hello", false);
    System.out.println(capture);

    String doWithoutEnd2 = withoutEnd2("");
    System.out.println(doWithoutEnd2);

    String doMiddleTwo = middleTwo("Practice");
    System.out.println(doMiddleTwo);

    CODING BAT - 5/21/22
    boolean toEndsLy = endsLy("oddy");
    System.out.println(toEndsLy);

    String toNTwice = nTwice("a", 1);
    System.out.println(toNTwice);


    */


/*
    METHODS

    CODING BAT - 5/19/22
    public static String nonStart(String a, String b) {

        int aLength = a.length();
        int bLength = b.length();

        String newA = a.substring(1, aLength);
        String newB = b.substring(1, bLength);

        return newA + newB;
    }

    public static String left2(String str) {

        int strLength = str.length();

        String firstTwo = str.substring(0, 2);

        return str.substring(2, strLength) + firstTwo;
    }

    public static String right2(String str) {

        int strLength = str.length();

        int cut = str.length() - 2;

        String firstChars = str.substring(0, cut);
        String last2Chars = str.substring(cut);

        return last2Chars + firstChars;

    }

    CODING BAT - 5/20/22
    public static String theEnd(String str, boolean front) {

        int cut = str.length() - 1;

        if ( front == false) {
            return str.substring(cut);
        }

        return str.substring(0, 1);
    }

    public static String withoutEnd2(String str) {

        int cut = str.length() - 1;

        if (str.length() <= 1) {
            return "";
        }

        return str.substring(1, cut);

    }

    public static String middleTwo(String str) {

        int secondChar = (str.length() / 2) + 1;
        int firstChar = (str.length() / 2) - 1;

        return str.substring(firstChar, secondChar);

    }

    CODING BAT - 5/21/22
    public static boolean endsLy(String str) {

        if ( str.length() >= 2 ) {

            int cut = str.length() - 2;

            String ly = str.substring(cut);

            if ( ly.equals("ly") ) {

                return true;
            }
        }

        return false;
    }

    public static String nTwice(String str, int n) {

        if ( str.length() >= n ) {
            int cut = str.length() - n;

            String front = str.substring(0, n);
            String back = str.substring(cut);

            return front + back;
        }

        return str;
    }

     */

    /*

    // Code Belongs in Main Method
        String shouting = caps("Why are you reading my diary mom?!");
        System.out.println(shouting);

        int[] awesomeArray = gimmeArrayfromInts(3, 7, 1);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);

        String ultimateCombo = comboString("Hello", "hi");
        System.out.println(ultimateCombo);


    // String Method Example
    public static String caps(String s) {

        return s.toUpperCase();
    }

    // Array Method Example
    public static int[] gimmeArrayfromInts(int a, int b, int c ) {

        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;

        return array;
    }

    // String Method Example
    public static String comboString(String a, String b) {

        String temp = "";

        if ( b.length() > a.length() ) {

            // Store the shorter string
            temp = a;

            // "a" is now the larger string
            a = b;

            // "b" is now the shorter string
            b = temp;

            // Now we know that "a" is the larger string and "b" is the shorter string
            return b + a + b;
        }

        if ( a.length() > b.length() ) {

            // Store the shorter string
            temp = b;

            // "b" is now the larger string
            b = a;

            // "a" is now the shorter string
            a = temp;

            // Now we know that "b" is the larger string and "a" is the shorter string
            return a + b + a;
        }

        return "";
    }


     */


