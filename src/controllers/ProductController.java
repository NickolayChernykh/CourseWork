package controllers;

import models.Product;

import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();


        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        String productName = model.getName();

        // 2) вызов методов расчетов доходов и налога;
        double profitBrut = model.profit(model.getQuantity(), model.getPrice()); //до уплаты налога.
        double tax = model.tax(profitBrut, model.TAX_RATE); // налог
        double profitNett = model.profit(profitBrut, tax); // после налога

        // 3) округление расчетных значений;
        String sProfBrt = Rounder.round(profitBrut);
        String sProfNtt = Rounder.round(profitNett);
        String sTax = Rounder.round(tax);

        // 4) вывод расчетов по заданному формату. String output = "[здесь должен быть вывод по формату]";

        String output = "Наименование товара: " + productName +"\n"+
                "Общий доход (грн.): "+ sProfBrt + "\n"+
                "Сумма налога (грн.): " + sTax + "\n"+
                "Чистый доход (грн.): " + sProfNtt;

        view.getOutput(output);
    }
}
