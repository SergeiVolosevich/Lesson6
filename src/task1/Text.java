package task1;


//В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите позицию,которую надо заменить: ");
        Integer k = Integer.parseInt(reader.readLine());
        System.out.println("Позиция равна: " + k);

        System.out.println("Введите текст: ");
        String text = reader.readLine();

        text.trim();
        System.out.println(text);

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > k) {
                StringBuffer buf = new StringBuffer(words[i]);
                buf.deleteCharAt(k - 1);
                buf.insert((k - 1), '@');
                words[i] = buf.toString();
                words[i] += " ";
            }
        }

        System.out.println("Откорректированный текст: ");
        for (String b : words) {
            System.out.print(b);
        }
    }
}
