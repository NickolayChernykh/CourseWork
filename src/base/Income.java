package base;
//- Income (содержит 2 перегруженных абстрактных метода
//необходимости расчета дохода и чистого дохода).
// 4) Доход = Количество товара х Цена.
//Товар - штучный, т.е. в штуках.
//6) Чистый доход = Доход - Налог.
public interface Income {
    default double profit(int quantity, double price) {
        return 0;
    }
    default double profit(double profits, double tax){

        return 0;
    }
}
