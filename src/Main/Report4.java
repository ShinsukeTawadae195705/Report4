public class Report4 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){//ここでのeは任意の文字
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println(e.getMessage());
        }
    }
}