package br.univel;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Test;

public class ConexaoBancoTeste {

	private Connection c;

	@Test
	public void ConecaoBancoTeste() throws SQLException, ClassNotFoundException{
		
		c = new DaoImp().Conexao();
		
		assertNotNull(c);
	
	}
	
	@After
	public void fecharConexao() throws SQLException{
		c.close();
	}

}
