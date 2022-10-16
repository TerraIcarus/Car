
public class Car implements Runnable
{
    public int path;
    int v;
    int t;
    int averageV;
    int pathT;
    int leftPath;

    @Override
    public void run() {
        while (path>0)
        {
            v=(int) (Math.random() * 81);
            pathT=pathT+v;
            t=path/v;
            averageV=path/t;
            leftPath=path/averageV;
            path=path-leftPath;

            System.out.println("Текущая скорость " + v +" км/ч");
            System.out.println("Средняя скорость "+averageV +" км/ч");
            System.out.println("Осталось до цели " +path+" ед");
            System.out.println("Времени до прибытия " + leftPath + " ед");
            System.out.println();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
