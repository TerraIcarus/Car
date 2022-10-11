
public class Car extends Thread
{
    public Car(String path)
    {
        int v;
        int t= 0;
        int pathT=0;
        int averageV;
        int left;

        for (int i = Integer.parseInt(path); i>0; i=i-v) {
            v=(int) (Math.random() * 81);
            pathT=pathT+v;
            t=t+1;
            averageV=pathT/t;
            left=i/averageV;

            System.out.println("Текущая скорость " + v +" км/ч");
            System.out.println("Средняя скорость "+averageV +" км/ч");
            System.out.println("Осталось до цели " +i+" ед");
            System.out.println("Времени до прибытия " + left + " ед");
            System.out.println();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
