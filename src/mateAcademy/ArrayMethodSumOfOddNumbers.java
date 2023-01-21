package mateAcademy;
/*У цьому завданні ти обчислиш суму значень елементів масиву
та перевіриш значення на парність.
Реалізуй метод getSum(), який приймає масив цілих чисел numbers.
Метод повинен повернути суму елементів масиву.
Однак, не треба додавати до суми число, якщо воно парне (ділиться на 2 без залишку).
*/

public class ArrayMethodSumOfOddNumbers {
    public static int getSum(int[] numbers) {
        int sumOfOddNumbers = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                continue;
            }
            sumOfOddNumbers = sumOfOddNumbers + numbers[i];
        }
        return sumOfOddNumbers;
    }
    }
}
