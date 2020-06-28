package com.company.Strings;

public class stringsProblems {

    public static boolean isUnique(String string){
        int [] freq = new int[26];
       string =  string.toLowerCase();
        for(int i = 0; i < string.length(); i++) {
            int index = string.charAt(i) - 'a';
            freq[index] = freq[index] + 1;
        }

        for(int i = 0; i < freq.length; i++){
            if(!(freq[i] == 0 || freq[i] == 1)  ){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String name = "Mathhew";
       System.out.println(isUnique(name));
    }

}
