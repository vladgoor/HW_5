//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numTask = 3;
        switch (numTask) {
//====================================Task 1================================================
            case (1):
            int demensionOfFirstArr = 100;
            int demensionOfSecoundArr = 100;
            int[][] arr = new int[demensionOfFirstArr][demensionOfSecoundArr];
            for (int countArrFirst = 0; countArrFirst < demensionOfFirstArr; countArrFirst++) {
                for (int countArrSecound = 0; countArrSecound < demensionOfSecoundArr; countArrSecound++) {
                    arr[countArrFirst][countArrSecound] = countArrSecound + 1;
                    System.out.println("arr[" + countArrFirst + "][" + countArrSecound + "] = " + arr[countArrFirst][countArrSecound]);
                }
            }
            break;
//===================================================Task 2====================================
            case (2):
                int rowTriangleTask2 = 4;
                int columnTriangleTask2 = 5;
                //int[][] arrTriangleTask2 = new int[row + 1][columnTriangleTask2 + 1];

            break;
//====================================Task 3================================================
            case (3):
                int rowTriangleTask3 = 3;
                int columnTriangleTask3 = 3;
                char[][] arrTriangleTask3 = new char[rowTriangleTask3 + 1][columnTriangleTask3 + 1];
                for (int countRowTriangleTask3 = 0; countRowTriangleTask3 < rowTriangleTask3; countRowTriangleTask3++){
                    for (int countColumnTriangleTask3 = 0; countColumnTriangleTask3 < columnTriangleTask3; countColumnTriangleTask3++){
                        arrTriangleTask3[countColumnTriangleTask3][countRowTriangleTask3] = '1';
                        if(arrTriangleTask3[countRowTriangleTask3][countColumnTriangleTask3] != '1'){
                            arrTriangleTask3[countRowTriangleTask3][countColumnTriangleTask3] = ' ';
                        }
                        System.out.print(arrTriangleTask3[countRowTriangleTask3][countColumnTriangleTask3] );
                    }
                    System.out.println("");
                }












            break;
        }
    }
}