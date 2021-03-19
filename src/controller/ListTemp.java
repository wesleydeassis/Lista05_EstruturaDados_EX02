package controller;

import javax.swing.JOptionPane;

public class ListTemp {
	private Node first;
	private Node last;
	private static int size;
	
	public ListTemp() {
		first = null;
	}
	
	
	public boolean isEmpty(){
		return first == null;
		
	}
	
	
	
	

	
	public void insertEnd(int nItem){
		
		
		if (first==null && last==null){
			Node nNode = new Node(nItem);
			first = nNode;
			last = nNode;
			
		}
		else
		{
			
			Node aux = first;	
			
			while (aux.next != null) {		
				aux = aux.next;				
			} 

			Node nNode = new Node(nItem);				
			aux.next = nNode;	
			
			
		}
		
		size++;
		
	}
	
	public void insertBeg(int nItem){
		
		
		Node  nNode = new Node(nItem);	
		
		nNode.next = first;						
		first = nNode;	
		
		
	}
	
	public int removeBeg(){
		
		int removed=0;
	
	if (first == null) {
		System.out.println("A Lista está vazia");
	} 
	else {
		removed = first.getItem();			
		first = first.next;			
	} 
	return removed;
	}
	
	
	public int removeEnd(){
		int removed = 0;								
		if (first == null ) {
			JOptionPane.showConfirmDialog(null, "A não tem elementos");
		}
		else {
			if (first.next == null) {			
				removed = first.getItem();				
				first = null;					
			} 
			else {
				Node aux1 = first, aux2 = first;
				
				while (aux1.next != null) {  
					aux2 = aux1;			
					aux1 = aux1.next;		
				} 
				
				removed = aux1.getItem();				
				aux2.next = null;			
			} 
		} 
		return removed;
	}
	
	
	public int removeAny (int position) {
		
		Node aux1, aux2;
		aux1 = first;
		aux2 = first.next;
		int ret;
		
		while (true){
			
			if (aux1.next.getItem() != position) {
				
				aux1 = aux1.next;
				aux2 = aux2.next;
				
			} else {
				aux1 = aux1.next;
				aux2 = aux2.next;
				aux1.next = aux2.next;
				;
				
			}
			ret = aux2.getItem();
			return ret;
		}

	}
	
	
	public Node get(int position){
		Node current = first;
		
		for(int i = 0; i<= position; i++){
			if(current.getNext()!=null){
				current = current.getNext();
				
			
			}
		
			}
		return current;
		
			
		}

		
	public void insertP(int nItem, int pos){
		Node nov = new Node(nItem);
		Node aux = first;
		
		if(pos==size){
			insertEnd(nItem);
		}
		else
			if(pos==0){
				insertBeg(nItem);
		}
			else{
				
				for(int i= 0; i< pos-1; i++){
					aux = aux.getNext();
				}
				nov.setNext(aux.getNext());
				aux.setNext(nov);
				aux = nov;
				
			}
			size++;
		
		

		
		
	}
	
	


	public void runLista() {
		if (first == null) {
			System.out.println("Lista vazia");
		} 
		else {
			Node aux = first;	
			
			while (aux != null) {

				System.out.println(aux.getItem());
				aux = aux.getNext();
			}
		} 
		System.out.println("---------------");
	} 
	
	
	
	

}
