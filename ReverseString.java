public class ReverseString {
    public void reverseString(char[] s) {
        int n = s.length;
        int mid = n/2;
        char temp = 0;
        for (int i= 0; i<(s.length/2); i++){
            temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
    }
}
