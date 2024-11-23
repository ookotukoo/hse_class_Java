/*Задача 5 (вариант 5).
Создать программу на языке Java для определения класса в некоторой предметной области.
Описать свойства, конструктор, методы геттеры/сеттеры,
перекрыть метод toString() для вывода полной информации об объекте в отформатированном виде:
5). Реализация готовой продукции
Commodity – Товар:
Свойства:
id – идентификатор; к
productCode – Код товара; к
name – Наименование; к
wholesalePrice – Оптовая цена; к
retailPrice – Розничная цена; к
description – Описание;*/


public class Commodity {
    private int id;
    private int productCode;
    private String name;
    private int wholesalePrice;
    private int retailPrice;
    private String description;

    public Commodity (int id, int productCode, String name, int wholesalePrice, int retailPrice, String description){
        setId(id);
        setProductCode(productCode);
        setName(name);
        setWholesalePrice(wholesalePrice);
        setRetailPrice(retailPrice);
        setDescription(description);
    }

    public String toString () {
        return "Id: '" + this.id + "', " + "ProductCode: '" + this.productCode + "', " + "Name: '" + this.name + "', "
                + "WholesalePrice: '" + this.wholesalePrice + "', " + "RetailPrice: '" + this.retailPrice + "', " +
                "Description: '" + this.description + "'";
    }

    // Все сеттеры
    public void setId (int id) {
        this.id = id;
    }

    public void setProductCode (int productCode) {
        this.productCode = productCode;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setWholesalePrice (int wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public void setRetailPrice (int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    // Все геттеры
    public int getId () {
        return this.id;
    }

    public int getProductCode () {
        return this.productCode;
    }

    public String getName () {
        return this.name;
    }

    public int getWholesalePrice () {
        return this.wholesalePrice;
    }

    public int getRetailPrice () {
        return this.retailPrice;
    }

    public String getDescription () {
        return this.description;
    }
}
