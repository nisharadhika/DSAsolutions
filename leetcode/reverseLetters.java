//leetcode 917

class Solution {
    public String reverseOnlyLetters(String s) {
    char[] str=s.toCharArray();
    int start =0,end=str.length-1;
    while(start<end){
    if(!Character.isLetter(str[start])){
        start++;
    }
    else if(!Character.isLetter(str[end])){
        end--;
    }
    else{
               char temp=str[start];
               str[start]=str[end];
               str[end]=temp;
               start++;
               end--;
    }
    }
    return new String(str);
    }
    
    
    }
