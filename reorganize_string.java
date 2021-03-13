package leetproblems;

public class reorganize_string {
    
}



class Solution {
    public String reorganizeString(String S) {
       StringBuffer sb = new StringBuffer(S);
        int len=sb.length();
       if(sb.length()==0 || sb.length()>500){
           return "";
       }
        char prev=sb.charAt(0),pres,fut;
        for(int i=1;i<sb.length()-1;i++){
            if(sb.charAt(i-1)==sb.charAt(i)){
                int count=0;
                for(int j=i;j<sb.length();j++){
                    if(sb.charAt(j)!=sb.charAt(i)){
                        count+=1;
                        String temp=sb.substring(i,i+1);
                        sb.replace(i,i+1,sb.substring(j,j+1));
                        sb.replace(j,j+1,temp);
                        break;
                    }
                }
                if(count==0){
                    return "";
                }
                
            }
            

        }
        if(sb.charAt(len-2)==sb.charAt(len-1)){
            return "";
        }
        return sb.substring(0,sb.length());
    }
}