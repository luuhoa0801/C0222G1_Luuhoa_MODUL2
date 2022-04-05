package _04_class_and_objects_in_Java.exerise.stop_watch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.start());
        int [] array = new int[10000];
        for (int i = 0; i <10000 ; i++) {
            array[i] = (int) (Math.random()*10000);
        }

        for (int i = 0; i < 10000; i++) {
            int min = array[i] ;
            for (int j = i; j < 10000 -i; j++) {
                if (array[j] < min){
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }
        System.out.println(stopWatch.arrange(array));
        stopWatch.stop();
        System.out.println(stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime());
    }
}
