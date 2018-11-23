
package amazonviewer;

import com.anncode.amazonviewer.model.Book;
import com.anncode.amazonviewer.model.Chapter;
import com.anncode.amazonviewer.model.Movie;
import com.anncode.amazonviewer.model.Serie;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import makefile.Report;

public class Main {
    
    public static void main(String[] args) {
        //Movie movie = new Movie("COCO", "Animation", (short)2017);
        //movie.showDate();
        showMenu();
    }
     
    public static void showMenu(){
        
        Scanner scanner = new Scanner(System.in);
        int response;
        int exit;
        do{  
        System.out.println("\t*******BIENVENIDOS AMAZON VIEWER*******\n");
        System.out.println("Escoge lo opción de lo que deseas ver:");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazine");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("0. Exit");
        response = Integer.valueOf(scanner.nextLine());
            
        switch (response){
            
            case 1:
                showMovies();
            break;
            
            case 2:
                showSeries();
            break;
            
            case 3:
                showBooks();
            break;
            
            case 4:
                showMagazines();
            break;
            
            case 5:
                makeReport();
            break;
            
            case 6:
                makeReport(new Date());
            break;
            
            case 0:
                System.exit(0);
                break;
            
            
            default:
                System.out.println("Escoge una de las opciones que se muestran en pantalla");
            break;    
             
        }
        
        } while(response != 0);
        
    }
    
    static ArrayList<Movie> movies;
    public static void showMovies() {
		int exit = 1;
		movies = Movie.makeListMovie();
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			
			for (int i = 0; i < movies.size(); i++) { //1. Movie 1
				System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).getViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
                            
                                exit = 0;
				showMenu();
			}
                        
                        if(response > 0){
                            Movie movieSelected = movies.get(response-1);
                            movieSelected.setViewed(true);
                            Date dateI = movieSelected.startToSee(new Date());

                            for (int i = 0; i < 10000; i++) {
                                    System.out.println("..........");
                            }
                            
                            //Termine de verla
                            movieSelected.stopToSee(dateI, new Date());
                            System.out.println();
                            System.out.println("Viste: " + movieSelected);
                            System.out.println("Por: " + movieSelected.getTimeViewed() + " milisegundos");
                        }
			
			
		}while(exit !=0);
		
	}
	
	public static void showSeries() {
		int exit = 1;
		ArrayList<Serie> series = Serie.makeSeriesList();
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
			
			for (int i = 0; i < series.size(); i++) { //1. Serie 1
				System.out.println(i+1 + ". " + series.get(i).getTitle() + " Visto: " + series.get(i).getViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			
			showChapters(series.get(response-1).getChapters());
			
		}while(exit !=0);
	}
	
	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int exit = 0;
		
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();
			
			
			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) { //1. Chapter 1
				System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Visto: " + chaptersOfSerieSelected.get(i).getViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showSeries();
			}
			
			Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
			chapterSelected.setViewed(true);
			Date dateI = chapterSelected.startToSee(new Date());
			
			for (int i = 0; i < 10000; i++) {
				System.out.println("..........");
			}
			
			//Termine de verla
			chapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: " + chapterSelected);
			System.out.println("Por: " + chapterSelected.getTimeViewed() + " milisegundos");
		}while(exit !=0);
	}
	
	public static void showBooks() {
		int exit = 0;
		ArrayList<Book> books= Book.makeListBook();
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
			
			for (int i = 0; i < books.size(); i++) { //1. Movie 1
				System.out.println(i+1 + ". " + books.get(i).getTitle() + " Visto: " + books.get(i).isReaded());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			
			Book bookSelected = books.get(response-1);
			bookSelected.setReaded(true);
			Date dateI = bookSelected.startToSee(new Date());
			
			for (int i = 0; i < 10000; i++) {
				System.out.println("..........");
			}
			
			//Termine de verla
			bookSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: " + bookSelected);
			System.out.println("Por: " + bookSelected.getTimeReaded() + " milisegundos");
		}while(exit !=0);
	}
	
	public static void showMagazines() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();
		}while(exit !=0);
	}
	
        public static void makeReport() {
		
		Report report = new Report();
		report.setNameFile("reporte");
		report.setExtension("txt");
		report.setTitle(":: VISTOS ::");
		String contentReport = "";
		
		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contentReport += movie.toString() + "\n";
				
			}
		}
		report.setContent(contentReport);
		report.makeReport();
		
	}
	
	public static void makeReport(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = df.format(date);
		Report report = new Report();
		
		report.setNameFile("reporte" + dateString);
		report.setExtension("txt");
		report.setTitle(":: VISTOS ::");
		String contentReport = "";
		
		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contentReport += movie.toString() + "\n";
				
			}
		}
		report.setContent(contentReport);
		report.makeReport();
	}
}
