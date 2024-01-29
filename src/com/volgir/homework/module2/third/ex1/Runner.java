package com.volgir.homework.module2.third.ex1;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Задание №1: сортировка отзывов.
 * Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
 * дата + время отзыва (LocalDateTime)
 * Создать коллекцию, которая хранит уникальные отзывы (уникальность по id),
 * В данной коллекции отзывы должны быть отсортированы.
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
        // Thread.sleep() - для проверки.
        // Без Thread.sleep() - LocalDateTime у всех добавляемых объектов одинаковое (на моем ПК),
        // и второе условие сортировки всегда возвращает равенство, т.е. 0.
        Set<Review> reviews = new HashSet<>();
        reviews.add(new Review(1, "Все отлично", 200, LocalDateTime.now()));
        Thread.sleep(10);
        reviews.add(new Review(2, "Все все так себе", 100, LocalDateTime.now()));
        Thread.sleep(10);
        reviews.add(new Review(3, "Все плохо", 200, LocalDateTime.now()));

        List<Review> sortedReviews = new ArrayList<>(reviews);
        Comparator<Review> reviewComparator = (review1, review2) -> {
            int id = review2.getLikesQty() - review1.getLikesQty();
            if (id == 0) {
                return review1.getLocalDateTime().compareTo(review2.getLocalDateTime());
            }
            return id;
        };

        sortedReviews.sort(reviewComparator);
        System.out.println(sortedReviews);
    }
}
