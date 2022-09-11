package models;


import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Income, Fiscal {
    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    // Налоговую ставку объявите в виде константы
    // здесь ...
    public final double TAX_RATE = 0.05;


    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTAX_RATE() {
        return TAX_RATE;
    }
    // Переопределите методы реализуемых интерфейсов.
    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...

    @Override
    public double profit(int quantity, double price) {
        return quantity * price;

    }
    // Расчёт суммы налога с продаж.
    // здесь ...

    @Override
    public double tax(double profit, double taxRate) {
        return profit * taxRate;
    }
    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...

    @Override
    public double profit(double profits, double tax) {
        return profits - tax;
    }
}
