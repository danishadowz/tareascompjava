import java.util.ArrayList; 
import java.util.Comparator; 
import java.util.List; 

public class act13{
	
	private List<String> lista; 
	
	public act13() {
		lista = new ArrayList<>(); 
		lista.add("Hola"); 
		lista.add("Adios"); 
		lista.add("Perro"); 
		lista.add("Gato"); 
		lista.add("Lapiz"); 
		lista.add("Celular"); 
		lista.add("Computadora"); 
		lista.add("Silla");
		lista.add("Mesa"); 
		lista.add("Taza"); 
	}
	
	public void ordenarLongAnn() {
		lista.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length()); 
			}
		});
	}
	
	public void ordenarLongLamb() {
		lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length() ));
	}
	
	public void ordenarLongRef() {
		lista.sort(Comparator.comparingInt(String::length));
	}
	
	public void ordenarAlfAnn() {
		lista.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}
	
	public void ordenarAlfLamb() {
		lista.sort((s1, s2) -> s1.compareTo(s2)); 
	}
	
	public void ordenarAlfRef() {
		lista.sort(Comparator.naturalOrder());
	}
	
	public static void main(String[] args) {
		act13 ejemploList = new act13();
		
		System.out.println("Lista sin ordenar: " + ejemploList.lista);
		ejemploList.ordenarLongAnn();
		System.out.println("Orden por Longitud de clase anonima: " + ejemploList.lista);
		ejemploList.ordenarLongLamb(); 
		System.out.println("Orden por Longitud con Lambda" +ejemploList.lista);
		ejemploList.ordenarLongRef(); 
		System.out.println("Orden por longitud con método de referencia" + ejemploList.lista);
		ejemploList.ordenarAlfAnn(); 
		System.out.println("Orden alfabetico con clase anonima" + ejemploList.lista);
		ejemploList.ordenarAlfLamb(); 
		System.out.println("Orden alfabetico con Lambda" + ejemploList.lista);
		ejemploList.ordenarAlfRef();
		System.out.println("Orden alfabetico con metodo de referencia" +ejemploList.lista);
		
		
	}
}