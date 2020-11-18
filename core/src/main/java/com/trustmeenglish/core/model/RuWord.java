package com.trustmeenglish.core.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ru_words")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"meaning"})

public class RuWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String meaning;
    @OneToMany(mappedBy = "ruWord", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Card> cards;
}
