package cl.sustantiva.sakila.model;

import lombok.Getter;
import lombok.Setter;

public class Film {

    @Getter @Setter
    private int film_id;

    @Getter @Setter
    private String title;

    @Getter @Setter
    private String description;

    @Getter @Setter
    private int release_year;

    @Getter@Setter
    private String rating;

    public Film() {
        super();
    }

    public Film(int film_id, String title, String description, int release_year, String rating) {
        super();
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "film_id=" + film_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", release_year=" + release_year +
                ", rating='" + rating + '\'' +
                '}';
    }
}
