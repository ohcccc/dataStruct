public class suanfa {
    public static void main(String[] args) {
        String s="We are happy.";
        StringBuilder B=new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' ')
                B.append("%20");
            else B.append(s.charAt(i));
        }
        B.toString();
    }
}
