package javapracticeday5;
public class MethodOrnek {
    public static void main(String[] args) {
        /*
         * Bir method olusturunuz charSayisi ve 2 parameter ekleyiniz 1- char 2- String
         * char ch = 'p'; String str = “Ingilizce’de purple mor ve people insanlar
         * demektir"; int count = 0; Yukaridaki String te elinizdeki char ne kadar
         * tekrar etmisse o kadar return etsin for loop, increment ve if statements
         * kullanabilirsiniz
         */
        char ch = 'p';
        String str = "Ingilizce’de purple mor ve people insanlar";
     
        System.out.println(charSayisi(str,ch));
       
    }
    
    
    public static int charSayisi(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i) == ch) {
                count++;
            }
            
        }
        
        return count;
        
    }
    
}
