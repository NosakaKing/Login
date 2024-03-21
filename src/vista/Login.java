package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class Login extends JFrame {
    public Login() {
        init();
    }

    private void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(692, 415);
        setUndecorated(true);
        setLocationRelativeTo(null);
        JPanel contenPane = new JPanel();
        contenPane.setBackground(Color.WHITE);
        setContentPane(contenPane);
        contenPane.setLayout(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(252, 129, 129));
        panelPrincipal.setBounds(0, 0, 346, 415);
        contenPane.add(panelPrincipal);
        panelPrincipal.setLayout(null);

        JLabel lblTitulo = new JLabel("Bienvenido a Brii");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(0, 271, 346, 19);
        panelPrincipal.add(lblTitulo);

        JPanel panelImagen = new JPanel();
        panelImagen.setBounds(0, 0, 346, 244);
        panelImagen.setLayout(null);
        panelPrincipal.add(panelImagen);

        JLabel lblImagen = new JLabel("");
        lblImagen.setIcon(new ImageIcon(Objects.requireNonNull(Login.class.getResource("/imagen/loginFondo.png"))));
        lblImagen.setBounds(0, 0, 346, 244);
        panelImagen.add(lblImagen);

        JLabel lblEmpresa = new JLabel("Centro Estético");
        lblEmpresa.setForeground(Color.WHITE);
        lblEmpresa.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
        lblEmpresa.setBounds(0, 301, 346, 18);
        panelPrincipal.add(lblEmpresa);

        JPanel panelLogin = new JPanel();
        panelLogin.setBackground(Color.WHITE);
        panelLogin.setBounds(346, 0, 346, 415);
        panelLogin.setLayout(null);
        contenPane.add(panelLogin);

        JLabel lblLogin = new JLabel("INICIAR SESION");
        lblLogin.setForeground(Color.BLACK);
        lblLogin.setFont(new Font("SansSerif", Font.BOLD, 19));
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setBounds(0, 25, 346, 19);
        panelLogin.add(lblLogin);

        JLabel lblCerrar = new JLabel("X");
        lblCerrar.setForeground(Color.lightGray);
        lblCerrar.setFont(new Font("SansSerif", Font.BOLD, 19));
        lblCerrar.setBounds(320, 10, 15, 19);
        panelLogin.add(lblCerrar);
        lblCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        lblCerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        lblCerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lblCerrar.setForeground(Color.BLACK);
            }
        });

        lblCerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                lblCerrar.setForeground(Color.lightGray);
            }
        });

        JLabel lblUsuario = new JLabel("USUARIO");
        lblUsuario.setForeground(Color.BLACK);
        lblUsuario.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblUsuario.setBounds(25, 80, 200, 16);
        panelLogin.add(lblUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setFont(new Font("SansSerif", Font.PLAIN, 15));
        txtUsuario.setBounds(25, 115, 296, 30);
        panelLogin.add(txtUsuario);

        JLabel lblContrasenia = new JLabel("CONTRASEÑA");
        lblContrasenia.setForeground(Color.BLACK);
        lblContrasenia.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblContrasenia.setBounds(25, 180, 200, 16);
        panelLogin.add(lblContrasenia);

        JPasswordField txtContrasenia = new JPasswordField();
        txtContrasenia.setFont(new Font("SansSerif", Font.PLAIN, 15));
        txtContrasenia.setBounds(25, 215, 296, 30);
        panelLogin.add(txtContrasenia);

        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setForeground(Color.WHITE);
        btnIngresar.setBackground(new Color(252, 129, 129));
        btnIngresar.setFont(new Font("SansSerif", Font.BOLD, 15));
        btnIngresar.setFocusPainted(false);
        btnIngresar.setBorder(null);
        btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnIngresar.setBounds(25, 295, 296, 41);
        panelLogin.add(btnIngresar);

        btnIngresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnIngresar.setBackground(new Color(222, 129, 129));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnIngresar.setBackground(new Color(252, 129, 129));
            }
        });

        JLabel lblOlvide = new JLabel("¿Olvidaste tu contraseña?");
        lblOlvide.setForeground(Color.BLACK);
        lblOlvide.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lblOlvide.setHorizontalAlignment(SwingConstants.CENTER);
        lblOlvide.setBounds(25, 345, 296, 16);
        lblOlvide.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panelLogin.add(lblOlvide);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login().setVisible(true));
    }

}
