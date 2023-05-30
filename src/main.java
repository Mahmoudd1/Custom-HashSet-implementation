public class main {
    public static void main(String[] args) {
        myHashSet myset=new myHashSet();
        myset.add(5);
        myset.add(1);
        myset.add(1);
        myset.remove(1);
        System.out.println(myset.contains(1));
    }
}
