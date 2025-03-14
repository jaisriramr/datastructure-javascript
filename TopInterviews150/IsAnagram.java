/*
 * uses array of length 26 and Unicode which is for a = 96, and so on. we return false if there are value greater than 0
 * i.e every value inside must be 0 as if it is valid anagram it will cancel out the increment
 * 
 */
class IsAnagram {
    public boolean isValidAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        // s = "acc" t = "cac";


        int[] count = new int[26];
        // [0,0,0 ... 26];
        // 26 

        // for(char ch: s.toCharArray()) {
        //     count[ch - 'a']++;
        //     System.out.println("Increment " + ch + " " + Arrays.toString(count));
            
            
        // }

        // 100

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // -> for loop
            count[t.charAt(i) - 'a']--;
        }

        // 100 * 100;

        System.out.println("-----------------");
        // [1, 0, 2,0,0]

        //100
        // for(char ch: t.toCharArray()) {
        //     count[ch - 'a']--;
        //     System.out.println("Decrement " + ch + " " + Arrays.toString(count));
        // }

        for(int num: count) {
            if(num != 0) return false;
        }


        return true;
    }

    public static void main(String[] args) {
        IsAnagram an = new IsAnagram();
        System.out.println(an.isValidAnagram("acc", "ccc"));
    }    
}
