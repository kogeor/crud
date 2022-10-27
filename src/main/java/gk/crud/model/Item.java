package gk.crud.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Item {
    private int id;
    private String title;
    private int year;
    private String genre;
    private boolean watched;
}
