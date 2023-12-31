package lk.ijse.dep11.misc.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerTO implements Serializable {
    private Integer id;
    private String name;
    private String address;
}
