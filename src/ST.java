import java.util.Arrays;
import java.util.Scanner;

/**
 * Згенерувати текст який містить більше 10_000 символів (generator)
 * • Порахувати скільки в тексті є слів з довжиною 3, 5, 7 символів
 * • Порахувати скільки речень є в тесті
 * • Кожне друге речення перевести до верхнього регістру
 * • В кожному третьому реченні заміняти голосні на приголосні
 * • Останні три речення об'єднати в одне використовуючи коми
 * • Знайти скільки в тесті є дат (формати: 1996, 2003-02-01)
 * • Знайти суму всіх чисел в тесті
 * • В 17ому реченні всі слова вивести в зворотному порядку
 */
public class ST {

    static final String myString1 = new String("Far far away, behind the word mountains, " +
                "far from the countries Vokalia and 10 10 10, there live the blind texts. " +
                "the Line Lane. Pityful a rethoric question ran over her cheek, then she continued her way. " +
                "Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. " +
                "A small river named Duden flows by their place and supplies it with the necessary regelialia. " +
                "It is a paradisematic country, in which roasted parts of sentences fly into your mouth. " +
                "Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life " +
                "One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far " +
                "World of Grammar. The Big Oxmox advised her not to do so, because there were thousands of bad Commas, " +
                "wild Question Marks and devious Semikoli, but the Little Blind Text didn’t listen. " +
                "She packed her seven versalia, put her initial into the belt and made herself on the way. " +
                "When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of " +
                "her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, " +
                "the Line Lane. Pityful a rethoric question ran over her cheek, then she continued her way. " +
                "On her way she met a copy. The copy warned the Little Blind Text, that where it came from it would " +
                "have been rewritten a thousand times and everything that was left from its origin would be the word " +
                "\"and\" and the Little Blind Text should turn around and return to its own, safe country. " +
                "But nothing the copy said could convince her and so it didn’t take long until a few insidious " +
                "Copy Writers ambushed her, made her drunk with Longe and Parole and dragged her into their agency, " +
                "where they abused her for their projects again and again. And if she hasn’t been rewritten, " +
                "then they are still using her. Far far away, behind the word mountains, far from the countries " +
                "Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at " +
                "the coast of the Semantics, a large language ocean. A small river named Duden flows by their place " +
                "and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts " +
                "of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts" +
                " it is an almost unorthographic life One day however a small line of blind text by the name of " +
                "Lorem Ipsum decided to leave for the far World of Grammar. The Big Oxmox advised her not to do so, " +
                "because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the " +
                "Little Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt " +
                "and made herself on the way. When she reached the first hills of the Italic Mountains, " +
                "she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village " +
                "and the subline of her own road, the Line Lane. Pityful a rethoric question ran over her cheek, " +
                "then she continued her way. On her way she met a copy. The copy warned the Little Blind Text, " +
                "that where it came from it would have been rewritten a thousand times and everything that was left " +
                "from its origin would be the word \"and\" and the Little Blind Text should turn around and return to 10, " +
                "safe country. But nothing the copy said could convince her and so it didn’t take long until " +
                "a few insidious Copy Writers ambushed her, made her drunk with Longe and Parole and dragged her 100," +
                " where they abused her for their projects again and again. And if she hasn’t been rewritten, then they " +
                "are still using her. Far far away, behind the word mountains, far from the countries " +
                "Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right " +
                "at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place " +
                "and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of " +
                "sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts " +
                "it is an almost unorthographic life One day however a small line of blind text by the name of " +
                "Lorem Ipsum decided to leave for the far World of Grammar. The Big Oxmox advised her not to do so," +
                " because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the " +
                "Little Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt " +
                "and made herself on the way. When she reached the first hills of the Italic Mountains, 10.000 a.d. " +
                "she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village " +
                "and the subline of her own road, the Line Lane. Pityful a rethoric question ran over her cheek, " +
                "then she continued her way. On her way she met a copy. The copy warned the Little Blind Text, " +
                "that where it came from it would have been rewritten a thousand times and everything that was left " +
                "from its origin would be the word \"and\" and the Little Blind Text should turn around and return to 4, " +
                "safe country. But nothing the copy said could convince her and so it didn’t take long until " +
                "a few insidious Copy Writers ambushed her, made her drunk with Longe and Parole and dragged her " +
                "into their agency, where they abused her for their projects again and again. And if she hasn’t been 0.5, " +
                "then they are still using her. Far far away, behind the word mountains, far from the countries " +
                "Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right " +
                "at the coast of the Semantics, a large language ocean. A small river named Duden flows by their " +
                "place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted " +
                "parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind " +
                "texts it is an almost unorthographic life One day however a small line of blind text by the name of " +
                "Lorem Ipsum decided to leave for the far World of Grammar. The Big Oxmox advised her not to do so, " +
                "because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little " +
                "Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt and made " +
                "herself on the way. When she reached the first hills of the Italic Mountains, she had a last view " +
                "back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of " +
                "her own road, the Line Lane. Pityful a rethoric question ran over her cheek, then she continued her 21. " +
                "On her way she met a copy. The copy warned the Little Blind Text, that where it came from it would have " +
                "been rewritten a thousand times and everything that was left from its origin would be the word \"and\" " +
                "and the Little Blind Text should turn around and return to its own, safe country. But nothing the copy " +
                "said could convince her and so it didn’t take long until a few insidious Copy Writers ambushed her, " +
                "made her drunk with Longe and Parole and dragged her into their agency, where they abused her for " +
                "their projects again and again. And if she hasn’t been rewritten, then they are still using her. " +
                "Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, " +
                "there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, " +
                "a large language ocean. A small river named Duden flows by their place and supplies it with " +
                "the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences " +
                "fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an " +
                "almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum " +
                "decided to leave for the far World of Grammar. The Big Oxmox advised her not to do so, because " +
                "there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little Blind " +
                "Text didn’t listen. She packed her seven versalia, put her initial into the belt and made herself 12. " +
                "When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of " +
                "her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the 5. " +
                "Pityful a rethoric question ran over her cheek, then she continued her way. On her way she met a copy. " +
                "The copy warned the Little Blind Text, that where it came from it would have been rewritten a thousand " +
                "times and everything that was left from its origin would be the word \"and\" and the Little Blind Text " +
                "should turn around and return to its own, safe country. But nothing the copy said could convince her " +
                "and so it didn’t take long until a few insidious Copy Writers ambushed her, made her drunk with Longe " +
                "and Parole and dragged her into their agency, where they abused her for their projects again and again. " +
                "And if she hasn’t been rewritten, then they are still using her. Far far away, behind the word 33, " +
                "far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in " +
                "Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden " +
                "flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, " +
                "in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control " +
                "about the blind texts it is an almost unorthographic life One day however a small line of blind text " +
                "by the name of Lorem Ipsum decided to leave for the far World of Grammar. The Big Oxmox advised her 01, " +
                "because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little " +
                "Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt and made herself " +
                "on the way. When she reached the first hills of the Italic Mountains, she had a last view back on the " +
                "skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own 12, ");

       

        public static void main(String[] args) {
            System.out.println("Hello!");

            /* Реверс рядка*/
            System.out.println("Input number of string for next reverse: (default: 7)");
            Scanner inputNumber = new Scanner(System.in);
            int numberStrForRev = inputNumber.nextInt();
            System.out.println("Your \"normal\" string " + forRevers(numberStrForRev));
            System.out.println("Your \"reverse\" string " + revers(forRevers(numberStrForRev)));


        }


     //----------------------------------------------------------------------------------------------------------------
    // В 17ому реченні всі слова вивести в зворотному порядку

    /* Метод знаходження рядка для реверса */
    static String forRevers(int numberStr){
        //numberStr - номер рядка, який потрібно "обернути"
        String forRevString = new String(); // рядок, для наступного реверсу який видає метод
        /*Масив рядків, що формується з вихідного рядка по символу крапки (.) (по реченнях) */
        String [] arrOfStrings = myString1.split("\\.");
        /*Присвоюємо змінній forRevString рядок з масиву рядків відповідно до аргументу методу*/
        forRevString = arrOfStrings[numberStr];
        return forRevString;
    }

    /* Метод реверсу знайденого рядка */
    static String revers(String StringForReverse){
        String revString = new String();; // обернутий рядок, який видає метод*/
        /*формуємо новий масив зі слів рядка, призначеного для обертання по символу пробілу (по словах)*/
        String[] revArrOfString1 = StringForReverse.split("\\s");
        String[] revArrOfString2 = new String[revArrOfString1.length]; //Масив для зберігання "перевернутого" рядка
        for (int i = 0; i < revArrOfString1.length; i++) {
            //1 елементу "перевернутого" масиву присвоюємо останній елемент "нормального"
            revArrOfString2[i] = revArrOfString1[revArrOfString1.length - 1 - i];
        }
        // Формуємо рядок з "перевернутого" масиву методом join з java.util.Arrays з розділювачем слів пробілом
        revString = String.join(" ",revArrOfString2);
        return revString;
    }
    //-------------------------------------------------------------------------------------------------------------------
}
