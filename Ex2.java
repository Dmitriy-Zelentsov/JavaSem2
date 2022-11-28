// Напишите метод, который сжимает строку. 
// Пример: aaaabbbcdd → a4b3cd2

public class Ex2 {
    public static void main(String[] args) {
        String s = "aaaabbbcdd";
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            count += 1;
            if (s.length() == 1){
                res.append(s);
            }
            if ((i+1) == s.length() || s.charAt(i) != s.charAt(i+1)){
                res.append(s.charAt(i));
                res.append(Integer.toString(count));
                count = 0;
            }
        }
        System.out.print(res);
    }
}
