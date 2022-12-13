package GUI;
import operaciones.Procesos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaOperaciones extends JFrame implements ActionListener {
	Procesos misProcesos = new Procesos();
	private JPanel contentPane;
	private JTextField lblN1;
	private JTextField lblN2;
	private JTextField lblN3;
	private JLabel txtN1;
	private JTextField lblNombre;
	private JLabel title;
	private JLabel txtN2;
	private JLabel txtN3;

	private JLabel titleName;
	private JButton btnCalcular;
	private JLabel lblCantGanan;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private static JLabel textMensaje;
	private static JLabel cantValidados;
	private static JLabel cantGanaron;
	private static JLabel cantPierden;
	private static JLabel cantpierdenSInRecu;
	private static JLabel cantRecu;
	private JButton btnImprimir;
	private JLabel lblPromedioTotal;
	private static JLabel lblPromedioTotalRes;
	private JButton btnImprimirEstudiante;

	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		title = new JLabel("Calculador Promedio Estudiantes");
		title.setBounds(248, 11, 361, 44);
		title.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(title);

		txtN1 = new JLabel("Nota 1:");
		txtN1.setBounds(40, 116, 68, 27);
		txtN1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		contentPane.add(txtN1);

		lblN1 = new JTextField();
		lblN1.setBounds(98, 120, 86, 22);
		contentPane.add(lblN1);
		lblN1.setColumns(10);

		txtN2 = new JLabel("Nota 2:");
		txtN2.setBounds(203, 116, 68, 27);
		txtN2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		contentPane.add(txtN2);

		lblN2 = new JTextField();
		lblN2.setBounds(261, 120, 86, 22);
		lblN2.setColumns(10);
		contentPane.add(lblN2);

		txtN3 = new JLabel("Nota 3:");
		txtN3.setBounds(379, 120, 68, 27);
		txtN3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		contentPane.add(txtN3);

		lblN3 = new JTextField();
		lblN3.setBounds(437, 124, 86, 22);
		lblN3.setColumns(10);
		contentPane.add(lblN3);

		titleName = new JLabel("Nombre");
		titleName.setBounds(40, 66, 86, 27);
		titleName.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(titleName);

		lblNombre = new JTextField();
		lblNombre.setBounds(102, 66, 343, 34);
		contentPane.add(lblNombre);
		lblNombre.setColumns(10);

		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(539, 114, 134, 34);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);

		JLabel lblNewLabel = new JLabel("Estudiantes Validados");
		lblNewLabel.setBounds(40, 163, 146, 27);
		contentPane.add(lblNewLabel);

		lblCantGanan = new JLabel("Cantidad Ganan");
		lblCantGanan.setBounds(40, 201, 115, 27);
		contentPane.add(lblCantGanan);

		lblNewLabel_2 = new JLabel("cantidad Pierden");
		lblNewLabel_2.setBounds(40, 243, 156, 27);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("cantidad pierden sin recuperar");
		lblNewLabel_3.setBounds(40, 281, 174, 27);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Estudiantes que Recuperan:");
		lblNewLabel_4.setBounds(40, 319, 151, 27);
		contentPane.add(lblNewLabel_4);

		textMensaje = new JLabel();
		textMensaje.setBounds(294, 160, 379, 30);
		contentPane.add(textMensaje);

		cantValidados = new JLabel();
		cantValidados.setBounds(203, 163, 68, 27);
		contentPane.add(cantValidados);

		cantGanaron = new JLabel();
		cantGanaron.setBounds(203, 201, 68, 27);
		contentPane.add(cantGanaron);

		cantPierden = new JLabel();
		cantPierden.setBounds(192, 238, 68, 27);
		contentPane.add(cantPierden);

		cantpierdenSInRecu = new JLabel();
		cantpierdenSInRecu.setBounds(257, 281, 68, 27);
		contentPane.add(cantpierdenSInRecu);

		cantRecu = new JLabel();
		cantRecu.setBounds(229, 319, 68, 27);
		contentPane.add(cantRecu);

		btnImprimir = new JButton("Imprimir Listas");
		btnImprimir.setBounds(539, 277, 134, 34);
		btnImprimir.addActionListener(this);
		contentPane.add(btnImprimir);

		lblPromedioTotal = new JLabel("Promedio Total: ");
		lblPromedioTotal.setBounds(40, 367, 151, 27);
		contentPane.add(lblPromedioTotal);

		lblPromedioTotalRes = new JLabel();
		lblPromedioTotalRes.setBounds(229, 373, 194, 27);
		contentPane.add(lblPromedioTotalRes);

		btnImprimirEstudiante = new JButton("Imprimir Datos");
		btnImprimirEstudiante.setBounds(539, 321, 134, 34);
		btnImprimirEstudiante.addActionListener(this);
		contentPane.add(btnImprimirEstudiante);
	}

	public static void mensaje(String mensaje) {
		textMensaje.setText(mensaje);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCalcular) {
			double nota1 = Double.parseDouble(lblN1.getText());
			double nota2 = Double.parseDouble(lblN2.getText());
			double nota3 = Double.parseDouble(lblN3.getText());
			String nombre = lblNombre.getText();
			misProcesos.ingresarDatos(nota1, nota2, nota3, nombre);
			;

		} else if (e.getSource() == btnImprimir) {
			misProcesos.imprimirListas();
		} else if (e.getSource() == btnImprimirEstudiante) {
			misProcesos.calcularDatos();
		}

	}



	public static void Datos(double promedioTotal,int cantEstudiantesValidados, int cantGanan, int cantpierden, int cantPierden2,
							 int cantRecupera) {
		cantValidados.setText(String.valueOf(cantEstudiantesValidados));
		cantGanaron.setText(String.valueOf(cantGanan));
		cantPierden.setText(String.valueOf(cantpierden));
		cantpierdenSInRecu.setText(String.valueOf(cantPierden2));
		cantRecu.setText(String.valueOf(cantRecupera));
		lblPromedioTotalRes.setText(String.valueOf(promedioTotal));

	}



	public static void Nota(String nota) {
		// TODO Auto-generated method stub
		textMensaje.setText(nota);

	}


}