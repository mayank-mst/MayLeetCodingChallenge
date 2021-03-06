/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0

S and J will consist of letters and have length at most 50.
The characters in J are distinct.*/

class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> mSet = new HashSet<>();
        for(int i=0;i<J.length();i++){
            mSet.add(J.charAt(i));
        }
        int ans=0;
        for(int k=0;k<S.length();k++){
            if(mSet.contains(S.charAt(k)))
                ans++;
        }
        return ans;
    }
}