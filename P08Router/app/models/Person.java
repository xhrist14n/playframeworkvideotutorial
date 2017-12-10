package models;

import java.util.*;
import javax.persistence.*;
import javax.validation.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Person extends Model {

    @Id
    @Constraints.Min(12)
    public Long id;

    @Constraints.Required
    public String name;

    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date registerDate = new Date();

    public static final Finder<Long, Person> find = new Finder<>(Person.class);
}