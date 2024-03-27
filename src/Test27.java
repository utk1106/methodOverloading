public class Test27 {
    public void print(int i){
        System.out.println(i);
    }
    public void print(long i){
        System.out.println(i);
    } //print method is same in the both cases but argument type is different int long
    public void print(float f){
        System.out.println(f);
    }
    //all are instance methods

    //now below we will create instance of the class
    public static void main(String[] args) {
        Test27 t = new Test27();
        t.print(3);//int type
        t.print(3.3f);//float type
        t.print(10L);//long type
    }
}
