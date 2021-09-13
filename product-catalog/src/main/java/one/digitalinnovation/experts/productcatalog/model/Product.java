package one.digitalinnovation.experts.productcatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product",type = "catalog")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private Long id;
    private String name;
    private Integer amount;
}
