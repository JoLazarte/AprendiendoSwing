package vista;
import modelo.ColorItem;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FrmDemoCombo {
    private JPanel pnlPrincipal;
    private JComboBox comboBox1;
    private JComboBox cbColores;
    private JLabel lblItemIndex;
    private JLabel lblCodigoInterno;
    private JLabel lblSelectedValue;

    private List<ColorItem> colores = new ArrayList<ColorItem>();

    public FrmDemoCombo() {
        super("Demo de colores");
        colores.add(new ColorItem(10,"Verde"));
        colores.add(new ColorItem(20,"Rojo"));
        colores.add(new ColorItem(30,"Azul"));
        colores.add(new ColorItem(40,"Violeta"));
        colores.add(new ColorItem(50,"Amarillo"));



    }
}
