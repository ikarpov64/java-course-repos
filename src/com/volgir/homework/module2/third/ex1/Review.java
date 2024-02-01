package com.volgir.homework.module2.third.ex1;


import java.time.LocalDateTime;
import java.util.Objects;

public class Review {
    private final int id;
    private LocalDateTime localDateTime = LocalDateTime.now();
    private String text;
    private int likesQty;

    public Review(int id, String text, int likesQty) {
        this.id = id;
        this.text = text;
        this.likesQty = likesQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return id == review.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", text='" + text + '\'' +
                ", likesCount=" + likesQty +
                ", localDateTime=" + localDateTime +
                "}\n";
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public int getLikesQty() {
        return likesQty;
    }

    public int getId() {
        return id;
    }
}
