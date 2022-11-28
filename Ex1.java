
// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N,
//  которая состоит из чередующихся символов c1 и c2, начиная с c1.


public class Ex1 {
    public static void main(String[] args) {
        int n = 8;
        String c1 = "1";
        String c2 = "+";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++){
            if (i % 2 ==0 ){
                s.append(c1);
            }
            else{
                s.append(c2);  
            }
        }
        System.out.print(s);
    }
}