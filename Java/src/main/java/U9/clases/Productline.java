package U9.clases;

public class Productline {
    private final String productLine;
    private final String textDescription;
    private final String htmlDescription;
    private final String image;

    public Productline(
            String productLine, String textDescription, String htmlDescription, String image) {
        this.productLine = productLine;
        this.textDescription = textDescription;
        this.htmlDescription = htmlDescription;
        this.image = image;
    }

    public String getProductLine() {
        return productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public String getImage() {
        return image;
    }
}
