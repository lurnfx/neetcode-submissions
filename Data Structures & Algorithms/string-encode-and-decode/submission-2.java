class Solution {

    public String encode(List<String> strs) {
      StringBuilder encode = new StringBuilder();
        for(String str: strs){
            encode.append(str.length());
            encode.append("#");
            encode.append(str);   //5#Hellow5#World;
        }
        return encode.toString();
    }

    public List<String> decode(String str) {
         List<String> resList = new ArrayList<>();
         int n = str.length();
         int i = 0;

         while(i < n){
          int j = i;
         //it will give us the length for the string
          while(str.charAt(j) != '#'){
            j++;
          }
           //Then substring the length
           Integer value = Integer.parseInt(str.substring(i, j)); 
           //pass the #
            int start = j + 1;
            //this will substring after the ## till the value 
           String res = str.substring(start, start + value);
             resList.add(res);
             // Move i to the start of the next encoded segment
             i = start + value;
         }


         return resList;
    }
}
