package com.hami.springbootkafka.payload;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String firstName;
    private String lastName;

}
