class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] fina=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int curr=Integer.parseInt(String.valueOf(arr[i].charAt(arr[i].length()-1)));
            fina[curr-1]=arr[i].substring(0,arr[i].length()-1);
        }
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<fina.length-1;j++){
            sb.append(fina[j]);
            sb.append(" ");
        }

return sb.append(fina[fina.length-1]).toString();
        
    }
}