package view;

import controller.ListTemp;
import controller.Node;
import javax.swing.JOptionPane;

public class TesteTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int loc = 0,  n = 0, op = 0;
		
		ListTemp temp = new ListTemp();
		
		while (op != 9) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Selecione \n1-Status Fila \n2-Adição inicio lista \n3-Adição ao fim da lista \n4-Adição em qualquer posição \n5-Remover do final \n6-Remover Inicio \n7-Remover qualquer posição \n8-Mostrar Lista \n9-Sair  ")); 
			
			switch (op) {
				case 1:   
					if (temp.isEmpty() == true) {
						System.out.println("Lista está vazia");
					} else {
						System.out.println("Lista tem dados");					
					}
					break;
	
				case 2:
					n = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura desejada: "));
					temp.insertBeg(n);
					break;
				
				case 3:
					n = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura desejada: "));
					temp.insertEnd(n);
					break;
					
			/*	case 4:
					n = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura: "));
					pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição de inserção: "));
					temp.escolherposição(temperatura, pos);
					break;
					
				case 5:   // remove no final
//					JOptionPane.showConfirmDialog(null, "O elemento removido foi: " +temperatura2.RemoveFinal());
					System.out.println("O elemento removido foi: " +temperatura2.RemoveFinal());



					break;
					
				case 6:  // remove no inicio
					System.out.println("O elemento removido foi: " +temperatura2.RemoverInicio());
					break;
					
				case 7:  
					pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição de remoção: "));
					System.out.println("O elemento removido foi: " +temperatura2.EscolheRemover(pos));
					break;
				*/
				case 8:  
					temp.runLista();
					break;
					
				case 9:
					System.out.println("Sistema finalizado");
					break;
					
				default:
					break;
				}
			
//			temperatura = Double.parseDouble(JOptionPane.showInputDialog(null; "Informe a temperatura"));
			
} // fim while
		
		



	 // fim do maim
}  // fim da classe


		
	
		
		/*
		ListTemp lista = new ListTemp();
		
	
		
		System.out.println("-----------");
		
		
		lista.insertEnd(15);
		lista.insertEnd(25);
		lista.insertEnd(35);


	
		
		
		
		
		System.out.println(lista.getFirst());
 
		System.out.println(lista.getLast());
		System.out.println("tamanho"+lista.getSize());
		
		
		
		System.out.println(lista.getFirst());
		 
		System.out.println(lista.getLast());
		System.out.println("tamanho"+lista.getSize());
		
		System.out.println("-----------");
		lista.insertBeg(225);
		lista.insertBeg(90);
		
		
		lista.runLista();
		
		*/
		
		
	
		
		

	}


