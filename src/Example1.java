



public class Example1 {
    public static void main(String[] args) {
        int figure = 11;
        int i; // переменная задает число, необходимое для расчета количества строк
        int j; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int z; // переменная необоходима для вывода служебного сообщения о количестве символов в в строке)

        for (i = 1; i <= figure; i++) {
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = -12; j < figure; j++){
                System.out.print("+");
                z = z+1;

            }
            System.out.println(" Количество символов  в строке " + z);

        }

    }
}
