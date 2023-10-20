package oops.abstraction.interfaceDemo;

@FunctionalInterface
public interface MusicService {
    //Single abstract method
    void play();
    //void play2();
    public static void main(String[] args) {
        //Traditional way 1
        class MusicServiceImpl implements MusicService{
            @Override
            public void play() {
                System.out.println("playing");
            }
        }
        MusicService musicService = new MusicServiceImpl();
        musicService.play();


        //2 : anonymous class
        MusicService musicService1 = new MusicService(){
            @Override
            public void play() {
                System.out.println("playing");
            }
        };
        musicService1.play();

        //3. Lambda expression
        MusicService musicService2 = ()-> System.out.println("playing");
        musicService2.play();
    }
}
