package view;

import controller.ListTemp;
import controller.Node;
import javax.swing.JOptionPane;

public class TesteTemp {

	public static void main(String[] args) {

		int loc = 0, n = 0, opcao = 0;

		ListTemp temp = new ListTemp();

		while (opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					" *********Temperatura********** \n1-Estado da Fila \n2-Adi��o inicio lista \n3-Adi��o ao fim da lista \n4-Adi��o em qualquer posi��o \n5-Remover do final \n6-Remover Inicio  \n7-Mostrar Lista \n00-Sair  "));

			switch (opcao) {
			case 1:
				if (temp.isEmpty() == true) {
					System.out.println("Lista est� vazia");
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

			case 4:
				n = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura: "));
				loc = Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o de inser��o: "));
				temp.insertP(n, loc);
				break;

			case 5:

				System.out.println("O elemento removido no fim foi: " + temp.removeEnd());

				break;

			case 6:
				System.out.println("O elemento removido no in�cio foi: " + temp.removeBeg());
				break;

			
			case 7:
				temp.runLista();
				break;

			case 00:
				System.out.println("Sistema finalizado");
				break;

			default:
				break;
			}

		}

	}

}
