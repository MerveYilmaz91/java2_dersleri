package gun13;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] numbers = {{3,4,5},{3,2,1}}; //2*3 lük bir tablo

        System.out.println("2.satir, 3.sütun -> " +numbers[1][2]);
        System.out.println("1.satir,2.sütun -> " +numbers[0][1]);

        System.out.println("--------");

        for (int i = 0; i < numbers.length; i++) {   //satir
            //numbers.length -> satır sayısı
            for (int j = 0; j < numbers[i].length; j++) {  //sutun
                //numbers[i].length -> satırdaki sutun sayısı
                System.out.print(numbers[i][j] + " ");   //sutunları yazacak.
            }
            System.out.println(); //satırlar arası boşuk bıraksın diye ekledik.
        }
        System.out.println("---------");
        int[][] degiskenYapi = {{1,2},{3,4,5,6},{4,5,6}};
        for (int i = 0; i < degiskenYapi.length; i++) {
            for (int j = 0; j < degiskenYapi[i].length; j++) {
                System.out.print(degiskenYapi[i][j] + " ");
            }
            System.out.println();
        }





    }
}
