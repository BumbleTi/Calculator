class RimNumber{

    public static int rimNumber (String firstSecRim)//Публичный статический метод. Должно возвращаться число(int). Передаём строку (String)
    {
      String str1 = firstSecRim; // Переменная str1 принимает переданную строку.
       int num1 = saveRim(str1); //Переменная num1 присваивает результат выполнения метода saveRim по переводу строки в цифру
        return num1; // Возвращается результат работы метода saveRim.
    }

    private static int saveRim (String str1)
    {
        int x = 0; // =0, иначе ошибка при вызове return из-за отсутствия инициализации
        switch (str1)
        {
            case "I": // В случае передачи строки "I", переменной присвоится её числовое значение. И так по аналогии.
                x = 1;
                break;
            case "II":
                x = 2;
                break;
            case "III":
                x = 3;
                break;
            case "IV":
                x = 4;
                break;
            case "V":
                x = 5;
                break;
            case "VI":
                x = 6;
                break;
            case "VII":
                x = 7;
                break;
            case "VIII":
                x = 8;
                break;
            case "IX":
                x = 9;
                break;
            case "X":
                x = 10;
                break;
        }
        return x;
    }
}
