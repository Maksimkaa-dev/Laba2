package Laba2;

public class Random{ 

   public static int Rnd(){
      int a = 1; // ��������� �������� ��������� - "��"
      int b = 21; // �������� �������� ��������� - "��"

      int random_number = a + (int) (Math.random() * (b-a)); // ��������� 1-�� �����
      //System.out.println("��������� �����: " + random_number);
      return random_number;
   }
}