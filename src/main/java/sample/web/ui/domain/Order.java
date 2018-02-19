package sample.web.ui.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="Orders")
public class Order {

    @OneToMany
    private ArrayList<Product> products;
}
