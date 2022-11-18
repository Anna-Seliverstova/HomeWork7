public class HomeWork7Task3 {
    public static void main(String[] args) {
        String str = "Listen to the news from today, read the text at the same time! Listen to the news from today - without reading the text.";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '-') {
                count++;
            }
        }
        System.out.println("The number of punctuations exists in the string is: " + count);
    }
}
