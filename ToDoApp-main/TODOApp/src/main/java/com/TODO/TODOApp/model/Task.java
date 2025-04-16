package com.TODO.TODOApp.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private boolean completed;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
