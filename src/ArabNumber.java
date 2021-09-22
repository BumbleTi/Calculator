class ArabNumber{

public static int arabNumber (String firstSecArab) //Публичный статический метод. Должно возвращаться число(int). Передаём строку (String)
    {
    String str2 = firstSecArab; // Переменная str2 принимает переданную строку.
    int num2 = saveArab(str2); //Переменная num2 присваивает результат выполнения метода saveArab по переводу строки в цифру.
    return num2; // Возвращается результат работы метода saveArab.
    }

    private static int saveArab (String str2) //Приватный статический метод. Должно возвращаться число(int). Передаём String (строку).
    {
        int y = -1; // переменная для присвоения в операторе switch-case.
        switch (str2)
        {
            case "0": // В случае передачи строки "0", переменной присвоится её числовое значение. И так по аналогии.
                y = 0;
                break;
            case "1":
                y = 1;
                break;
            case "2":
                y = 2;
                break;
            case "3":
                y = 3;
                break;
            case "4":
                y = 4;
                break;
            case "5":
                y = 5;
                break;
            case "6":
                y = 6;
                break;
            case "7":
                y = 7;
                break;
            case "8":
                y = 8;
                break;
            case "9":
                y = 9;
                break;
            case "10":
                y = 10;
                break;
        }
        return y; // возвращаем результат работы метода saveArab, который присваивается в переменную num2.
    }


}
