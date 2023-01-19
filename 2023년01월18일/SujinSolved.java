class Solution {
    public int solution(String s) {
        String[] str = {"zero", "one", "two", "three", "four", "five", 
                        "six", "seven", "eight", "nine"};
        
        for(int i=0; i<str.length; i++){
            s = s.replaceAll(str[i], Integer.toString(i));
        }
        
        int answer = Integer.parseInt(s);
        
        return answer;
    }
}
