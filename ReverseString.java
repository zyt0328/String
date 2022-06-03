//LeetCode 344
class Solution {
    public void reverseString(char[] s) {
       
        int len = s.length;
        for(int i=0; i<(len/2); i++){
            int j = len-i-1;
            if(i >= j){
                break;
            }
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}

class Solution {
    public void reverseString(char[] s) {
        int r = s.length-1;
        int l = 0;
        while(l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
