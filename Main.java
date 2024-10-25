public class Main {
    public static int CheckPassword(String str, int n) {
        if (n < 4) {
            return 0;
        }

        boolean Digit = false;
        boolean Capital = false;

        if (Character.isDigit(str.charAt(0))) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                Digit = true;
            }

            if (Character.isUpperCase(ch)) {
                Capital = true;
            }

            if (ch == ' ' || ch == '/') {
                return 0;
            }
        }

        // return Digit && Capital ? 1 : 0;
        if(Digit && Capital)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        String password1 = "aA1_67";
        int result1 = CheckPassword(password1, password1.length());
        System.out.println("Output 1: " + result1);

        String password2 = "a987 abC012";
        int result2 = CheckPassword(password2, password2.length());
        System.out.println("Output 2: " + result2);
    }
}