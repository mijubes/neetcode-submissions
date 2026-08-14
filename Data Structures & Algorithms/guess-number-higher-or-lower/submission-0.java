/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int target = low+(high-low)/2;
        while(guess(target)!=0) {
            target = low+(high-low)/2;
            if(guess(target)==-1)
                high = target-1;
            else
                low = target+1;
        }
        return target;
    }
}