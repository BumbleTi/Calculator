class OperationToRim{

    public static String resultOperationToRim (int res) // Публичный статический метод. Должно возвр. String, передаем int.
    {
        int resultRim = res;
        String result = operationToRim(resultRim);
        return result;

    }
    private static String operationToRim (int x) // Приватный статический метод. возврат String, передает int.
    {
    String resultMet; // null. Её возвращаем
        String pars = Integer.toString(x); // Представление десятичного числа. Метод возвращает строковый объект определенного целочисленного значения.
        char[] str = pars.toCharArray(); // Преобразует данную строку в новый массив символов. Делаем из строки массив чаров
        String x1 = null; // Счётчик для первого "числа"
        String x2 = null; // Счётчик для второго "числа"

// Логика такова. Проверяем длину строки и из неё "собираем" ответ на основании массива чаров. Для [0] "первое" число
// Для [1] "второе" число. Максимум, что мы можем получить - [3], т.к. 100 (10*10) согласно условию ввода. Сумма строк есть результат.

        if (str.length == 0) // если длина массива = 0
        {
            System.out.println("Критическая ошибка"); // Никогда не выкинется, но пусть будет)
        }
        if (str.length == 1) // если длина массива = 1
        {
        switch (str[0])
            {
                case '1': //1
                    x1 = "I";
                    break;
                case '2': //2
                    x1 = "II";
                    break;
                case '3': //3
                    x1 = "III";
                    break;
                case '4': //4
                    x1 = "IV";
                    break;
                case '5': //5
                    x1 = "V";
                    break;
                case '6': //6
                    x1 = "VI";
                    break;
                case '7': //7
                    x1 = "VII";
                    break;
                case '8': //8
                    x1 = "VIII";
                    break;
                case '9': //9
                    x1 = "IX";
                    break;
            }
            x2 = ""; //пустота
        }
        else if (str.length == 2) // если длина массива = 2
        {
            switch (str[0])
            {
                case '1': //10
                    x1 = "X";
                    break;
                case '2': //20
                    x1 = "XX";
                    break;
                case '3': //30
                    x1 = "XXX";
                    break;
                case '4': //40
                    x1 = "XL";
                    break;
                case '5': //50
                    x1 = "L";
                    break;
                case '6': //60
                    x1 = "LX";
                    break;
                case '7': //70
                    x1 = "LXX";
                    break;
                case '8': //80
                    x1 = "LXXX";
                    break;
                case '9': //90
                    x1 = "XC";
                    break;
            }
            switch (str[1])
            {
                case '1': //1
                    x2 = "I";
                    break;
                case '2': //2
                    x2 = "II";
                    break;
                case '3': //3
                    x2 = "III";
                    break;
                case '4': //4
                    x2 = "IV";
                    break;
                case '5': //5
                    x2 = "V";
                    break;
                case '6': //6
                    x2 = "VI";
                    break;
                case '7': //7
                    x2 = "VII";
                    break;
                case '8': //8
                    x2 = "VIII";
                    break;
                case '9': //9
                    x2 = "IX";
                    break;
                case '0': // 0
                    x2 = "";
                    break;
            }
        }
        else if (str.length == 3) // если длина массива = 3
        {
            x1 = "C"; // 100 - по условиям задачи максимальное число при умножении 10 на 10.
            x2 = ""; // пустота
        }
     resultMet = x1 + x2;
        return resultMet;
    }
}

