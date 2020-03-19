package com.pojoapi.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Data
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    private Integer id;
    private String username;
    private String db_source;

    public User(Integer id, String username, String db_source) {
        this.id = id;
        this.username = username;
        this.db_source = db_source;
    }
}
