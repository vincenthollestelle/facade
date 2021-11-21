package app;

public class Main {

    public static void main(String[] args) {
        WatchMovieFacade movie = new WatchMovieFacade();
        ListenMusicFacade music = new ListenMusicFacade();

        movie.StartMovie();
        movie.StopMovie();
        music.StartMusic();
        music.StopMusic();
        music.StartRadio();
        music.StopRadio();
    }
}