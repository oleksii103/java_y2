package lab_2;

import java.nio.charset.StandardCharsets;

public class lab_2 {
    public static void main(String[] args) {

        // 1. Символьний масив
        char[] arr = {
                'Н', 'Л', 'Т', 'У', ' ',
                'І', 'К', 'Н', 'і', 'Т', ' ',
                'І', 'П', 'З', '-',
                '2', '1', '/', '2', ' ',
                'І', 'н', 'ж', 'е', 'н', 'е', 'р', 'і', 'я', ' ', 'П', 'З'
        };

        String data = new String(arr);

        System.out.println("1. Початковий масив:");
        System.out.println(data);


        // 2. Рядок 1
         String string1 = new String(
            arr,
            0,
            arr.length - "Інженерія ПЗ".length()
        );

        System.out.println("\n2. Рядок 1:");
        System.out.println(string1);

        // 3. Рядок 2 — дзеркальне зображення рядка 1
        String string2 = new StringBuilder(string1).reverse().toString();

        System.out.println("\n3. Рядок 2:");
        System.out.println(string2);


        // 4. Рядок 3 — заміна малих букв на великі
        String string3 = string1.toUpperCase();

        System.out.println("\n4. Рядок 3:");
        System.out.println(string3);

        System.out.println("Рядки еквівалентні: "
                + string1.equalsIgnoreCase(string3));


        // 5. Вибрати з рядка 1 назву інституту
        String institute = string1.substring(
                string1.indexOf(" ") + 1,
                string1.indexOf(" ІПЗ")
        );

        System.out.println("\n5. Назва інституту:");
        System.out.println(institute);


        // 6. Рядок 4 — об'єднання рядка 1 і рядка 3
        String string4 = string1 + " " + string3;

        System.out.println("\n6. Рядок 4:");
        System.out.println(string4);


        // 7. Індекс першого і останнього входження букви
        char letter = 'і';

        int firstIndex = string1.indexOf(letter);
        int lastIndex = string1.lastIndexOf(letter);

        System.out.println("\n7. Буква: " + letter);
        System.out.println("Перше входження: " + firstIndex);
        System.out.println("Останнє входження: " + lastIndex);


        // 8. StringBuffer з особистими даними
        StringBuffer buffer = new StringBuffer(
                "Петрів Олексій Олексійович 20 6 2008"
        );

        System.out.println("\n8. StringBuffer:");
        System.out.println(buffer);


        // 9. Вилучити число і місяць народження
        int birthDay = buffer.indexOf("20");
        int birthYear = buffer.indexOf("2008");

        buffer.delete(birthDay, birthYear);

        System.out.println("\n9. Після вилучення числа і місяця:");
        System.out.println(buffer);


        // 10. Додати в кінець рядка місяць народження
        buffer.append("травень");

        System.out.println("\n10. Після додавання місяця:");
        System.out.println(buffer);


        // 11. Вставити після року стать
        int yearPosition = buffer.indexOf("2005") + 4;

        buffer.insert(yearPosition, " Чоловіча");

        System.out.println("\n11. Після вставлення статі:");
        System.out.println(buffer);


        // 12. Визначити довжину рядка в символах і байтах
        int characters = buffer.length();
        int bytes = buffer.toString()
                .getBytes(StandardCharsets.UTF_8)
                .length;

        System.out.println("\n12. Довжина рядка:");
        System.out.println("У символах: " + characters);
        System.out.println("У байтах UTF-8: " + bytes);


        // 13. Скоротити рядок, залишивши прізвище, ім'я та по батькові
        StringBuffer shortBuffer = new StringBuffer(
                "Петрів Олексій Олексійович 2005"
        );

        shortBuffer.delete(shortBuffer.indexOf(" 2005"),
                shortBuffer.length());

        System.out.println("\n13. Скорочений рядок:");
        System.out.println(shortBuffer);


        // 14. Дзеркальне зображення прізвища
        String surname = "Петрів";

        String reversedSurname =
                new StringBuilder(surname).reverse().toString();

        System.out.println("\n14. Дзеркальне зображення прізвища:");
        System.out.println(reversedSurname);
    }
}