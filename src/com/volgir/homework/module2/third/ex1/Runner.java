package com.volgir.homework.module2.third.ex1;

import java.util.*;

/**
 * Задание №1: сортировка отзывов.
 * Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
 * дата + время отзыва (LocalDateTime)
 * Создать коллекцию, которая хранит отсортированные отзывы по лайкам и дата + время отзыва,
 * Уникальность определяется на основе сортировки.
 * Создать comparator через лямбда выражение, для сортировки отзывов:
 * сначала у кого больше лайков, если лайки совпадают, то сначала идут более новые отзывы

 * Пример - отсортированный:
 * (id, текст, кол-во лайков, дата+время)
 * отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
 * отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
 * отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
 */
public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Comparator<Review> reviewComparator = (review1, review2) -> {
            int likesComparison = Integer.compare(review2.getLikesQty(), review1.getLikesQty());
            if (likesComparison != 0) {
                return likesComparison;
            }

            int dateTimeComparison = review1.getLocalDateTime().compareTo(review2.getLocalDateTime());
            if (dateTimeComparison != 0) {
                return dateTimeComparison;
            }

            return Integer.compare(review1.getId(), review2.getId());
        };

        Set<Review> reviewSet = new TreeSet<>(reviewComparator);
        reviewSet.add(new Review(1, "Все отлично", 200));
        reviewSet.add(new Review(2, "Все так себе", 100));
        reviewSet.add(new Review(3, "Все плохо", 200));
        reviewSet.add(new Review(4, "Все плохо", 200));
        reviewSet.add(new Review(5, "Все так себе", 201));

        System.out.println(reviewSet);
    }
}
