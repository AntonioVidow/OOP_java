package Movies_exe;

import java.io.FileInputStream;

public class LongMovie extends Movie{
    private int len;
    public LongMovie(String name, int length, FileInputStream trailer, int len) throws MovieException {
        super(name, length, trailer);
        if(len < 10800){
            throw new MovieException("Long movie can't be less than 10800 seconds!");
        } else{
            this.len = len;
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + getName() + '\'' +
                ", length=" + len +
                ", trailer=" + getTrailer() +
                '}';
    }
}
