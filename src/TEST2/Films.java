package TEST2;

public class Films {
    Film[] films;

    public Film[] getFilms() {
        return films;
    }

    public void setFilms(Film[] films) {
        this.films = films;
    }

    public Films(Film[] films) {
        this.films = films;
    }

    public int checkHowMuchElement(){
        int index = 4;

        for (int i = 0; i < films.length; i++) {
            if(films[i] == null){
                index = i;
            }
        }
        return index -1;
    }

    public void addFilm(Film film){
        boolean check = true;
        int elements = checkHowMuchElement();
        for (int i = 0; i < elements ; i++) {
            if(film.toString().equals(films[i].toString())){
                check = false;
            }
        }

        if(!check){
            System.out.println("This film is already in the array.");
        }else{
            films[elements] = film;
        }
    }

    public void print(){
        for(Film film : films){
            System.out.println(film);
        }
    }

    public void filterByProducer(String producer){
        if(producer.isEmpty()){
            print();
        }else{
            int elements = checkHowMuchElement();
            for (int i = 0; i < elements; i++) {
                if(films[i].getProducent().equals(producer)){
                    System.out.println(films[i]);
                }
            }
        }
    }

    public void biggestBudget(){
        double biggest = films[0].getBudget();
        int newBiggest = 0;
        int elements = checkHowMuchElement();
        for (int i = 1; i < elements; i++) {
            if(films[i].getBudget() > biggest){
                newBiggest = i;
            }
        }
        System.out.println(films[newBiggest]);
    }

    public double avgBudget(String producer){
        double sum = 0;
        int count = 0;
        int elements = checkHowMuchElement();
        if(producer.isEmpty()){
            for (int i = 0; i < elements; i++) {
                sum += films[i].getBudget();
                count ++ ;
            }
        }else{
            for (int i = 0; i < elements; i++) {
                if(films[i].getProducent().equals(producer)){
                    sum += films[i].getBudget();
                    count++;
                }
            }
        }

        return Math.round(sum / count);
    }
}
