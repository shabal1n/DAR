class FindNUnique {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        n = n / 2;

        while(left < right) {
            result[left] = n * -1;
            result[right] = n;
            n--;
            left++;
            right--;
        }
        if(result.length % 2 != 0) result[left] = 0;
        return result;
    }
}