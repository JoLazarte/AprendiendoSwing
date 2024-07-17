package utils;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MiListaModel extends AbstractListModel {
    private List<String> items = new ArrayList<String>();
    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public Object getElementAt(int index) {
        return items.get(index);
    }

    //retorna el index donde se encuentra el valor insertado:
    public int add(String valor){
        items.add(valor);
        //para refrescar la lista:
        fireContentsChanged(this, 0, items.size());
        return items.size()-1;
    }
}
