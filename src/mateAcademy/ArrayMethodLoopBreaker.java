package mateAcademy;
/*Тепер знайдемо суму значень елементів масиву, починаючи з його середини.
Ми створили метод getSum(), який приймає масив цілих чисел numbers.
Твоє завдання: реалізуй метод getSum(), дотримуючись певних умов:
метод повинен повернути суму значень елементів, починаючи із середини масиву.
Для цього, при оголошенні циклу, замість int i = 0; підстав коректний вираз;
якщо зустрінеш число 1, вийди повністю з усього циклу за допомогою оператору break (не додавай 1 до суми);
не використовуй оператор continue. */

public class ArrayMethodLoopBreaker {
    public static int getSum(int[] numbers) {
        int result = 0;
        for (int i = numbers.length/2; i < numbers.length; i++){
            if (numbers[i] == 1){
                break;
            }
            result = result + numbers[i];
        }
        return result;
    }

}
