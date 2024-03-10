package CRUD;

public class dvd_film {
    String dvdName;
    String genre;
    int releaseYear;
    String director;
    int price;

    public dvd_film(String dvdName, String genre, int releaseYear, String director, int price){
        this.dvdName = dvdName;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.director = director;
        this.price = price;
    }
}