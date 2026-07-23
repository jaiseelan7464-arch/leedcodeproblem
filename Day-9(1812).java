
class Solution {
    public boolean squareIsWhite(String coordinates) {

        char col = coordinates.charAt(0);
        char row = coordinates.charAt(1);

        int c = col - 'a' + 1;
        int r = row - '0';

        return (c + r) % 2 == 1;
    }
}
