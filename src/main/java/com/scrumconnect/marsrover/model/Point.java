package com.scrumconnect.marsrover.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Point {
    private Integer x;
    private Integer y;

    @Override
    public String toString() {
        return x  + " " + y;
    }
}
