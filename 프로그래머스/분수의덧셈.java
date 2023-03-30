
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        numer1 = numer1 * denom2;
        numer2 = numer2 * denom1;
        int denom3 = denom1 * denom2;
        int num = numer1 + numer2;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && denom3 % i == 0) {
                num = num / i;
                denom3 = denom3 / i;
                i = 1;
            }
        }
        int[] answer = { num, denom3 };
        return answer;

    }
}
