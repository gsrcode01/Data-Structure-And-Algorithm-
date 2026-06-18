package StackAndQueue;
/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class GuessTheNumberHigherOrLower {
    public int guessNumber(int n) {

        int l = 1;
        int r = n;

        while (l <= r) {

            int m = l + (r - l) / 2;

            int guessValue = guess(m);

            if (guessValue == 0) {
                return m;
            }
            else if (guessValue < 0) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }

        return -1;
    }
}
