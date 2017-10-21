package models;

import play.data.validation.Constraints;

public class WidgetItem {

    @Constraints.Required
    private String name = null;

    @Constraints.Required
    @Constraints.Min(0)
    private Integer price = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
