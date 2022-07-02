package br.senac.application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import br.senac.model.Pessoa;
import br.senac.dao.PessoaDao;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class PessoaConsulta {

	private JFrame frame;
	private JTable tblPessoa;
	private JTextField txtNome;
	private JButton btnConsulta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PessoaConsulta window = new PessoaConsulta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PessoaConsulta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(22, 21, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tblPessoa = new JTable();
		tblPessoa.setBounds(20, 51, 393, 193);
		frame.getContentPane().add(tblPessoa);
		
		txtNome = new JTextField();
		txtNome.setBounds(61, 18, 253, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PessoaDao pessoaDao = new PessoaDao();
				List<Pessoa> pessoas = new ArrayList();
				String nome = txtNome.getText();
				
				try {
					pessoas = pessoaDao.getPessoaByName(nome);
					DefaultTableModel modelo = (DefaultTableModel) tblPessoa.getModel();
					modelo.setRowCount(0);
					modelo.addColumn("Código de Identificação:");
					modelo.addColumn("Nome");
					modelo.addColumn("Ano de Nascimento");
					
					for (Pessoa p : pessoas) {
						modelo.addRow(new Object[] {
								p.getId(),
								p.getNome(),
								p.getAnoNascimento()
						});
					}
				}
				
				catch(SQLException ex) {
					JOptionPane.showMessageDialog(null, "Erro!"+ ex.getMessage());
				}
							
				}
		});
		btnConsulta.setBounds(324, 17, 89, 23);
		frame.getContentPane().add(btnConsulta);
		}
}
