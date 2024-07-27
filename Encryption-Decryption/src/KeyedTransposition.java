public class KeyedTransposition {
    private String fillText(String text) {
        while (text.length() % 5 != 0) {
            text += "X";
        }
        return text;
    }

    public String cipherText(String text) {
        text = text.toUpperCase();
        text = text.replaceAll("\\s+", "");
        text = fillText(text);
        int[] key = new int[] { 1, 3, 2, 0, 4 };
        String cipherText = "";
        for (int i = 0; i < (text.length() / 5); i++) {
            for (int j = 0; j < key.length; j++) {
                cipherText += text.charAt(key[j] + (i * 5));

            }

        }
        return cipherText;
    }

}
