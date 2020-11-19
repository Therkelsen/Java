
package src.stringtokenizer;

public class StringTokenizerMain {
    public static void main(String[] args) {

        String source = "This is not ok.";
        String delims = " ,.";

        StringTokenizer str = new StringTokenizer(source, delims);
        System.out.println("Source \"" + str.getSource() + "\" Has length: " + source.length() + " characters");
        System.out.println("Analyzing source");
        System.out.println();

        for (int i = 0; i < source.length(); i++) {
            if(!str.hasMoreTokens()) {
            System.out.println("No more characters in source");
            str.indeks = 0;
            break;
            } else {
                System.out.println("Char at " + (i+1) + " is delimiter: " + str.isDelimiter(source.charAt(i)));
                System.out.println("Source at " + (i+1) + " has more tokens: " + str.hasMoreTokens());
                System.out.println("Next token at " + (i+1) + ": " + str.nextToken());
                System.out.println("");
            }

        }
        System.out.println("Total tokens: " + str.countTokens());
    }
}