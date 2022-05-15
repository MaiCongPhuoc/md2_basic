package CountCharacterInString;
import java.lang.String;
public class CountCharacterInString {
    public static void main(String[] args) {
        String str = "MaiCongPhuoc";
        char character = 'i';
        int cout = 0;
        for (int i = 0; i < str.length();i++) {
            if (character == str.toLowerCase().charAt(i)) {
                cout++;
            }
        }
        System.out.printf("the number of occurrences of a character in a string is: %d", cout);
    }
}
