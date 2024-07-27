public class Vigenere {
    private String keyGenerator(String text, String key) {
        int x = key.length();
        for (int i = 0; i < text.length() - x; i++) {
            key += key.charAt(i % x);
        }
        return key;

    }

    public String cipherText(String text, String key) {
        text = text.toUpperCase();
        key = key.toUpperCase();
        text = text.replaceAll("\\s+", "");
        key = key.replaceAll("\\s+", "");
        String cipherText = "";
        String fullKey = keyGenerator(text, key);
        for (int i = 0; i < text.length(); i++) {
            int x = (text.charAt(i) + fullKey.charAt(i)) % 26;
            x += 'A';
            cipherText += (char) x;
        }
        return cipherText;

    }

}
