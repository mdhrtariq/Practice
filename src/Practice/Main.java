package Practice;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task= new TimerTask() {

             int counter = 10;
            public void run() {
                if(counter>0){
                    System.out.println(counter+" seconds ");
                    counter--;
                }
                else {
                    System.out.println("Happy New Year 2022");
                    timer.cancel();
                }
            }
        };
        Calendar date=Calendar.getInstance();
        date.set(Calendar.YEAR,2022);
        date.set(Calendar.MONTH,Calendar.SEPTEMBER);
        date.set(Calendar.DAY_OF_MONTH ,1);
        date.set(Calendar.HOUR_OF_DAY,18);
        date.set(Calendar.MINUTE,48);
        date.set(Calendar.SECOND,20);
        date.set(Calendar.MILLISECOND,0);
//        timer.schedule(task,5000);
//        timer.schedule(task,date.getTime());
//        timer.scheduleAtFixedRate(task,date.getTime(),1000);//with timedelay set
        timer.scheduleAtFixedRate(task,0,1000);//without timedelay set

//    public static void main(String[] args) {
//        for (int i = 1; i <= 12; i++) {
//            for (int j = 1; j <= 60; j++) {
//                System.out.print(i+"  ");
//                 {
//                    System.out.print(j + "  ");
//                }
//                System.out.println();
//            }
    }
}

//        int i =5;
//        int j = 10;
//        int k =14;
//        j=j+i;
//        k-=i;
//        i+=5;
//        i++;
//        System.out.println(i);
//    }
//}
