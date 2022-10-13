package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Alumnos {

private JFrame frmAlumnos;
private JTable lblregristro;
private JTextField txtnombre;
private JComboBox cbocarrera;
private JComboBox cbogrupo;
private JComboBox cbosemestre;
private JSpinner spnpromerio;
private JButton btnagregar;
private JButton btnborrar;
DefaultTableModel model=new DefaultTableModel();
ArrayList<sii>listaAlumnos=new ArrayList<sii>();

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Alumnos window = new Alumnos();
window.frmAlumnos.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}


public Alumnos() {
initialize();
model.addColumn("nombre");
model.addColumn("carrera");
model.addColumn("grupo");
model.addColumn("semestre");
model.addColumn("promedio");
refrescarTabla();

}
public void refrescarTabla() {
while(model.getRowCount()>0) {
model.removeRow(0);
}
for(sii alumno: listaAlumnos) {
Object a []= new Object[5];
a[0]=alumno.getNombre();
a[1]=alumno.getCarrera();
a[2]=alumno.getGrupo();
a[3]=alumno.getSemetres();
a[4]=alumno.getPromerio();
model.addRow(a);
}
lblregristro.setModel(model);


}

private void initialize() {
frmAlumnos = new JFrame();
frmAlumnos.setTitle("Alumnos");

frmAlumnos.setBounds(100, 100, 612, 452);
frmAlumnos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmAlumnos.getContentPane().setLayout(null);




lblregristro = new JTable();
lblregristro.setBounds(27, 255, 521, 123);
frmAlumnos.getContentPane().add(lblregristro);

JLabel lblNewLabel = new JLabel("nombre");
lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
lblNewLabel.setBounds(27, 36, 67, 40);
frmAlumnos.getContentPane().add(lblNewLabel);

JLabel lblCarrera = new JLabel("carrera");
lblCarrera.setFont(new Font("Tahoma", Font.BOLD, 11));
lblCarrera.setBounds(27, 74, 67, 40);
frmAlumnos.getContentPane().add(lblCarrera);

JLabel lblGrupo = new JLabel("grupo");
lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 11));
lblGrupo.setBounds(27, 113, 67, 40);
frmAlumnos.getContentPane().add(lblGrupo);

JLabel lblSemestre = new JLabel("semestre");
lblSemestre.setFont(new Font("Tahoma", Font.BOLD, 11));
lblSemestre.setBounds(27, 153, 67, 40);
frmAlumnos.getContentPane().add(lblSemestre);

JLabel lblNewLabel_4 = new JLabel("promedio");
lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
lblNewLabel_4.setBounds(27, 193, 67, 40);
frmAlumnos.getContentPane().add(lblNewLabel_4);

txtnombre = new JTextField();
txtnombre.setBounds(112, 46, 86, 20);
frmAlumnos.getContentPane().add(txtnombre);
txtnombre.setColumns(10);

cbocarrera = new JComboBox();
cbocarrera.setModel(new DefaultComboBoxModel(new String[] {"programacion", "ventas", "maquinas"}));
cbocarrera.setBounds(111, 84, 130, 20);
frmAlumnos.getContentPane().add(cbocarrera);

cbogrupo = new JComboBox();
cbogrupo.setModel(new DefaultComboBoxModel(new String[] {"101", "102", "103", "104", "105", "106", "301", "302", "303", "304", "305", "306", "501", "502", "503", "504", "505", "506"}));
cbogrupo.setBounds(112, 122, 79, 22);
frmAlumnos.getContentPane().add(cbogrupo);

cbosemestre = new JComboBox();
cbosemestre.setModel(new DefaultComboBoxModel(new String[] {"primero", "tercero", "quinto"}));
cbosemestre.setBounds(112, 163, 101, 20);
frmAlumnos.getContentPane().add(cbosemestre);

spnpromerio = new JSpinner();
spnpromerio.setModel(new SpinnerNumberModel(10.0, 5.0, 10.0, 0.1));
spnpromerio.setBounds(112, 203, 95, 20);
frmAlumnos.getContentPane().add(spnpromerio);

btnagregar = new JButton("Agregar");
btnagregar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
sii x=new sii();
x.setNombre(txtnombre.getText());
x.setCarrera(cbocarrera.getSelectedItem().toString());
x.setGrupo(Integer.parseInt(cbogrupo.getSelectedItem().toString()));
x.setSemetres(cbosemestre.getSelectedItem().toString());
x.setPromerio(Double.parseDouble(spnpromerio.getValue().toString()));
listaAlumnos.add(x);
refrescarTabla();
}catch (Exception E) {
JOptionPane.showMessageDialog(lblNewLabel_4, this, "NEL ", 0);
}
}
});
btnagregar.setBounds(272, 96, 130, 107);
frmAlumnos.getContentPane().add(btnagregar);

btnborrar = new JButton("Borrar");
btnborrar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	txtnombre.setText("");
	cbocarrera.setSelectedIndex(0);
	cbogrupo.setSelectedIndex(0);
	cbosemestre.setSelectedIndex(0);
	spnpromerio.setValue(10);
}
});
btnborrar.setBounds(418, 96, 130, 107);
frmAlumnos.getContentPane().add(btnborrar);
}
private static class __Tmp {
private static void __tmp() {
 javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
}

}
}
