import java.util.Arrays;

public class Main2 {


    public static void main(String[] args) {

        System.out.println(getFrequencyOfChars(new String("aaabbbcccdfghkphttttt")));

        System.out.println(isAnagram("aja", "java"));

        System.out.println(Main2.numberofChars("cydeo"));

        System.out.println(Main2.smallestBiggestNum(new int[]{12, 34, 52, 6667, 888}));

        Main2 obj = new Main2();

        System.out.println(obj.pallindrome("java"));

        System.out.println(Main2.isPallindrome2("civi"));


    }

    public static String getFrequencyOfChars(String str) {

        String newString = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (!(newString.contains("" + ch))) {
                newString += "" + ch + count;
            }
        }

        return newString;

    }

    public static boolean isAnagram(String str1, String str2) {

        boolean isAnagram = true;

        if (str1.length() == str2.length()) {

            for (int i = 0; i < str1.length(); i++) {

                if (!(str2.contains("" + str1.charAt(i)))) {
                    isAnagram = false;
                    break;
                }
            }
        } else {

            isAnagram = false;
        }

        return isAnagram;
    }

    public static boolean isAnagram2(String str1, String str2) {

        if (str1.length() == str2.length()) {

            for (int i = 0; i < str1.length(); i++) {

                if (!(str2.contains("" + str1.charAt(i)))) {
                    return false;
                }
            }
        } else {

            return false;
        }

        return true;
    }


    public static int numberofChars(String str) {

        int length = 0;

        char[] chrArr = str.toCharArray();

        for (char eachChar : chrArr) {

            length++;

        }
        return length;

    }

    public static String smallestBiggestNum(int[] intArr) {

        int biggestNum = intArr[0];

        int smallestNum = intArr[0];


        for (int i = 0; i < intArr.length; i++) {

            if (intArr[i] > biggestNum) {
                biggestNum = intArr[i];
            }

            if (intArr[i] < smallestNum) {
                smallestNum = intArr[i];
            }
        }

        return "Biggest Number = " + biggestNum + " and Smallest Number = " + smallestNum;
    }


    public boolean pallindrome(String str) {

        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversedString = reversedString + str.charAt(i);
        }

        if (str.toLowerCase().equals(reversedString.toLowerCase())) {

            return true;

        }
        return false;

    }


    public static boolean isPallindrome2(String str) {

        boolean isPallindrome = true;

        for(int i = str.length() - 1, j = 0; i < str.length(); i++, j--) {

            if(str.charAt(i) != str.charAt(j)) {
                isPallindrome= false;
                break;
            }
        }

        return isPallindrome;
    }



}
