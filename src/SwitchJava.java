public class SwitchJava {
    public static void main(String[] args) {
        int switchval=5;

        switch (switchval){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2: case 3: case 5:
                System.out.println("Val 2");
                break;
            default:
                System.out.println("not 1 or 2");
                break;
        }
    }
}
