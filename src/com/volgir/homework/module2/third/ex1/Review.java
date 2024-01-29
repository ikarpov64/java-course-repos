package com.volgir.homework.module2.third.ex1;


import java.time.LocalDateTime;
import java.util.Objects;

public class Review {
    int id;
    private String text;
    private int likesQty;
    private LocalDateTime localDateTime;

    public Review(int id, String text, int likesQty, LocalDateTime localDateTime) {
        this.id = id;
        this.text = text;
        this.likesQty = likesQty;
        this.localDateTime = localDateTime;
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
}
