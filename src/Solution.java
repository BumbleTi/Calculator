import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in); // Сканер для ввода данных с клавиатуры
        System.out.println("Введите выражение над которым вы хотите произвести математическую операцию в одну строку через пробел");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a, znak, b;
        String[] array = bufferedReader.readLine().split(" ");
        a = array[0];
        znak = array[1];
        b = array[2];

        ArabNumber arabNumbers = new ArabNumber(); // класс для арабских цифр
        RimNumber rimNumbers = new RimNumber(); // класс для римских цифр
        OperationToRim operationToRim = new OperationToRim(); // класс для вывода ответа римских цифр

// Переменные

        int first = 0; // первое число
        int second = 0; // второе число
        int operation = 0; // ответ
        int firstArab = arabNumbers.arabNumber(a); // первое число при вводе арабской цифры
        int secondArab = arabNumbers.arabNumber(b); // второе число при вводе арабской цифры
        int firstRim = rimNumbers.rimNumber(a); // первое число при вводе римской цифры
        int secondRim = rimNumbers.rimNumber(b); // второе число при вводе римской цифры
        int arab = 0; // переменная-счётчик определения условия вывода арабских цифр
        int rim = 0; // переменная-счётчик определения условия вывода римских цифр

// Блок условий

        if (firstArab >= 0 && secondArab >= 0 && firstArab <= 10 && secondArab <= 10) // проверка для арабских цифр
        {
            first = firstArab;
            second = secondArab;
            //arab++;
        }
        else if (firstRim > 0 && secondRim > 0 && firstRim <= 10 && secondRim <= 10) // проверка для римских цифр
        {
            first = firstRim;
            second = secondRim;
            rim++;
        }
        else
        {
           System.out.println("Введённое число выходит за границы возможности программы");
            arab++; // Для вывода ответа arab должна быть = 0.
          // return;
        }
// выполнение математической операции
        try{ // выбрасывает исключение в случае отрицательного числа
        switch (znak) {
            case "+":
                operation = first + second;
                break;
            case "-":
                operation = first - second;
                break;
            case "*":
                operation = first * second;
                break;
            case "/":
                operation = first / second;
                break;
            default:{
                System.out.println("Арифметическая операция не может быть выполнена. Повторите ввод.");
                arab++;}
                //rim--;
        }
        }
        catch (Exception e)
        {
            System.out.println("В римской системе исчисления нет отрицательных чисел. повторите попытку");
        }
// Вывод
        if (rim != 0)
        {
            System.out.println("Результат вычисления римских цифр " + operationToRim.resultOperationToRim(operation));
        }
        else if (arab == 0)
        {
            System.out.println("Результат вычисления арабских цифр: " + operation);
        }

    }
}

