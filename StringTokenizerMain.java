
public class StringTokenizerMain {
    public static void main(String[] args) {

        String source = "abc def ghi";
        String delims = " ,.";

        StringTokenizer str = new StringTokenizer(source, delims);
        System.out.println("Source length: " + source.length());
        
        for (int i = 0; i < source.length(); i++) {
            System.out.println("Char at " + (i+1) + " is delimiter: " + str.isDelimiter(source.charAt(i)));
            System.out.println("Source at " + (i+1) + " has more tokens: " + str.hasMoreTokens(i));
            System.out.println("Next token at " + (i+1) + ": " + str.nextToken());
            System.out.println("");
        }
    }
}