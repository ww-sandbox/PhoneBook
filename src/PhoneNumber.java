public abstract class PhoneNumber {
    private static int numCount = 0;
    private int id;
    PhoneNumber(){

        id = ++numCount;
    }

    public int getId(){
        return id;
    }

    public void printId(){
        System.out.println(id);
    }

    public static void printNumCount(){
        System.out.println(numCount);
    }
}
