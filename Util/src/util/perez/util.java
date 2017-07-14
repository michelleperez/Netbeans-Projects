/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.perez;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class util {
    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);
    private Scanner teclado = new Scanner(System.in);
    private String title;
    private String description;
    private Calendar date;
    private byte number;
    private Unit unit;

    public util() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
    
    
    public void Print (String text){
        System.out.print(text);
    }

    public void Println (String text){
        System.out.println(text);
    }
    
    
    public String ReadString (String message) throws IOException{
        Print (message); // mensaje
        String str = br.readLine(); // lectura
        return str;
    }
    
    public byte ReadByte(String message,boolean allowNegatives){
        byte result = 0;
        String str;
        while(true){
            try {
                Print (message);
                str=br.readLine();
                result = Byte.parseByte(str);
                if(!allowNegatives && result <0){
                     IOException io= new IOException ("\nNegative numbers not allowed");
                     throw io;
                }
                break;
            } catch (Exception e) {
                Println("EL valor no es válido"+e.getMessage());
            }
       }
    return result;
    }
    public byte ReadByte (String message, byte min, byte max )throws IOException{
       byte result = 0;
       String str;
           while(true){
    try{
        Print(message);
        str = br.readLine();
        result=Byte.parseByte(str);
        
        if(result > max){
            IOException io = new IOException("Valor superior");
            throw io;
        }
        if(result< min){
            IOException io = new IOException("Valor inferior al límite");
        }
        break;
    }catch  (IOException | NumberFormatException  e){
        Println("El valor no es valido");
        
    }
}
       return result;
     
    }
    public char ReadChar(String message,int esp) throws IOException {
        Print(message); //Imprime el mensaje para leer el char.
        char ch;
        ch= teclado.next().charAt(esp);
        
        return ch;
        
    }
    
    public int ReadInt(String message)throws IOException{
        String str;
        int num=0;
        try {
           Print(message); //mensaje
            str = br.readLine(); //lectura
            num= Integer.parseInt(str); //transformacion
           
        } catch (IOException  | NumberFormatException e ) {
               Println("El valor no es válido");
        }
        return num;
        
    }
    
    public double ReadDouble(String message)throws IOException{
       String str;
       double dou = 0;
        try {
           Print(message); //mensaje
            str = br.readLine(); //lectura
            dou= Float.parseFloat(str); //transformacion
           
        } catch (IOException  | NumberFormatException e ) {
               Println("El valor no es válido");
        }
        return dou;
        
    }
   
    public boolean ReadBoolean(String message){
      int valid =0;  
      String str;
      boolean x=false;
      while(valid!=1 && valid!=2){
          try {
              Print(message);
              Print("\n1.SI \n2.NO \n\n Elegir opción:\t\t");
              str=br.readLine();
              valid = Integer.parseInt(str);
              if(valid ==1){
                  x=true;
              }else if(valid ==2){
                  x=false;
              }
              
          } catch (IOException |NumberFormatException e) {
              Println("El valor no es válido"+e.getMessage());
          }
      }      
      return x;
        
   }
    
    public long ReadLong(String message) throws IOException{
       String str;
       long log = 0;
        try {
           Print(message); //mensaje
            str = br.readLine(); //lectura
           log= Long.parseLong(str); //transformacion
           
        } catch (IOException  | NumberFormatException e ) {
               Println("El valor no es válido");
        }
        return log;
        
    }
    public short ReadShort(String message) throws IOException{
       String str;
       short numshort = 0;
        try {
           Print(message); //mensaje
            str = br.readLine(); //lectura
           numshort= Short.parseShort(str); //transformacion
           
        } catch (IOException  | NumberFormatException e ) {
               Println("El valor no es válido");
        }
        return numshort;
        
    }
    public float ReadFloat(String message) throws IOException{
       String str;
       float numfloat = 0;
        try {
           Print(message); //mensaje
            str = br.readLine(); //lectura
           numfloat=Float.parseFloat(str);//transformacion
           
        } catch (IOException  | NumberFormatException e ) {
               Println("El valor no es válido");
        }
        return numfloat;
        
    }
    public Calendar ReadDate(String message, String format){
        Calendar result = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String str="";
        while(true){
            try {
                Print(message);
                str= br.readLine();
                result.setTime(sdf.parse(str));
                break;
            } catch (Exception e) {
                Println("\n El valor no es válido"+e.getMessage()+"\nEl formato correecto es: "+format);
                
            }
        }
        return result;
        
    }
      public String PrintDate(Calendar date , String format){
        SimpleDateFormat fmt = new SimpleDateFormat(format);
        return fmt.format(date.getTime());
        
    }
   public int GetYear(Calendar dateBorn){
        Calendar current = Calendar.getInstance();
        int year = current.get(Calendar.YEAR) - dateBorn.get(Calendar.YEAR);
        int month = current.get(Calendar.MONTH) - dateBorn.get(Calendar.MONTH);
        int day = current.get(Calendar.DAY_OF_MONTH) - dateBorn.get(Calendar.DAY_OF_MONTH);
        
        if(month <0 || (month == 0 && day < 0)){
            year-=1;
          
        }       
         return year;
        
    }
       public int GetYearFrom(Calendar from , Calendar to){
        int result = 0;
        int year = to.get(Calendar.YEAR) - from.get(Calendar.YEAR);
        int month = to.get(Calendar.MONTH) - from.get(Calendar.MONTH);
        int day = to.get(Calendar.DAY_OF_MONTH) - from.get(Calendar.DAY_OF_MONTH);
        
        if(month <0 || (month == 0 && day ==0)){
            year--;
            result = year;
        }
        
                return result;
        
    }
      public Object ReadEnum(String title, String chooseMessage, Object[]enums) throws IOException{
        byte limit = (byte)enums.length;
        Println(title);
        String str = GetEnumValues(enums) + chooseMessage;
        byte result = ReadByte(str,( byte)1, limit);
        return enums [result-1];
    }    
    private String GetEnumValues(Object[]enums){
        String result = "";
        byte i =1;
        for(Object o : enums){
           result+=i + "." + o.toString() + "\n";
            i++;
    }return result;
       
        
    }   
    public void PrintHeader(){
    Println("=========================================================");    
    Println("\tUNIVERSIDAD DE LAS FUERZAS ARMADAS");
    Println("\t    INGENIERÍA EN SOFTWARE");
    Println("\t        PROGRAMACIÓN II");
    Println("_________________________________________________________"); 
    Println("Unidad: "+unit+"\t\tFecha: "+this.PrintDate(date,"dd/MM/yyyy"));
    Println("Título:"+title+"\t\tDeber #: "+number);
    Println("Descripción:"+description);
    Println("========================================================="); 
    }
    
    public void PrintFooter(){
    Println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    Println("\t\t Finished process");
    Println("\t ©2017 Michelle Pérez. All rights reserved ");
    Println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
