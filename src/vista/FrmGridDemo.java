package vista;
import modelo.UsuarioDAO;
import utils.MiTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmGridDemo extends JDialog{
    private JPanel pnlPrincipal;
    private JButton guardarButton;
    private JScrollBar scrollBar1;
    private JTable tableUsuario;
    private MiTableModel miModelo = new MiTableModel();
    public FrmGridDemo( Window owner) {
        super(owner, "Demo de Grid");

        this.setContentPane(pnlPrincipal);
        this.setSize(300, 300);
        //No permite volver a la pantalla anterior HASTA cerrar esta
        this.setModal(true);
        //establece el comportamiento a la hora de cerrarse
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //que la pantalla inicie centrada
        this.setLocationRelativeTo(null);

        tableUsuario.setModel(miModelo);

        miModelo.add("12600555", "Maka", "administrador");
        miModelo.add("12600553", "Mika", "moderador");
        miModelo.add("12600545", "Mandy", "moderador");
        miModelo.add("12600355", "Mocha", "administrador");
        miModelo.add("13600255", "Dodo", "moderador");
        miModelo.add("12400225", "Bella", "administrador");

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UsuarioDAO dao = new UsuarioDAO();
                    dao.saveAll(miModelo.getLista());
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

}
