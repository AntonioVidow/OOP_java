package Movies_exe;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Movie {
    private String name;
    private int length;
    private FileInputStream trailer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) throws MovieException{
        if(length < 3600){
            throw new MovieException("Movie can't be less than 3600 seconds!");
        }else{
            this.length = length;
        }
    }

    public FileInputStream getTrailer() {
        return trailer;
    }

    public void setTrailer(FileInputStream trailer) {
        this.trailer = trailer;
    }

    public Movie(String name, int length, FileInputStream trailer) throws MovieException{
        this.name = name;
        setLength(length);
        this.trailer = trailer;
    }

    public static boolean equalTrailers(FileInputStream movie1, FileInputStream movie2) throws IOException {
        try(BufferedInputStream m1 = new BufferedInputStream(movie1);
            BufferedInputStream m2 = new BufferedInputStream(movie2)){
            int byte1, byte2;

            while((byte1 = m1.read()) != -1 && (byte2 = m2.read()) != -1){
                if(byte1 != byte2){
                    return false;
                }
            }
            return m1.read() == -1 && m2.read() == -1;
        }catch (IOException e){
            return false;
        }
    }

    public static int compareMovieLengths(Movie m1, Movie m2){
        if(m1.length > m2.length){
            return -1;
        }else if(m1.length == m2.length){
            return 0;
        }else{
            return 1;
        }
    }

    public int compareWith(Movie m) throws IOException {
        try {
            if(name.equals(m.getName()) &&
            equalTrailers(trailer, m.getTrailer()) &&
             length == m.getLength()){
                return 1;
            }else{
                return 0;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", trailer=" + trailer +
                '}';
    }
}
