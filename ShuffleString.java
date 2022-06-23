class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for(int i = 0; i < indices.length; i++) {
            int index = indices[i];
            result[index] = s.charAt(i);
        }
        return String.valueOf(result);
    }
}