
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        //what if I just used all the ram?
        int[] allChars = new int[(int)Character.MAX_VALUE + 1];
        int max = 0;
        char maxChar = ' ';
        for(int i = 0; i<str.length() ; i++){
            allChars[(int)str.charAt(i)] += 1;
            if(allChars[(int)str.charAt(i)] > max){
                max = allChars[(int)str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }
        return maxChar;
    }
}
