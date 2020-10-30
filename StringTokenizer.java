public class StringTokenizer {

    String tekst;
    String delim;
    int indeks;

    public StringTokenizer(String source) {

        tekst = source;
        delim = "\n";
        indeks = 0;

    }

    public StringTokenizer(String source, String delimiters) {

        tekst = source;
        
        delim = delimiters;
        
        indeks = 0;

    }

    public boolean isDelimiter(char tegn) {
        System.out.println(delim.indexOf(tegn));
        if (delim.indexOf(tegn) == -1)
            return false;
        else
            return true;
    }

    public boolean hasMoreTokens(int index){
            if (index < (tekst.length()-1)) {
                return true;
            } else if (index == (tekst.length())) {
                if (!isDelimiter(tekst.charAt(index))){
                    return true;
                }
            }
            return false;
        }

    public String nextToken() {
        return "";
    }

    public String nextToken(String delimiters) {
        return "";
    }

    public int countTokens() {
        return 0;
    }

}
