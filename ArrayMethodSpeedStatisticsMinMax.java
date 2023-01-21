public class ArrayMethodSpeedStatisticsMinMax {
    /*
Навчимося знаходити найбільше та найменше значення масиву, а потім повернемо їх у новому масиві.
Твоє завдання: реалізуй метод getSpeedStatistic(), який приймає масив швидкостей results
і повертає масив зі статистикою, у якому:
перший елемент - найменша швидкість;
другий елемент - найбільша швидкість.
Зверни увагу:

якщо вхідний масив порожній, поверни масив зі статистикою {0, 0};
якщо вхідний масив складається лише з одного елемента,
вважай його одночасно найменшою та найбільшою швидкістю.
*/
    public static int[] getSpeedStatistic(int[] results) {
        //Write code below this line

        int maxSpeed = 0;
        for (int i = 0; i < results.length; i++){
            if (maxSpeed <= results[i]){
                maxSpeed = results[i];
            }
        }
        int minSpeed = maxSpeed;
        for (int i = 0; i < results.length; i++){
            if (minSpeed >= results[i]){
                minSpeed = results[i];
            }
        }

        int[] speedStatisticMinMax = {minSpeed, maxSpeed};
        return speedStatisticMinMax;
        //Write code above this line
    }

}
