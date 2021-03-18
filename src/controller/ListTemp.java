package controller;

public class ListTemp {
	private Node first;
	private Node last;
	private int size;
	
	public ListTemp() {
		first = null;
	}
	
	
	public boolean isEmpty(){
		return first == null;
		
	}
	
	
	
	public Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	public Node getLast() {
		return last;
	}
	public void setLast(Node last) {
		this.last = last;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void insertEnd(int nItem){
		
		Node nList = new Node(nItem);
		if (first==null && last==null){
			first = nList;
			last = nList;
			
		}
		else
		{
			last.setNext(nList);
			last=nList;
			
		}
		
		size++;
		
	}
	
	public void insertBeg(int nItem){
		
		
		Node  n = new Node(nItem);	
		
		n.next = first;						
		first = n;	
		
		
	}
	
	
	
	public Node get(int posicao){
		Node atual = first;
		
		for(int i = 0; i<= posicao; i++){
			if(atual.getNext()!=null){
				atual = atual.getNext();
				
			
			}
		
			}
		return atual;
		
			
		}

		
	
	
	public void remove(String newValue){
		
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
