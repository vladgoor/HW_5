//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numTask = 2;
        switch (numTask) {
//====================================Task 1================================================
            case (1):
            int demensionOfFirstArr = 100;
            int demensionOfSecoundArr = 100;
            int[][] arr = new int[demensionOfFirstArr][demensionOfFirstArr];
            for (int countArrFirst = 0; countArrFirst < demensionOfFirstArr; countArrFirst++) {
                for (int countArrSecound = 0; countArrSecound < demensionOfSecoundArr; countArrSecound++) {
                    arr[countArrFirst][countArrSecound] = countArrSecound + 1;
                }
            }
            for (int countArrFirst = 0; countArrFirst < demensionOfFirstArr; countArrFirst++) {
                for (int countArrSecound = 0; countArrSecound < demensionOfSecoundArr; countArrSecound++) {
                    System.out.println("arr[" + countArrFirst + "][" + countArrSecound + "] = " + arr[countArrFirst][countArrSecound]);
                }
            }
            break;
//===================================================Task 2====================================
            case (2):
                int row = 5;
                int column = 4;
                int[][] arrTriangleTask2= new int[column][row];

            break;
        }
    }
}