class Solution {
    public boolean checkString(String s) {
      boolean ans=true;
      for(int i=0;i<s.length();i++){
        char curr=s.charAt(i);
        if((ans == true && curr =='b') || (ans ==false && curr =='b')){
            ans=false;
        }
        else if(ans==false && curr=='a'){
            return false;
        }
        else continue;
      }

      return true;  
    }
}