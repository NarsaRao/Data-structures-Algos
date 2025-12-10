class Solution {

    public boolean chec(String c){
        for(int i=0;i<c.length();i++){
            if(Character.isDigit(c.charAt(i))==false){
              return false;
            }
        }
        return true;
    }

    public boolean areNumbersAscending(String s) {
        int prev=Integer.MIN_VALUE;
        String[] arr=s.split("\\s+"); 
        for(int i=0;i<arr.length;i++){
            if(chec(arr[i])){

           int val=Integer.parseInt(arr[i]);
           if(val<=prev) return false;
           prev=val;
            }
        }
        return true;
    }
}