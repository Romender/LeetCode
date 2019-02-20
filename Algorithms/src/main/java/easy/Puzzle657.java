package easy;

/**
 * There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves,
 * judge if this robot ends up at (0, 0) after it completes its moves.
 *
 * The move sequence is represented by a string, and the character moves[i] represents its ith move.
 * Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.
 *
 * Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once,
 * "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.
 *
 * Example 1:
 *
 * Input: "UD"
 * Output: true
 * Explanation: The robot moves up once, and then down once. All moves have the same magnitude,
 * so it ended up at the origin where it started. Therefore, we return true.
 *
 *
 * Example 2:
 *
 * Input: "LL"
 * Output: false
 * Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin.
 * We return false because it is not at the origin at the end of its moves.
 */
public class Puzzle657 {

    /**
     *
     * Loop through the string and check the values of x & y.
     *
     * @param moves String of moves as UDLR
     * @return If robot is at (0,0) true otherwise false.
     *
     * Runtime: 8 ms, faster than 92.22% of Java online submissions for Robot Return to Origin.
     * Memory Usage: 39.6 MB, less than 100.00% of Java online submissions for Robot Return to Origin.
     */
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0 ;
        for(char c : moves.toCharArray()) {
            switch (c) {
                case 'U' : x++; break;
                case 'D' : x--; break;
                case 'R' : y++; break;
                case 'L' : y--; break;
                default:
            }
        }
        return x == 0 && y == 0;
    }
}
