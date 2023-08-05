package seminar03.counter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

        try(Counter count = new Counter()){
            count.add();
            System.out.println(count.getCount());
        }catch (Exception e){
            throw new IOException(e);
        }

//        Counter counter = new Counter();
//
//        try {
//            counter.add();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//
//        System.out.println(counter.getCount());
//
//        try {
//            counter.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try {
//            counter.add();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//
//        System.out.println(counter.getCount());

    }
}
