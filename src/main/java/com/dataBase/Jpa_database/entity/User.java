package com.dataBase.Jpa_database.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private @NonNull String name;
    private @NonNull String lastName;
    private @NonNull String city;
    private @NonNull String address;

}
