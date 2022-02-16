package views;


import models.Product;
import utils.Validator;
import java.util.Scanner;

// View
public class SalesView {

    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;
    Product model;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.

    public SalesView(Product model) {
        this.model = model;
    }
    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимости
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        name = Validator.validateName(scanner);
        model.setName(name);


        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимости
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        quantity = Validator.validateQuantityInput(scanner);
        model.setQuantity(quantity);
        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимости
        // ввода соответствующего значения, валидацию значения
        // через валидатор, установку валидного значения через модель.
        System.out.println(title);
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);
        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
