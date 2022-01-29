package dominio;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LightNovel{

    private String title;
    private Double price;

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

}
