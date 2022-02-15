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
        double profitBrutto = model.profit(model.getQuantity(), model.getPrice()); //до уплаты налога.
        double tax = model.tax(profitBrutto, model.TAX_RATE); // налог
        double profitNetto = model.profit(profitBrutto, tax); // после налога

        // 3) округление расчетных значений;
        String sprofBrutto = Rounder.round(profitBrutto);
        String sprofNetto = Rounder.round(profitNetto);
        String sTax = Rounder.round(tax);

        // 4) вывод расчетов по заданному формату. String output = "[здесь должен быть вывод по формату]";

        String output = "Наименование товара: " + productName +"\n"+
                "Общий доход (грн.): "+ sprofBrutto + "\n"+
                "Сумма налога (грн.): " + sTax + "\n"+
                "Чистый доход (грн.): " + sprofNetto;

        view.getOutput(output);
    }
}
