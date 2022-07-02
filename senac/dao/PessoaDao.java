package br.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.senac.model.Pessoa;

public class PessoaDao {
	
	public void create (Pessoa pessoa) throws SQLException {
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement preparedStatement  = null;
		
		try {
			String query = "INSERT INTO Pessoas (nome, anoNascimento) VALUES (?,?);";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,  pessoa.getNome());
			preparedStatement.setInt(2,pessoa.getAnoNascimento());
			
			preparedStatement.executeUpdate();
		}
		catch(SQLException ex) {
			throw new SQLException(ex);
		}
	}
	
	public List<Pessoa> getPessoaByName(String nome) throws SQLException{
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement preparedStatement  = null;
		
		try {
			String query = "SELECT id, nome, anoNascimento FROM Pessoas WHERE NOME LIKE ?;";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, "%" + nome + "%");
			
			ResultSet rs = preparedStatement.executeQuery();
			
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			
			while(rs.next()) {
				Pessoa pessoa = new Pessoa();
				
				pessoa.setId(rs.getInt("id"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setAnoNascimento(rs.getInt("anoNascimento"));
				
				pessoas.add(pessoa);
			}
			
			return pessoas;
			
		}
		
		catch (SQLException ex) {
			throw new SQLException(ex);
			
		}
	}
}