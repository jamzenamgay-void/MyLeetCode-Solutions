class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder result = new StringBuilder(s.length());
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int j = 0; j + row < n; j += cycleLen) {

                result.append(s.charAt(j + row));
                int diagIdx = j + cycleLen - row;
                if (row != 0 && row != numRows - 1 && diagIdx < n) {
                    result.append(s.charAt(diagIdx));
                }
            }
        }

        return result.toString();
    }
}