public class CheckArraysEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        for(String sub: word1) {
            first.append(sub);
        }

        for(String sub: word2) {
            second.append(sub);
        }

        return first.toString().equals(second.toString());
    }
}
