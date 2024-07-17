package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPrincipal extends JFrame {
    private JPanel pnlPrincipal;
    private JPanel pnlMenu;
    private JButton combosButton;
    private JButton listasButton;
    private JButton tabsButton;
    private JButton gridsButton;
    private JPanel pnlTitulo;
    private FrmPrincipal self;
    public FrmPrincipal(String titulo){
        super(titulo);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        this.setContentPane(pnlPrincipal);
        this.setSize(400, 400);
        //establece el comportamiento a la hora de cerrarse
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //que la pantalla inicie centrada
        this.setLocationRelativeTo(null);
        this.asociarEventos();
        this.self = this;


        gridsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmGridDemo frame = new FrmGridDemo(self);
                frame.setVisible(true);
            }
        });
    }
    private  void  asociarEventos(){
        listasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmListaDemo frame = new FrmListaDemo(self);
                frame.setVisible(true);
            }
        });
        tabsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmTabsDemo frame = new FrmTabsDemo(self,"Demo con TABS");
                frame.setVisible(true);
            }
        });
        combosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmDemoCombo frame = new FrmDemoCombo(self);
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        FrmPrincipal frame = new FrmPrincipal("Primer programa Swing");
        frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
