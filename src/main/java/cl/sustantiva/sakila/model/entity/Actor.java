package cl.sustantiva.sakila.model.entity;

import lombok.Getter;
import lombok.Setter;

public class Actor {

    @Getter @Setter
    private int actor_id;
    @Getter @Setter
    private String first_name;
    @Getter @Setter
    private String last_name;

    public Actor() {
        super();
    }

    public Actor(int actor_id, String first_name, String last_name) {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
