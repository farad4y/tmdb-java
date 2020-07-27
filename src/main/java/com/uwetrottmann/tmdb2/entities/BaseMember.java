package com.uwetrottmann.tmdb2.entities;

import java.io.Serializable;

public abstract class BaseMember implements Serializable {

    private static final long serialVersionUID = 1L;

    public Integer id;
    public String credit_id;
    public String name;
    public String profile_path;

}
