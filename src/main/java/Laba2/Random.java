package Laba2;

public class Random{ 

   public static int Rnd(){
      int a = 1; // Начальное значение диапазона - "от"
      int b = 21; // Конечное значение диапазона - "до"

      int random_number = a + (int) (Math.random() * (b-a)); // Генерация 1-го числа
      //System.out.println("случайное число: " + random_number);
      return random_number;
   }
}