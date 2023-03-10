package mateAcademy;
/*У цьому завданні ти обчислиш суму значень елементів масиву
та перевіриш значення на парність.
Реалізуй метод getSum(), який приймає масив цілих чисел numbers.
Метод повинен повернути суму елементів масиву.
Однак, не треба додавати до суми число, якщо воно парне (ділиться на 2 без залишку).
*/

public class ArrayMethodSumOfOddNumbers {
    public static int getSum(int[] numbers) {
        //Спочатку створюємо перемінну,до якої будуть додаватись всі непарні значення:
        int sumOfOddNumbers = 0;
        //Потім проітеруємо масив, щоб дістати доступ до кожного значення:
        for (int i = 0; i < numbers.length; i++){
            //Далі ділитимемо всі значення з масиву numbers[] на 2
            // і перевіряємо, чи дає воно в остачі 0:
            if (numbers[i] % 2 == 0){
                //Якщо значення дає 0 в остачі, отже воно парне і тому ми цого пропускаємо:
                continue;
            }
            //Значення, що лишились від ітерування почергово додаються до перемінної
            sumOfOddNumbers = sumOfOddNumbers + numbers[i];
        }
        return sumOfOddNumbers;
    }
}
/*Розв'язок ментора:

public class IgnoreEvenNumbers {
    public static int getSum(int[] numbers) {
        int result = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                continue;
            }
            result += number;
        }

        return result;
    }
}
 */