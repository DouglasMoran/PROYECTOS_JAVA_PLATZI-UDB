
package makefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public  class Report {
    
    private String nameFile;
    private String title;
    private String content;
    private String extension;

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void makeReport(){
        
        if((getNameFile() != null) && (getTitle() != null) && (getContent() != null)){
            //Crear el archivo
            try {
                File file = new File(getNameFile() + "." + getExtension());
                FileOutputStream fos;
                fos = new FileOutputStream(file);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(outputStreamWriter);
                bw.write(getContent());
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            }
                       
            
        }else{
            System.out.println("Ingresa los datos para poder crear el archivo");
        }
    }
}
