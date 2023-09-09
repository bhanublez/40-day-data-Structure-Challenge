public class zigzagConversion {
    public String convert(String s, int numRows) {

        var sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }

        int index = 0, len = s.length();
        while ( index < len) {
            for (int i = 0; i < numRows && index < len; i++) 
                sbs[i].append(s.charAt(index++));
            for (int i = numRows - 2; i > 0 && index < len; i--)
                sbs[i].append(s.charAt(index++));
        }

        var result = new StringBuilder();
        for (int i = 0; i < numRows; i++)
            result.append(sbs[i]);
        
        return result.toString();
    }
}
