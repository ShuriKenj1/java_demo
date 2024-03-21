package Lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroupDemo {
    public static void main(String[] args) {
        String input = "Номер заказа: 123456, Статус: обработан, Дата: 2024-03-14";

        String regex = "Номер заказа: (\\d+), Статус: ([а-я]*), Дата: (\\d{4}-\\d{2}-\\d{2})";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String wholeMatch = matcher.group(0);
            System.out.println("Entire substring: " + wholeMatch);
            String orderNumber = matcher.group(1);
            String status = matcher.group(2);
            String date = matcher.group(3);

            System.out.println("Order number: " + orderNumber);
            System.out.println("Order status: " + status);
            System.out.println("Order date: " + date);
        } else System.out.println("Order data not found");
    }
}
