package streams.template;

import streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class LightNovelsTemplate {

    public static List<LightNovel> getList(){

        return new ArrayList<>(List.of(
                LightNovel.builder()
                        .title("Tensei Shitara")
                        .price(8.99)
                        .build(),

                LightNovel.builder()
                        .title("Overlord")
                        .price(3.99)
                        .build(),

                LightNovel.builder()
                        .title("Violet Evergarden")
                        .price(5.99)
                        .build(),

                LightNovel.builder()
                        .title("No Game no life")
                        .price(2.99)
                        .build(),

                LightNovel.builder()
                        .title("Fullmetal Alchemist")
                        .price(5.99)
                        .build(),
                LightNovel.builder()
                        .title("Kumo desuga")
                        .price(1.99)
                        .build(),
                LightNovel.builder()
                        .title("Monogatari")
                        .price(4.00)
                        .build())
        );

    }
}
