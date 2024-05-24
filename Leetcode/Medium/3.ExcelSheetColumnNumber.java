// 171. https://leetcode.com/problems/excel-sheet-column-number/

class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int x = columnTitle.length() - 1;
        int ans = 0;
        int y = 0;
        while (y <= x) {
            char ch = columnTitle.charAt(y);
            int pow = (int) Math.pow(26, columnTitle.length() - 1 - y);
            pow *= (int) ch - 64;
            ans += pow;
            y++;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
    }
}

/*
 * Given a string columnTitle that represents the column title as appears in an
 * Excel sheet, return its corresponding column number.
 * 
 * For example:
 * 
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 
 * 
 * Example 1:
 * 
 * Input: columnTitle = "A"
 * Output: 1
 * Example 2:
 * 
 * Input: columnTitle = "AB"
 * Output: 28
 * Example 3:
 * 
 * Input: columnTitle = "ZY"
 * Output: 701
 * 
 * 
 * Constraints:
 * 
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 */