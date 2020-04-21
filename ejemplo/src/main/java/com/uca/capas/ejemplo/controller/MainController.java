package com.uca.capas.ejemplo.controller;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/informacion")
	public @ResponseBody String ejemplo() {
		String texto = "Hola mi nombre es Javier Alejandro Martínez Rivas, mi carné es 00034315,"
				+ " estudio ingeniería informatica y estoy en mi cuarto año de carrera ";
		return texto;
	}

	@RequestMapping("/fecha")
	public @ResponseBody String parametro(HttpServletRequest request)  {
	
		String param = request.getParameter("dia");
		String param2 = request.getParameter("mes");
		String param3= request.getParameter("anio");
		
		
		String fecha=param+"/"+param2+"/"+param3;
		//int i = Integer.parseInt(fecha);

		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		  String date = fecha;

		  LocalDate dt = LocalDate.parse(date, formatter);
		
        
  
        // Prints the day 
       DayOfWeek day= dt.getDayOfWeek(); 
       String resultado =day.toString();
		//date resultado=getDayOfWeek(i);
		
        if(resultado=="MONDAY") {
    	   resultado="Lunes";
    	   return "dia de la semana es : "+ resultado;
       } else if (resultado=="TUESDAY") {
    	   resultado="Martes";
    	   return "dia de la semana es : "+ resultado;
       } else if (resultado=="WENESDAY") {
    	   resultado="Miercolas";
    	   return "dia de la semana es : "+ resultado;
       } else if (resultado=="THURSDAY") {
    	   resultado="Jueves";
    	   return "dia de la semana es : "+ resultado;
       } else if (resultado=="FRIDAY") {
    	   resultado="Viernes";
    	   return "dia de la semana es : "+ resultado;
       } else if (resultado=="SATURDAY") {
    	   resultado="Sabado";
    	   return "dia de la semana es : "+ resultado;
       } else if (resultado=="SUNDAY") {
    	   resultado="Domingo";
    	   return "dia de la semana es : "+ resultado;
       } else {
    	   return "dia invalido";
       }
	
					
				}
}

		
	

