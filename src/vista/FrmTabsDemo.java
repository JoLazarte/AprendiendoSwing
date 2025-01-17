package vista;

import javax.swing.*;
import java.awt.*;

public class FrmTabsDemo extends JDialog {
    private JPanel pnlPrincipal;
    private JTabbedPane tabbedPane1;
    private JDesktopPane desktopPaneSolapaUno;
    private JDesktopPane desktopPaneSolapaDos;

    public  FrmTabsDemo(Window owner, String titulo){
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(300,300);
        //No permite volver a la pantalla anterior HASTA cerrar esta
        this.setModal(true);
        //establece el comportamiento a la hora de cerrarse
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //que la pantalla inicie centrada
        this.setLocationRelativeTo(null);

        FrmInternalSolapaUno frameSolapa1 = new FrmInternalSolapaUno("Solapa embebida");
        frameSolapa1.setVisible(true);
        desktopPaneSolapaUno.add(frameSolapa1);

        FrmInternalSolapaDos frameSolapa2 = new FrmInternalSolapaDos("Segunda solapa embebida");
        frameSolapa2.setVisible(true);
        desktopPaneSolapaDos.add(frameSolapa2);
    }
}
