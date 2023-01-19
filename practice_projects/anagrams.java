package practice_projects;

class Anagrams {
    boolean areKAnagrams(String str1, String str2, int k) {
        int string_one = str1.length();
        int string_two = str2.length();
        int n = 0;
        char[] s1_array;
        char[] s2_array;
        char temp;
        boolean output=false;
        s1_array = new char[string_one];
        s2_array = new char[string_two];
        
        if(string_one == string_two){
            System.out.print(str1);
            System.out.println(str2);
            for(int i = 0; i< string_one;i++){
                 s1_array[i] =  str1.charAt(i);
                 s2_array[i] =  str2.charAt(i);
            }
            
            for(int i = 0; i< s1_array.length;i++){
                 System.out.print(s1_array[i]);
                 
            }
            System.out.print("\n");
            for(int i = 0; i< s2_array.length;i++){
                 System.out.print(s2_array[i]);
                 
            }
            
            for(int i = 0 ; i< s1_array.length; i++){
                
                for(int j = i + 1; j < s1_array.length; j++){
                    if(s1_array[i] > s1_array[j] ){
                        temp = s1_array[i];
                        s1_array[j] = s1_array[i];
                        s1_array[i] = temp;
                        
                    }
                }
                
                for(int j2 = i + 1; j2< s2_array.length; j2++){
                    if(s2_array[i] > s2_array[j2] ){
                        char temp2 = s2_array[i];
                        s2_array[j2] = s2_array[i];
                        s2_array[i] = temp2;
                        
                    }
                }
            }
            
            for(int i=0;i< s1_array.length; i++){
                System.out.print(s1_array[i]);    
            }
            System.out.print("\n");
            for(int i=0; i< s2_array.length; i++){
                System.out.print(s2_array[i]);
            }
            
            for(int i =0 ; i < s2_array.length; i++){
                if(s1_array[i] != s2_array[i]){
                  
                   n = n + 1;
                   if (n <= k){
                       output = true;
                   }
                }
            }
        }
        
        
        return output;
    }
}
