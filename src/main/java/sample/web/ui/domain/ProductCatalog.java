package sample.web.ui.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProductCatalog {
    @OneToMany
    private ArrayList<Product> products;
}
