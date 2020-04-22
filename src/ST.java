import org.w3c.dom.css.CSSUnknownRule;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Згенерувати текст який містить більше 10_000 символів (generator) - +
 * • Порахувати скільки в тексті є слів з довжиною 3, 5, 7 символів
 * • Порахувати скільки речень є в тесті - +
 * • Кожне друге речення перевести до верхнього регістру - +
 * • В кожному третьому реченні заміняти голосні на приголосні - +
 * • Останні три речення об'єднати в одне використовуючи коми - +
 * • Знайти скільки в тесті є дат (формати: 1996, 2003-02-01) - +
 * • Знайти суму всіх чисел в тесті - +
 * • В 17ому реченні всі слова вивести в зворотному порядку - +
 */
public class ST {

    static final String myString1 = new String("Far far away, behind the word mountains, " +
                "far from the countries Vokalia and 10 10 1001 , there live the blind texts. " +
                "The Line Lane. Pityful a rethoric question ran over her cheek, then she continued her way. " +
                "Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. " +
                "A small river named Duden flows by their place and supplies it with the necessary regelialia. " +
                "It is a paradisematic country, in which roasted parts of sentences fly into your mouth. " +
                "1 aaaaaaaaaa. 2 bbbbbbb. 3 aaaaayyyyyp. 1996, 2003-02-01."+
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
                "Lorem Ipsum decided to leave 2003-02-01 for the far World of Grammar. The Big Oxmox advised her not to do so, " +
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
                "their projects again and again. 2020 And if she hasn’t been rewritten, then they are still using her. " +
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
                "The copy warned the Little Blind Text, 10 that where it came from it would have been rewritten a thousand " +
                "times and everything that was left from its origin would be the word \"and\" and the Little Blind Text " +
                "should turn around and return to its own, safe country. But nothing the copy said could convince her " +
                "and so it didn’t take long until a few insidious Copy Writers ambushed her, made her drunk with Longe " +
                "and Parole and dragged her into their agency, where they abused her for their projects again and again. " +
                "And if she hasn’t been rewritten, then they are still using her. Far far away, behind the word 33, " +
                "far from the countries Vokalia and Consonantia, 2003-02-01 there live the blind texts. Separated they live in " +
                "Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden " +
                "flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, " +
                "in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control " +
                "about the blind texts it is an almost unorthographic life One day however a small line of blind text " +
                "by the name of Lorem Ipsum decided to leave for the far World of Grammar. The Big Oxmox advised her 01, " +
                "because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little " +
                "Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt and made herself " +
                "on the way. When she reached 2020 the first hills of the Italic Mountains, she had a last view back on the " +
                "skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own 12, ");

       

        public static void main(String[] args) {
            System.out.println("Hello!");
            System.out.println("");

            //Реверс рядка
            System.out.println("Let's reverse string!");
            System.out.println("Input number of string for next reverse: (default: 7)");
            Scanner inputNumber = new Scanner(System.in);
            int numberStrForRev = inputNumber.nextInt();
            System.out.println("Your \"normal\" string " + forRevers(numberStrForRev,myString1));
            System.out.println("Your \"reverse\" string " + revers(forRevers(numberStrForRev,myString1)));

            //Вивід кількості речень
            System.out.println("***");
            System.out.println("In your text is " + countStrings(myString1) + " strings");

            //Кожне друге речення перевести до верхнього регістру
            System.out.println("***");
            System.out.println("The second sentence iт upper case:");
            System.out.println(toUpperRegSecStr(myString1));

            //Останні три речення об'єднати в одне використовуючи коми
            System.out.println("***");
            System.out.println("Combine the last three sentences into one using commas");
            System.out.println(lastThree(myString1));


            //В кожному третьому реченні заміняти голосні на приголосні

            System.out.println("***");
            System.out.println("Replace vowels with consonants in every third sentence (I use \"*\")");
            System.out.println(loudAndConsonant(myString1));


            //Знайти суму всіх чисел в тесті
            System.out.println("***");
            System.out.println("Sum of all numbers in the test");
            System.out.println(sumNumbers(myString1));


            //Знайти скільки в тесті є дат (формати: 1996, 2003-02-01)
            System.out.println("***");
            System.out.println("Find how many dates are in the test (formats: 1996, 2003-02-01)");
            System.out.println(sumDates(myString1));

            //Порахувати скільки в тексті є слів з довжиною 3, 5, 7 символів
            System.out.println("***");
            System.out.println("Count how many words 3, 5, 7 characters are in the text");
            System.out.println(sumWords(myString1));
        }


     //----------------------------------------------------------------------------------------------------------------
    // В 17ому реченні всі слова вивести в зворотному порядку

    /* Метод знаходження рядка для реверса */
    static String forRevers(int numberStr, String myString){
        //numberStr - номер рядка, який потрібно "обернути"
        String forRevString = new String(); // рядок, для наступного реверсу який видає метод
        /*Масив рядків, що формується з вихідного рядка по символу крапки (.) (по реченнях) */
        String [] arrOfStrings = myString.split("\\.");
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

    //Порахувати скільки речень є в тесті
    static int countStrings(String myString){
        int countStrings = 0;
        /*Масив рядків, що формується з вихідного рядка по символу крапки (.) (по реченнях) */
        String [] arrOfStrings = myString.split("\\.");
        countStrings = arrOfStrings.length - 1; // кількість речень
        return countStrings;
    }

    //-----------------------------------------------------------------------------------------------------------------
    //Кожне друге речення перевести до верхнього регістру
    static String toUpperRegSecStr(String myString){
        String upStr = new String(); // рядок, зі зміненими другими реченнями
        /*Масив рядків, що формується з вихідного рядка по символу крапки (.) (по реченнях) */
        String [] arrOfStrings = myString.split("\\.");
        /*Новий масив рядків, що формується з існуючого масиву з заміною кожного 2 рядка */
        String [] newArrOfStrings = new String[arrOfStrings.length];

        for (int i = 0; i < arrOfStrings.length ; i++) {

            if (i%2 != 0) //кожен другий
                newArrOfStrings[i] = arrOfStrings[i].toUpperCase();
                else
                    newArrOfStrings[i] = arrOfStrings[i];

            //System.out.println(arrOfStrings[i]);
            //System.out.println(newArrOfStrings[i]);
        }
        /*Формуємо новий об'єкт класу StringBuilder для "відновлення" рядка з нового масиву рядків, додаємо крапки між реченнями*/
        StringBuilder newUpperString = new StringBuilder();
        for (int i = 0; i < arrOfStrings.length; i++) {
            newUpperString.append(newArrOfStrings[i]).append(".");
        }
        upStr = newUpperString.toString(); // формуємо новий змінений рядок для виводу

        return upStr;
    }

    //----------------------------------------------------------------------------------------------------------------------
    //Останні три речення об'єднати в одне використовуючи коми
    static String lastThree(String myString){
        String lastThreeString = new String();; // рядок, зформований з останніх трьох
        /*Масив рядків, що формується з вихідного рядка по символу крапки (.) (по реченнях) */
        String [] arrOfStrings = myString.split("\\.");
        String[] lt1 = new String[3]; //Масив для зберігання 3 останніх рядків реверснутий
        String[] lt2 = new String[3]; //Масив для зберігання 3 останніх рядків нормальний

        // Беремо 3 останні рядки з всього тексту
        for (int i = 0; i < 3; i++) {
            lt1[i] = arrOfStrings[arrOfStrings.length-1-i];
        }
        // реверсуємо створений масив для нормальної побудови рядка
        for (int i = 0; i < 3; i++) {
            lt2[i] = lt1[lt1.length-1-i];
        }
        // Формуємо рядок з  масиву методом join з java.util.Arrays з розділювачем слів комою
        lastThreeString = String.join(",",lt2);
        return lastThreeString;
    }

    //------------------------------------------------------------------------------------------------------------
    //В кожному третьому реченні заміняти голосні на приголосні
    static String loudAndConsonant(String myString){
        String lAndC = new String(); // рядок, зі зміненими голосними на приголосні
        /*Масив рядків, що формується з вихідного рядка по символу крапки (.) (по реченнях) */
        String [] arrOfStrings = myString.split("\\.");
        /*Новий масив рядків, що формується з існуючого масиву з заміною кожного 3 рядка */
        String [] newArrOfStrings = new String[arrOfStrings.length];


        //Формуємо новий масив
        for (int i = 0; i < arrOfStrings.length ; i++) {

                newArrOfStrings[i] = arrOfStrings[i];
        }
        //Міняємо букви у кожному 3 реченні методом арифметичної прогресії
        for (int i = 2; i < arrOfStrings.length ; i = i+3) {

            newArrOfStrings[i] = arrOfStrings[i].replaceAll("[aeiouyAEIOUY]", "*");

        }

        /*Формуємо новий об'єкт класу StringBuilder для "відновлення" рядка з нового масиву рядків, додаємо крапки між реченнями*/
        StringBuilder newlandDStr = new StringBuilder();
        for (int i = 0; i < arrOfStrings.length; i++) {
            newlandDStr.append(newArrOfStrings[i]).append(".");
        }
        lAndC = newlandDStr.toString(); // формуємо новий змінений рядок для виводу

        return lAndC;
    }

    //------------------------------------------------------------------------------------------------------
    /* Знайти суму всіх чисел в тесті*/
    static int sumNumbers(String myString){
        int sumNumb = 0; //кількість цифр
        int sum = 0;
        /*формуємо новий масив зі слів рядка по символу пробілу (по словах)*/
        String[] arrStr = myString.split("\\s");

        for (int i = 0; i < arrStr.length; i++) {
            //if (arrStr[i].matches("\\D*" + "[\\d]+" + "\\D*")) //цифри з комою чи буквою до чи після них
            if (arrStr[i].matches("[\\d]+"))
            {
                sumNumb = sumNumb + 1;
                sum = sum + Integer.parseInt(arrStr[i]);

            }
        }

        return sum;
    }
    //-------------------------------------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------------------------
    //Знайти скільки в тесті є дат (формати: 1996, 2003-02-01)
    static int sumDates(String myString){
        int sumD = 0; //лічильник кількості дат
        /*формуємо новий масив зі слів рядка по символу пробілу (по словах)*/
        String[] arrStr = myString.split("\\s");

        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].matches(("(\\D)*[\\d]{4}+(\\D)*")) ||
                    arrStr[i].matches(("(\\D)*([\\d]{4})([\\D])([\\d])+([\\D])([\\d]+)(\\D)*")))
            {
               // System.out.println(arrStr[i]);
                sumD = sumD + 1;
            }
        }

        return sumD;
    }
    //-------------------------------------------------------------------------------------------------------------------

    //Порахувати скільки в тексті є слів з довжиною 3, 5, 7 символів
    static int sumWords(String myString){
        int sumW = 0; //лічильник кількості слів
        /*формуємо новий масив зі слів рядка по символу пробілу (по словах)*/
        String[] arrStr = myString.split("\\s");

        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() == 3 || arrStr[i].length() == 5 || arrStr[i].length() == 7 )
            {
               // System.out.println(arrStr[i]);
                sumW = sumW + 1;
            }
        }

        return sumW;
    }


}
