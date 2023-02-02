package mateAcademy;
/*
А тепер ти знайдеш частку входження символу в рядок. Ми вдосконалили нашу програму для збору
статистики з вебінарів. Після збору статистики вона відправляє дані на сервер у вигляді
рядку 111001010111011, де 1 - це студент, що зрозумів тему, а 0 - відповідно, ні.
Але було б корисно зрозуміти, якиа частка студентів, що засвоїли матеріал, тобто,
наскільки вебінар був ефективний. Твоє задання: реалізуй метод getSuccessRate(),
який приймає рядок statistic та повертає частку студентів, які зрозуміли матеріал,
у вигляді змінної типу double.
Наприклад:
getSuccessRate("11100"); // 0.6
getSuccessRate("11111"); // 1.0
getSuccessRate("00000"); // 0.0
getSuccessRate(""); // 0.0
 */
public class StringGetSuccessRate {
    public static double getSuccessRate(String statistic) {
        if (statistic.isEmpty()){
            return 0.0;
        }
        double counter = 0;
        char[] statisticArray = statistic.toCharArray();
        for (char student : statisticArray){
            if (student == '1'){
                counter++;
            }
        }
        return counter/statisticArray.length;
    }
}
