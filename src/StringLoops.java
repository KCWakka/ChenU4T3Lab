public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }


    /* Returns the number of times "character" appears in "searchString"
    This should be NON-case sensitive!


    Examples:
    - if character = "a" and searchString = "Apple and banana",
    this method returns 5 (it finds BOTH "A" and "a")
    - if character = "A" and searchString = "Apple and banana",
    this method returns 5 (it finds BOTH "A" and "a")
    - if character = "!" and searchString = "Hello! Nice day!",
    this method returns 2


    DO THIS WITH A FOR LOOP
    */
    public int countCharacters(String character, String searchString) {
        /* to be implemented */
        int counter = 0;
        searchString = searchString.toLowerCase();
        character = character.toLowerCase();
        for (int i = 0; i < searchString.length(); i ++) {
            if (searchString.substring(i, i +1).equals(character)) {
                counter ++;
            }
        }
        return counter;
    }


    /* Returns the original string reversed


    Examples:
    - if origString = "hello!" this method returns "!olleh"
    - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        /* to be implemented */
        String tempStr = "";
        for (int i = origString.length() - 1; i >= 0; i--) {
            tempStr += origString.substring(i , i + 1);
        }
        return tempStr;
    }

    public String removeA(String str) {
        String tempStr = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i ++) {
            if (str.substring(i, i +1).equals("a")) {

            } else {
                tempStr += str.substring(i, i +1);
            }
        }
        return tempStr;
    }
    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
        /* to be implemented */
        String newStr = "";
        for (int i = 0; i < origStr.length(); i ++) {
            if (origStr.substring(i, i + 1).equals(searchChar)) {
                newStr += replaceChar;
            } else {
                newStr += origStr.substring(i, i + 1);
            }
        }
        return newStr;
    }
    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
        /* to be implemented */
        int i = 0;
        while (origStr.indexOf(searchChar) != -1) {
            i = origStr.indexOf(searchChar);
            origStr = origStr.substring(0, i ) + replaceChar + origStr.substring(i +1 );
        }
        return origStr;
    }
    public int countString(String searchString, String origString) {
        /* to be implemented */
        int value = searchString.length();
        int counter = 0;
        for (int i = 0; i < origString.length() - value + 1 ; i ++) {
            if (origString.substring(i, i + value ).equals(searchString)) {
                counter ++;
            }
        }
        return counter;
    }
    public String removeString(String searchString, String origString) {
        /* to be implemented */
        int i = 0;
        int value = searchString.length();
        while (origString.indexOf(searchString) != -1) {
            i = origString.indexOf(searchString);
            origString = origString.substring(0, i) + origString.substring(i + value);
        }
        return origString;
    }
    public void commaSeparated(int fromNum, int toNum) {
        /* to be implemented */
        if (fromNum >= toNum) {
            for (int i = fromNum; i >= toNum; i--) {
                System.out.print(i);
                if (i > toNum) {
                    System.out.print(", ");
                }
            }
        } else {
            for (int i = fromNum; i <= toNum; i++) {
                System.out.print(i);
                if (i < toNum) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
    public boolean isPalindrome(String myString) {
        /* to be implemented */
        String newstr = removeString(" ", myString);
        if (reverseString(newstr).equals(newstr)) {
            return true;
        } else {
            return false;
        }
    }

}

