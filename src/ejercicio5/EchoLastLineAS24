class Echo2 {
    int count = 0;
    void hello (){
        System.out.println("hellooo...");
    }
}

public class EchoLastLineAs24 {
    public static void main(String[] args) {
        Echo2 e1 = new Echo2 ();
        Echo2 e2 = new Echo2 ();

        int x = 0;

        while(x < 4){
            e1.hello();

            e2 = e1;
            if (x > 0){
                e2.count = e2.count + 4;
            }
            if (x == 3){
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }

        System.out.println(e2.count);
    }
}