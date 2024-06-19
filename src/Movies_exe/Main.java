package Movies_exe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static Movies_exe.Movie.equalTrailers;

public class Main {
    public static void main(String[] args) throws IOException, MovieException {
        Movie[] movies = new Movie[3];
        try{
            movies[0] = new Movie("Ivan", 3600, new FileInputStream("D:\\OOP_java\\src\\Movies_exe\\m1"));
            movies[1] = new Movie("Avatar", 3600, new FileInputStream("D:\\OOP_java\\src\\Movies_exe\\m2"));
            movies[2] = new LongMovie("Limo", 10800, new FileInputStream("D:\\OOP_java\\src\\Movies_exe\\lm3"), 10800);
        }catch (MovieException e){
            System.out.println(e.getMessage());
        }


        for (int i = 1; i < movies.length; i++) {
            for (int j = i +1; j < movies.length; j++) {
                if(equalTrailers(movies[i].getTrailer(), movies[j].getTrailer())){
                    System.out.println(movies[i].getName() + " and "+ movies[j].getName() + " have the same trailer");
                }
            }
        }

        Arrays.sort(movies, (m1, m2) -> {
            int lenghtComparison = Integer.compare(m2.getLength(), m1.getLength());
            if(lenghtComparison != 0){
                return lenghtComparison;
            }
            return m1.getName().compareTo(m2.getName());
        });

        for (Movie movie : movies) {
            System.out.println(movie.getName());
        }
    }
}
