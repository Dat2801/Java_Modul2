public class main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Đang đếm thời gian");
        for (int i=1; 1 <= 100000;i++){
            stopWatch.stop();
            stopWatch.getElapsedTme();
        }
    }
}
