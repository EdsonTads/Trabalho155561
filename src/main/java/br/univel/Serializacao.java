package br.univel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializacao<T> {
	
	public void serializar(T Object) throws FileNotFoundException, IOException{
		
		File file = null;
		String classe = Object.getClass().getSimpleName();
		
		System.out.println(classe);
		if(classe.equalsIgnoreCase("ContainerPessoa")){
			file = new File("listadeclientes.dat");
		}else if(classe.equalsIgnoreCase("ContainerProduto")){
			file = new File("listadeprodutos.dat");
		}else if(classe.equalsIgnoreCase("ContainerVenda")){
			file = new File("listadevendas.dat");
		}else{
			System.out.println("Classe não implementada na função de serialização!");
		}
		
		try(FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject((T) Object);
			
		}catch(FileNotFoundException e){
			
			e.printStackTrace();
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}
	}
}	
