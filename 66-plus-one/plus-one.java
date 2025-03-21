class Solution {
    public int[] plusOne(int[] digits) {
        int end = digits.length;
        for (int i = end-1;i>= 0;i--){
            if (digits[i] < 9 ) {
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        int[] newdigits= new int[end+1];
        newdigits[0]=1;
        return newdigits;
        // digits[end]+=1;
        // for (int i=0;i<digits.length;i++){
        //     System.out.print(digits[i]);
            
        // }
        // int[] newdigits = new int[end+2];
        // newdigits[0]=1;
        // return newdigits;

        
    }
}