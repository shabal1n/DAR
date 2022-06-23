class SumOfOddLength {
    public int sumOddLengthSubarrays(int[] arr) {
        if (arr.length == 1) return arr[0];
        int oddCounter = 1;
        int counter = arr.length;
        int sum = 0;

        while (oddCounter <= arr.length) {
            for (int i = 0; i < counter; i++) {
                for (int j = 0; j < oddCounter; j++) {
                    sum += arr[j + i];
                }
            }
            oddCounter += 2;
            counter -= 2;
        }
        return sum;
    }
}