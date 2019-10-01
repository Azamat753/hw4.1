public class Runner extends Thread {

    public Runner(String name) {
        this.setName(name);

    }
    public void start(){
        System.out.println(this.getName()+" Берёт палочку  ");
        try {
            {
                System.out.println(this.getName()+" Бежит к ");
            }
            sleep(5000);
        }catch (InterruptedException ie){

        }

    }
}
