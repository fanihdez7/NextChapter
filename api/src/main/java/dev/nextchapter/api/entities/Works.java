package dev.nextchapter.api.entities;


import java.sql.Blob;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Works {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String key;
    private String type;
    private int revision;
    private Date last_modified;
    private Blob data;
}
     