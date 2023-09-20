public class Switch1 {

    public static void main(String[] args) {

        int switchvalue = 1;

        /*switch (switchvalue) {
            case 1: //daca valoarea switchvalue  == 1 (case 1: )
                System.out.println("This value is 1");
                break; //daca switchvalue  1 => operatia se opreste
            case 3: //daca valoarea lui switchvalue == 3
                System.out.println("xxx");
                break;
            case 4: case 5: case 6: //daca switchvalue are valoarea 4, 5 sau 6
                System.out.println("asf");
                break;
        }*/
        //More code

        switch (switchvalue) {
            case 1 -> System.out.println("A");
            case 2 -> System.out.println("B");
            case 3 -> System.out.println("c");
        }
    }
}
