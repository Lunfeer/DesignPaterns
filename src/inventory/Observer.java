package inventory;

import java.util.ArrayList;
import java.util.List;

public interface Observer {
    void update(String productName, int quantity);
}
