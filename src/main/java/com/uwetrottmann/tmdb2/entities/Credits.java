package com.uwetrottmann.tmdb2.entities;

import java.io.Serializable;
import java.util.List;

public class Credits implements Serializable {

    private static final long serialVersionUID = 1L;

    public Integer id;

    public List<CastMember> cast;
    public List<CrewMember> crew;
    public List<CastMember> guest_stars;

}
