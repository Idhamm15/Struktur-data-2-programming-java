package Model;

import java.util.ArrayList;
import java.util.List;

public class keranjang {
    List<Tokopedia> keranjang;

    public keranjang() { this.keranjang = new ArrayList<>();
    }

    public void addItem(Tokopedia pedia) {this.keranjang.add(pedia); }

    public void removeItem(Tokopedia pedia) { this.keranjang.remove(pedia);}

}
